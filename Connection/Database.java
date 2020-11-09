package Connection;

import java.io.IOException;
import java.net.UnknownHostException;
import java.sql.Connection;
import student.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.email.durgesh.Email;

import ALumni.Alumni_Reg;
import beanclasses.JobBean;
import beanclasses.RegBean;
import package1.EmailValidation;
import package1.Front;

public class Database {
	 Connection con=null;
     Statement st=null;
     ResultSet rs=null;
public boolean signin(String email1, String password1 ) throws SQLException {
	try {
	String s="Select * from Alumni_login where email='"+email1+"'and password='"+password1+"'";
	EmailValidation ed=new EmailValidation();
	if(ed.isvalid(email1)==false||ed.passisvalid(password1)==false){
		 JOptionPane.showMessageDialog(null,"Error in email or PasswordField");
		
	}else {
 
 st=con.createStatement();
 rs=st.executeQuery(s);
 

 if(rs.next()) {
	 JOptionPane.showMessageDialog(null,"LOGIN SUCCESFULL\nPlease Check Your Email Inbox for OTP verification");
	return true;
	  
	  }
 return false;}}
	catch(Exception e) { e.printStackTrace();
	  
	  }
	st.close();
	con.close();
	return false;
	
}
public boolean st_signin(String email1, String password1 ) throws SQLException {
	try {

	
	String s="Select * from student_login where email='"+email1+"'and password='"+password1+"'";
	
	EmailValidation ed=new EmailValidation();
	if(ed.isvalid(email1)==false||ed.passisvalid(password1)==false){
		 JOptionPane.showMessageDialog(null,"Error in email or PasswordField");
		
	}else {
 
 st=con.createStatement();
 rs=st.executeQuery(s);
 

 if(rs.next()) {
	 JOptionPane.showMessageDialog(null,"LOGIN SUCCESFULL\nPlease Check Your Email Inbox for OTP verification");
	return true;
	  
	  }
 return false;}}
	catch(Exception e) { e.printStackTrace();
	  
	  }
	st.close();
	con.close();
	return false;
	
}

public void Name(RegBean rg) throws SQLException {
	 String s="Select * from alumni_reg where email=? ";
				PreparedStatement st1=con.prepareStatement(s);
				st1.setString(1,rg.getEmail());
				
				

			ResultSet rs=st1.executeQuery();
			rs.next();
			rg.setName(rs.getString("name"));
}
public void signup(String email1, String password1, String repass, int choice) throws SQLException, UnknownHostException, IOException {
	EmailValidation ed=new EmailValidation();

	if(email1.trim().isEmpty() ||choice==99)       {
		  JOptionPane.showMessageDialog(new JFrame(),"Values required");  
	}
	else if(ed.isvalid(email1)==false||ed.passisvalid(password1)==false) {
		JOptionPane.showMessageDialog(new JFrame(),"email and password should be in correct format\n email:abc@abc.com\npassword should contain atleast 1 digit,1 lowercase,1 uppercase and 1 special symbol\nlength 8-20");  
	}
	else if(!password1.equals(repass)){
		 JOptionPane.showMessageDialog(new JFrame(),"PASSWORD DO NOT MATCH");  
	}

	else {
	        // TODO add your handling code here:
	        
	if(choice==1) {
		 String s="insert into ALumni_login values (?, ?) ";
		fun(email1,password1,s);
		new Alumni_Reg().setVisible(true);
		
	  
	
	
}else if(choice==0) {
	String s="insert into student_login values (?, ?) ";
	fun(email1,password1,s);
	con.close();
	new Student_Reg().setVisible(true);
	
	
}}}
public void alumni_reg(RegBean rg) throws SQLException {
	 String s="insert into Alumni_Reg values (?, ?,?,?,?,?,?,?,?) ";

		PreparedStatement st=con.prepareStatement(s);
		st.setString(2, rg.getEmail().toLowerCase());
		st.setString(1, rg.getName());
		st.setString(3, rg.getPhone());
        st.setString(4, rg.getGender());
		st.setString(5, rg.getYear());
		st.setString(6, rg.getField());
		st.setString(7, rg.getDepart());
		st.setString(8, rg.getPlacement());
		st.setString(9, rg.getCompany());
st.executeUpdate();
System.out.println("Inserted successfully");
st.close();
con.close();

}

public void get_password(RegBean rg) throws SQLException {
	String s="Select * from alumni_login where email=? ";
	PreparedStatement st1=con.prepareStatement(s);
	st1.setString(1,rg.getEmail());

ResultSet rs=st1.executeQuery();
rs.next();
rg.setPassword(rs.getString("password"));

}
public void update_password(RegBean rg,int choice) throws SQLException {
	String s=null;
	if(choice==0) {
	s="UPDATE alumni_login SET password = ? WHERE email = ?";
	}else{ s="UPDATE student_login SET password = ? WHERE email = ?";}
		PreparedStatement st1=con.prepareStatement(s);
	
	st1.setString(1,rg.getPassword());
	st1.setString(2,rg.getEmail());
st1.executeUpdate();

}
public void get_password_st(RegBean rg) throws SQLException {
	String s="Select * from student_login where email=? ";
	PreparedStatement st1=con.prepareStatement(s);
	st1.setString(1,rg.getEmail());

ResultSet rs=st1.executeQuery();
rs.next();
rg.setPassword(rs.getString("password"));

}
public void student_profile(RegBean rg) throws SQLException {
    
try{ 
	String s="Select * from student_reg where email=? ";
	PreparedStatement st1=con.prepareStatement(s);
	st1.setString(1,rg.getEmail());
	
	

ResultSet rs=st1.executeQuery();
rs.next();
rg.setName(rs.getString("name"));
rg.setPhone(rs.getString("phone"));
rg.setEmail(rs.getString("email"));

rg.setYear(rs.getString("year"));
rg.setCompany(rs.getString("company"));
st1.close();
con.close();
  }
catch(Exception e){
  e.printStackTrace();
  
}
}


public void alumni_profile(RegBean rg) throws SQLException {
    
try{ 
	String s="Select * from alumni_reg where email=? ";
	PreparedStatement st1=con.prepareStatement(s);
	st1.setString(1,rg.getEmail());
	
	

ResultSet rs=st1.executeQuery();
rs.next();
rg.setName(rs.getString("name"));
rg.setPhone(rs.getString("phone"));
rg.setEmail(rs.getString("email"));
rg.setPlacement(rs.getString("placement"));
rg.setYear(rs.getString("year"));
rg.setCompany(rs.getString("company"));
st1.close();
con.close();
  }
catch(Exception e){
  e.printStackTrace();
  
}
}
public void get_name(RegBean rg,String email,int choice) throws SQLException {
	String s=null;
	if(choice==0) {
	 s="select * from Alumni_Reg where email= ?";
	}else{s="select * from student_reg where email= ?";}
		PreparedStatement st=con.prepareStatement(s);
	
		st.setString(1, email.toLowerCase());

ResultSet rs=st.executeQuery();
rs.next();
rg.setName(rs.getString("name"));
	
}



public void student_reg(RegBean rg) throws SQLException {
	System.out.println("HELLO");
	 String s="insert into Student_Reg values (?, ?,?,?,?,?,?,?) ";

		PreparedStatement st=con.prepareStatement(s);
		st.setString(2, rg.getEmail().toLowerCase());
		st.setString(1, rg.getName());
		st.setString(3, rg.getPhone());
        st.setString(4, rg.getGender());
		st.setString(5, rg.getYear());
		st.setString(6, rg.getField());
		st.setString(7, rg.getDepart());
		st.setString(8, rg.getCompany());
st.executeUpdate();
System.out.println("Inserted successfully");
st.close();
con.close();

}

	private void fun(String email1, String password1, String s) throws UnknownHostException, IOException {
		try{ 
			
			PreparedStatement st=con.prepareStatement(s);
			st.setString(1, email1.toLowerCase());

			st.setString(2, password1);

			int count=st.executeUpdate();
			System.out.println(count+"rows affected");

			//System.out.println(count1);
			st.close();
			
			


			
			 }
			catch(Exception e){
				 JOptionPane.showMessageDialog(null,"USER ACCOUNT ALREADY EXIST \nPLEASE SIGNIN");
				new Front().setVisible(true);
			 System.exit(1);
			 
			}
}
	public Database() throws SQLException{
		
		  String url="jdbc:mysql://localhost:3306/project"; String name="root"; String
		  pass="9034";
		 
	
          con=DriverManager.getConnection(url,name,pass);
	}
	public ArrayList<String[]> search_fun(RegBean rg,int choice) throws SQLException {
		String s=null;
		if(choice==1) {
			 s= "Select * from alumni_reg where name=?";
		}else if(choice==0) {
			 s= "Select * from student_reg where name=?";
		}
		PreparedStatement st1=con.prepareStatement(s);
		st1.setString(1,rg.getName());
		ArrayList <String []>l=new ArrayList<>();
		ResultSet rs=st1.executeQuery();
		while(rs.next()) {
			String arr[] =new String[5]; 
			arr[0]=rs.getString("name");
			arr[1]=rs.getString("phone");
			arr[2]=rs.getString("email");
			arr[3]=rs.getString("field");
			arr[4]=rs.getString("dep");
			l.add(arr);
			
		}st1.close();
		con.close();
		return l;
		
	}
	public void Alumnijob(JobBean jb) throws SQLException {
		String s= "Insert into job values (?,?,?,?,?,?,? )";
		PreparedStatement st1=con.prepareStatement(s);
		st1.setString(1,jb.getName());
		st1.setString(2,jb.getJobTitle());
		st1.setString(3,jb.getRole());
		st1.setString(4,jb.getSalary());
		
		st1.setString(5,jb.getLocation());
		st1.setString(6,jb.getLink());
		st1.setString(7,jb.getEmail());
		st1.executeUpdate();
		JOptionPane.showMessageDialog(new JFrame(),"JOB POSTED");
	}
	public ArrayList<ArrayList<String>> Studentjob(JobBean jb) throws SQLException {
		//String s= "Select * from  job where jobtitle=?  and    role=? ";
		String s="Select * from job where jobtitle='"+jb.getJobTitle()+"'and role='"+jb.getRole()+"'";
		//PreparedStatement st1=con.prepareStatement(s);
		Statement st1=con.prepareStatement(s);
	//	st1.setString(1,jb.getJobTitle());
		//st1.setString(2,jb.getRole());
		ArrayList<ArrayList<String>>l=new ArrayList<ArrayList<String>>();
		rs=st1.executeQuery(s);
		while(rs.next()) {
			ArrayList<String>n=new ArrayList<>();
			n.add(rs.getString("name"));
			n.add(rs.getString(("loc")));
			n.add(rs.getString("salary"));
			n.add(rs.getString("link"));
			n.add(rs.getString("postedby"));
l.add(n);
		}
		return l;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
