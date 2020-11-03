package beanclasses;

public class Bean {
	String name;
	String email;
	String phone;
	
	String field;
	String dep;

public Bean(){
	name=null;
	email=null;
		 phone=null;
		field=null;
		 dep=null;	
}

public void setName(String string) {
	name=string;
	
}

public void setEmail(String string) {
	// TODO Auto-generated method stub
	email=string;
}

public void setPhone(String string) {
	// TODO Auto-generated method stub
	phone=string;
}

public void setField(String string) {
	// TODO Auto-generated method stub
	field=string;
}

public void setDep(String string) {
	// TODO Auto-generated method stub
	dep=string;
}

public String getName() {
	// TODO Auto-generated method stub
	return name;
}

public Object getPhone() {
	// TODO Auto-generated method stub
	return phone;
}
public Object getEmail() {
	// TODO Auto-generated method stub
	return email;
}
public Object getField() {
	// TODO Auto-generated method stub
	return field;
}
public Object getDep() {
	// TODO Auto-generated method stub
	return dep;
}

}
