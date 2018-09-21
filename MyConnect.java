import java.sql.*;
//this class is used to create connection so not need to create connection  object everytime just extend this
class MyConnect
{
	static Connection conn=null;
   static void display()throws Exception
  {
	 String driverclass="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url = "jdbc:sqlserver://SUJIT\\MY_SQLSERVER;databaseName=LOGINDEMO;integratedSecurity=true";  
	//SUJIT\\MY_SQLSERVER=server name
	
	Class.forName(driverclass); 
	conn = DriverManager.getConnection(url);
	System.out.println("================================");
	System.out.println("Connection Establish");
	System.out.println("================================");
	
	}
}

