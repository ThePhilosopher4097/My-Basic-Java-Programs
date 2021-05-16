package databases;

import java.sql.*;

public class Student_DB{
	
	static Connection con = null;
	PreparedStatement pst =null;
	public static Connection dbconnect(){
		try{
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			return con;
		}catch(Exception e){
			System.out.println(e);
			return null;
		}
	}
}