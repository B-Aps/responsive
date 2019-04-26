package dao;
import model1.Employee1;

import java.sql.*;


import com.sun.corba.se.pept.transport.Connection;
public class EmployeeDao {
//CRUD METHODS
	public int addEmployee(Employee1 emp)
	{
		String eid=emp.getEmpid();
		String ename=emp.getEname();
		String address=emp.getAddress();
		
		int result=0;
		try{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());	
		java.sql.Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		Statement stat=con.createStatement();
		result=stat.executeUpdate("insert into sathya.employee values(12,'sathya',232,'chennai',30)");
		
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
}
