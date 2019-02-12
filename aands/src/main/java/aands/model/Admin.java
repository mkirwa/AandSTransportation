package aands.model;

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
	private String username;
	private String password;
	private Integer role;
	private Integer loginStatus;
	
	
	public Admin() {
		super();
		
	}
	public Admin(Integer idAdmin) {
		super();
		this.idAdmin = idAdmin;
	}
	
	public Integer getId() {
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
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}
	public Integer getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(Integer loginStatus) {
		this.loginStatus = loginStatus;
	}
	
	
}
