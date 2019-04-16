
package aandsspring.service;

import java.util.List;
import aands.model.Admin;

public interface AdminService {

	public List listAllAdmins();
	
	public void addAdmin(Admin admin);
	
	public void updateAdmin(Admin admin);
	
	public void deleteAdmin(int idAdmin);
	
	public Admin findAdminbyId(int idAdmin);
}
