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
	//Also, there is a place where the application context is bootstrapped and all beans - autowired.
	//Autowiring happens by placing an instance of one bean into the desired field in an instance of
	//another bean. Both classes should be beans, i.e. they should be defined to live in the application context.

	//What is "living" in the application context? This means that the context instantiates the objects,
	//not you. I.e. - you never make new AdminServiceImpl() - the container finds each
	//injection point and sets an instance there.
	@Autowired
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	public List<Admin> listAllAdmins() {
		// TODO Auto-generated method stub
		return adminDao.listAllAdmins();
	}

	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.addAdmin(admin);
		
	}

	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.updateAdmin(admin);
		
	}

	public void deleteAdmin(int idAdmin) {
		// TODO Auto-generated method stub
		adminDao.deleteAdmin(idAdmin);
	}

	public Admin findAdminbyId(int idAdmin) {
		// TODO Auto-generated method stub
		return adminDao.findAdminbyId(idAdmin);
		
	}

}
