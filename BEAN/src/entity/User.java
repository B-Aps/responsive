package entity;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLDataException;
import java.sql.SQLException;



@SuppressWarnings({ "unused", "serial" })
public class User implements java.io.Serializable{
private String name;
private String email;
private String password;

public User() {
	super();
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public  boolean insert()
{
	boolean success=false;


try
{
	String qry="INSERT INTO APEX.STUDENT VALUES(?,?,?)";
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
java.sql.Connection connect=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","system","system");
PreparedStatement prestate=connect.prepareStatement(qry);
prestate.setString(1, name);
prestate.setString(2,email);
prestate.setString(3,password);
prestate.executeUpdate();
success=true;
}
catch(SQLException e)
	{
		
		System.out.println("SQL EXCEPTON");
	}
return success;
	}}



