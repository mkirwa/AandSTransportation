package aandsspring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import aands.model.Admin;
//Service annotation is used in your service layer and annotates
//classes that perform service tasks, often you don't use it
//but in many case you use this annotation to represent a best practice.
//For example, you could directly call a DAO class to persist 
//an object to your database but this is horrible. It is pretty good to
//call a service class that calls a DAO. This is a good thing to 
//perform the separation of concerns pattern.
@Service
public class AdminServiceImpl implements AdminService{

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
