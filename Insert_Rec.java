import java.sql.*;

class Inser_Rec extends MyConnect
{
	void show()throws Exception
	{
		
		try{ 
         Statement s=conn.createStatement( );
		 String q="insert into employee_data values(101,'employee1',10000)";
		 //101=emp_id, employee1=emp_name, 10000=emp_salary
		 
		 s.executeUpdate(q);
		 System.out.println("\n----------------------------------------------------------------");
		 System.out.println("\nrow inserted");
		 System.out.println("\n----------------------------------------------------------------");
		 
		 ResultSet rs=s.executeQuery("select * from employee_data");
		 //employee_data is table in database
		 
		 int n=0;
		 while(rs.next())
		 {
			 n++;
			 
			 System.out.println("\nemployee id is:-"+rs.getInt(1));
			 System.out.println("employee name is:-"+rs.getString(2));
			 System.out.println("employee salary is:-"+rs.getInt(3));
			 System.out.println("\n-------------------------------------------------------------");
			 
		 }
		 if(n==0)
			 System.out.println("\nno row found");
		 else
			 System.out.println("\n-------------------------------------------------------------");
			 System.out.println(n+ "rows found");
			 
	}catch(Exception e)
		{
			System.out.println("\n     sorry! emp_ id is already available...please use different emp_id ");
		}
	}
	public static void main(String args[])throws Exception
	{
		MyConnect m=new MyConnect();
		display();
		Inser_Rec in=new Inser_Rec();
		
		in.show();
	}
}