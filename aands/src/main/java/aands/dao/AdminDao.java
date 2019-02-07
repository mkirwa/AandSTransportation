package aands.dao;

import java.util.List;
import aands.model.Admin;

public interface AdminDao {
		
	public List <Admin> listAllAdmins();
	
	public void addAdmin(Admin admin);
	
	public void updateAdmin(Admin admin);
	
	public void deleteAdmin(Admin admin);
	
	public Admin findAdminbyId(int id);
	
}
