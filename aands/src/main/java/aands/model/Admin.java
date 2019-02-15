package aands.model;

//This is a POJO class with setters and getters
//As soon as you start adding methods that operate on
//points, like vector addition or complex multiplication
//you no longer have a POJO.
//Properties of POJO
//1. All properties must public setter and getter methods
//2. All instance variables should be private
//3. Should not Extend prespecified classes.
//4. Should not Implement prespecified interfaces.
//5. Should not contain prespecified annotations.
//6. It may not have no argument constructor

public class Admin {

	private Integer idAdmin;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private String Address;
	private String Email;
	private Integer PhoneNumber;
	private String Race;
	private String Citizenship; 
	private Integer DrivingLicense;
	private String EmergencyContactFirstName;
	private String EmergencyContactLastName;
	private Integer EmergencyContactPhoneNumber;
	private String Username;
	private String Password;
	private Integer Role;
	private Integer LoginStatus;
	
	public Admin() {
		super();
		
	}
	public Admin(Integer idAdmin) {
		super();
		this.idAdmin = idAdmin;
	}
	
	public Integer getIdAdmin() {
		return idAdmin;
	}
	
	public void setId(Integer id) {
		this.idAdmin = idAdmin;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getmiddleInitial() {
		return middleInitial;
	}
	public void setmiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}
	
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	public Integer getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(Integer PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}
	public String getRace() {
		return Race;
	}
	public void setRace(String Race) {
		this.Race = Race;
	}
	public String getCitizenship() {
		return Citizenship;
	}
	public void setCitizenship(String Citizenship) {
		this.Citizenship = Citizenship;
	}
	public Integer getDrivingLicense() {
		return DrivingLicense;
	}
	public void setDrivingLicense(Integer drivingLicenseNo) {
		this.DrivingLicense = drivingLicenseNo;
	}
	public String getEmergencyContactFirstName() {
		return EmergencyContactFirstName;
	}
	public void setEmergencyContactFirstName(String emergencyContactFirstName) {
		this.EmergencyContactFirstName = emergencyContactFirstName;
	}
	public String getEmergencyContactLastName() {
		return EmergencyContactLastName;
	}
	public void setEmergencyContactLastName(String emergencyContactLastName) {
		this.EmergencyContactLastName = emergencyContactLastName;
	}
	public Integer getEmergencyContactPhoneNumber() {
		return EmergencyContactPhoneNumber;
	}
	public void setEmergencyContactPhoneNumber(Integer EmergencyContactPhoneNumber) {
		this.EmergencyContactPhoneNumber = EmergencyContactPhoneNumber;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String Username) {
		this.Username = Username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String Password) {
		this.Password = Password;
	}
	public Integer getRole() {
		return Role;
	}
	public void setRole(Integer Role) {
		this.Role = Role;
	}
	public Integer getLoginStatus() {
		return LoginStatus;
	}
	public void setLoginStatus(Integer LoginStatus) {
		this.LoginStatus = LoginStatus;
	}
	
	
}
