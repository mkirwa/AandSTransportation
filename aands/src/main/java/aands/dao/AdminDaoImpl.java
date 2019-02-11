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

@Repository
public class AdminDaoImpl implements AdminDao{

	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Autowired
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) throws DataAccessException {
		
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	
	}
	
	public List<Admin> listAllAdmins() {
		String sql ="SELECT idAdmin, Address, PhoneNumber, Race, Citizenship, DrivingLicense,EmergencyName, EmergencyPhone, Username, Password, Email, Role, LoginStatus, lastName, firstName, middleInitial FROM Admin;";
		List<Admin> list = namedParameterJdbcTemplate.query(sql, getSqlParameterByModel(null), new AdminMapper());
		return list;
	}

	private SqlParameterSource getSqlParameterByModel(Admin Admin) {
		
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
