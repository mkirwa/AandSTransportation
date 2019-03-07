package aands.dao;

import java.util.List;

import aands.model.Admin;
//specifies what the class must do and not how
//the blue print of the class
//Used to achieve total abstraction and loose coupling
public interface AdminDao {
		
	public List listAllAdmins();
	
	public void addAdmin(Admin admin);
	
	public void updateAdmin(Admin admin);
	
	public void deleteAdmin(int idAdmin);
	
	public Admin findAdminbyId(int idAdmin);
	
}
