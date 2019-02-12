package aands.model;

public class Admin {

	private Integer idAdmin;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private String address;
	private String emailAddress;
	private Integer phoneNumber;
	private String race;
	private String Citizenship; 
	private Integer DrivingLicense;
	private String EmergencyContactFirstName;
	private String EmergencyContactLastName;
	private Integer emergencyContactNumber;
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
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
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
	public Integer getEmergencyContactNumber() {
		return emergencyContactNumber;
	}
	public void setEmergencyContactNumber(Integer emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
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
