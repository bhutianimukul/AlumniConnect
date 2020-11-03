package beanclasses;

public class RegBean {

	String name;
	String email;
	String phone;
	String gender;
	String year;
	String field;
	String depart;
	String placement;
	String company;
	String password;
	public RegBean(){
	name=null;
	email=null;
		 phone=null;
		 gender=null;
		 year=null;
		field=null;
		 depart=null;
		placement=null;
		company=null;
		password=null;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public String getPlacement() {
		return placement;
	}
	public void setPlacement(String placement) {
		this.placement = placement;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		this.password= password;
		
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

}
