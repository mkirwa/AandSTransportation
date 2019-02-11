package aands.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
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
		String sql ="SELECT idAdmin, Name, Address, PhoneNumber, Race, CountryofOrigin, DrivingLicense,EmergencyName, EmergencyPhone, Username, Password, Email, Role, LoginStatus FROM Admin;";
		List<Admin> list = namedParameterJdbcTemplate.query(sql, getSqlParameterByModel, rowMapper);
		return null;
	}

	private SqlParameterSource getSqlParameterByModel(Admin Admin) {
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		
		return paramSource;
	}
	
	private static final class AdminMapper implements RowMapper<Admin>{
		
		public Admin mapRow(ResultSet rs, int rowNum)throws SQLException{
			Admin admin = new Admin();
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
