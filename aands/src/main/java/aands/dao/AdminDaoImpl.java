package aands.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import aands.model.Admin;

//@Repository is a marker for any class that fulfills a role or a stereotype(also known as 
//Data Access Objects or DAO) of a repository
@Repository
public class AdminDaoImpl implements AdminDao{
	
	//template class with basic set of JDBC operations allowing the use of 
	//named parameters rather than the traditional '?' placeholders
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	//@Autowired annotation provides more fine-grained control over where and how autowiring should be accomplished.
	// Tells the application context to inject an instance of NamedParameterJdbcTemplate here
	@Autowired
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) throws DataAccessException {
		
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	
	}
	
	//a method that returns a list after quering the database
	public List<Admin> listAllAdmins() {
		String sql ="SELECT idAdmin, Address, PhoneNumber, Race, Citizenship, DrivingLicense,EmergencyContactFirtName, EmergencyContactLastName, EmergencyContactPhone, Username, Password, Email, Role, LoginStatus, lastName, firstName, middleInitial FROM Admin;";
		List<Admin> list = namedParameterJdbcTemplate.query(sql, getSqlParameterByModel(null), new AdminMapper());
		return list;
	}
	
	//sql parameterSource is an implementation that holds a given map of parameters
	//This class is intended for passing in a simple Map of parameter values to the
	//methods of the NamedParameterJdbcTemplate class.
	private SqlParameterSource getSqlParameterByModel(Admin Admin) {
		
		//Create an empty MapSqlParameterSource, with values to be added.
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		
		return paramSource;
	}
	
	private static final class AdminMapper implements RowMapper<Admin> {
		
		public Admin mapRow(ResultSet rs, int rowNum)throws SQLException{
			Admin admin = new Admin();
			admin.setId(rs.getInt("idAdmin"));
			admin.setfirstName(rs.getString("firstName"));
			admin.setmiddleInitial(rs.getString("middleInitial"));
			admin.setlastName(rs.getString("lastName"));
			admin.setAddress(rs.getString("Address"));
			admin.setPhoneNumber(rs.getInt("PhoneNumber"));
			admin.setRace(rs.getString("Race"));
			admin.setCitizenship(rs.getString("Citizenship"));
			admin.setDrivingLicense(rs.getInt("DrivingLicense"));
			admin.setEmergencyContactFirstName(rs.getString("EmergencyContactFirstName"));
			admin.setEmergencyContactLastName(rs.getString("EmergencyContactLastName"));
			admin.setEmergencyContactPhoneNumber(rs.getInt("EmergencyContactPhoneNumber"));
			admin.setEmail(rs.getString("Email"));
			admin.setRole(rs.getInt("Role"));
			admin.setLoginStatus(rs.getInt("LoginStatus"));
			admin.setUsername(rs.getString("Username"));
			admin.setPassword(rs.getString("Password"));
			return admin;
		}
	}
	
	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	public Admin findAdminbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
