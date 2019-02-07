package aands.model;

public class Admin {

	private Integer id;
	private String name;
	private String address;
	private String emailAddress;
	private Integer phoneNumber;
	private String race;
	private String countryOfCitizenship; 
	private Integer drivingLicenseNo;
	private String emergencyContactName;
	private Integer emergencyContactNumber;
	private String username;
	private String password;
	private Integer role;
	private Integer loginStatus;
	
	
	public Admin() {
		super();
		
	}
	public Admin(Integer id) {
		super();
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getCountryOfCitizenship() {
		return countryOfCitizenship;
	}
	public void setCountryOfCitizenship(String countryOfCitizenship) {
		this.countryOfCitizenship = countryOfCitizenship;
	}
	public Integer getDrivingLicenseNo() {
		return drivingLicenseNo;
	}
	public void setDrivingLicenseNo(Integer drivingLicenseNo) {
		this.drivingLicenseNo = drivingLicenseNo;
	}
	public String getEmergencyContactName() {
		return emergencyContactName;
	}
	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
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
