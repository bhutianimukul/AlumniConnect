package beanclasses;

public class JobBean {
String name=null;
String jobtitle=null;
String role=null;
String salary=null;
String experience=null;
String location=null;
String link=null;
String email;
public JobBean(){
	name=null;
	jobtitle=null;
 role=null;
salary=null;
 experience=null;
 location=null;
	 link=null;
	 email=null;
}

public void setName(String string) {
	name=string;
	
}

public void setEmail(String string) {
	email=string;
	
}

public void setJobTitle(String string) {
	// TODO Auto-generated method stub
	jobtitle=string;
}

public void setRole(String string) {
	// TODO Auto-generated method stub
	role=string;
}

public void setSalary(String string) {
	// TODO Auto-generated method stub
	salary=string;
}

public void setLocation(String string) {
	// TODO Auto-generated method stub
	location=string;
}

public void setLink(String string) {
	// TODO Auto-generated method stub
	link=string;
}

public String getName() {
	// TODO Auto-generated method stub
	return name;
}


public String getJobTitle() {
	// TODO Auto-generated method stub
	return jobtitle;
}


public String getRole() {
	// TODO Auto-generated method stub
	return role;
}


public String getSalary() {
	// TODO Auto-generated method stub
	return salary;
}



public String getEmail() {
	// TODO Auto-generated method stub
	return email;
}


public String getLocation() {
	// TODO Auto-generated method stub
	return location;
}


public String getLink() {
	// TODO Auto-generated method stub
	return link;
}
}
