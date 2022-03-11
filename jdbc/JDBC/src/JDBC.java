//java database connectivity

/*
 *1.import -> java.sql.*;
 *2.load and register driver -->
 *3.create connection
 *4.create statment
 *5.execute query
 *6.processs result
 *7.close connection 
 */

import java.sql.*;

public class JDBC 
{

	public static void main(String[] args) throws Exception 
	{
		String url="jdbc:mysql://localhost:3306//abc";
		String uname="root";
		String pass="";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		
//		Statment st =con.createStatement("");
	}

}
