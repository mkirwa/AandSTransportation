package aandsspring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import aands.model.Admin;
//used to mark a class as a service provider
//used with classes that provide some functionalites
//@service is a specialization of @Component annotation
//can be applied only to classes
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
