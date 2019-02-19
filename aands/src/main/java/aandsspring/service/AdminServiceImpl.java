package aandsspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aands.dao.AdminDao;
import aands.model.Admin;
//used to mark a class as a service provider
//used with classes that provide some functionalites
//@service is a specialization of @Component annotation
//can be applied only to classes
@Service
public class AdminServiceImpl implements AdminService{

	
	AdminDao adminDao;
	
	// Tells the application context to inject an instance of AdminService here
	//All spring beans are managed - they live inside a
	//container called "application context"
	//each application has an entry to that context. Web applications have a servlet as this entry
	//
	@Autowired
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	public List<Admin> listAllAdmins() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAdmin(int idAdmin) {
		// TODO Auto-generated method stub
		
	}

	public Admin findAdminbyId(int idAdmin) {
		// TODO Auto-generated method stub
		return null;
	}

}
