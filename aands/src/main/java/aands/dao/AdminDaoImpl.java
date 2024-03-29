package aands.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	
	}
	
	//a method that returns a list after querying the database
	public List listAllAdmins() {
		String sql ="SELECT idAdmin, Address, PhoneNumber, Race, Citizenship, DrivingLicense,EmergencyContactFirtName, EmergencyContactLastName, EmergencyContactPhone, Username, Password, Email, Role, LoginStatus, lastName, firstName, middleInitial FROM Admin;";
		List list = namedParameterJdbcTemplate.query(sql, getSqlParameterByModel(null), new AdminMapper());
		return list;
	}
	
	//sql parameterSource is an implementation that holds a given map of parameters
	//This class is intended for passing in a simple Map of parameter values to the
	//methods of the NamedParameterJdbcTemplate class.
	private SqlParameterSource getSqlParameterByModel(Admin admin) {
		
		//Create an empty MapSqlParameterSource, with values to be added.
		MapSqlParameterSource parameterSource = new MapSqlParameterSource();
		
		if(admin!=null) {
			parameterSource.addValue("idAdmin",admin.getIdAdmin());
			parameterSource.addValue("firstname",admin.getfirstName());
			parameterSource.addValue("middleInitial",admin.getmiddleInitial());
			parameterSource.addValue("lastname",admin.getlastName());
			parameterSource.addValue("Address",admin.getAddress());
			parameterSource.addValue("PhoneNumber",admin.getPhoneNumber());
			parameterSource.addValue("Race",admin.getRace());
			parameterSource.addValue("Citizenship",admin.getCitizenship());
			parameterSource.addValue("DrivingLicense",admin.getDrivingLicense());
			parameterSource.addValue("EmergencyContactFirstName",admin.getEmergencyContactFirstName());
			parameterSource.addValue("EmergencyContactLastName",admin.getEmergencyContactLastName());
			parameterSource.addValue("EmergencyContactPhoneNumber",admin.getEmergencyContactPhoneNumber());
			parameterSource.addValue("Email",admin.getEmail());
			parameterSource.addValue("Role",admin.getRole());
			parameterSource.addValue("LoginStatus",admin.getLoginStatus());
			parameterSource.addValue("Username",admin.getUsername());
			parameterSource.addValue("Password",admin.getPassword());
		}
		
		return parameterSource;
	}
	
	//Rowmapper is used by JDBCTemplate for mapping rows 
	private static final class AdminMapper implements RowMapper<Admin>{
		
		
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
		String sql = "INSERT INTO Admin(Address, PhoneNumber, Race, Citizenship, DrivingLicense,EmergencyContactFirtName, EmergencyContactLastName, EmergencyContactPhoneNumber, Username, Password, Email, Role, LoginStatus, lastName, firstName, middleInitial) VALUES (:Address, :PhoneNumber, :Race, :Citizenship, :DrivingLicense, :EmergencyContactFirtName, :EmergencyContactLastName, :EmergencyContactPhone, :Username, :Password, :Email, :Role, :LoginStatus, :lastName, :firstName, :middleInitial)";
		
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(admin));
	}

	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		String sql = "UPDATE Admin SET Address =:Address, PhoneNumber =:PhoneNumber, Race =:Race, Citizenship =:Citizenship, DrivingLicense =:DrivingLicense, EmergencyContactFirtName =:EmergencyContactFirstName, EmergencyContactLastName =:EmergencyContactLastName , EmergencyContactPhoneNumber :=EmergencyContactPhoneNumber, Username =:Username, Password =:Password, Email, Role =:Role, LoginStatus :=LoginStatus, lastName :=lastName, firstName :=firstName, middleInitial =:middleInitial WHERE idAdmin=idAdmin";
		
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(admin));
	}

	public void deleteAdmin(int idAdmin) {
		// TODO Auto-generated method stub
		String sql = "DELETE from Admin WHERE idAdmin =:idAdmin";
		
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(new Admin(idAdmin)));
	}
	public Admin findAdminbyId(int idAdmin) {
		// TODO Auto-generated method stub
		String sql= "SELECT * FROM admin WHERE idAmin =:idAdmin";
		
		return namedParameterJdbcTemplate.queryForObject(sql, getSqlParameterByModel(new Admin(idAdmin)), new AdminMapper());
	}



}
