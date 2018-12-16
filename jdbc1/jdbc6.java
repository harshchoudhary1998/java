package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc6 {
	public static void main(String[] args) throws Exception
	{
		String user,pwd;
		Scanner sc=new Scanner(System.in);
		System.out.println("hello friends value dalo");
		user=sc.next();
		pwd=sc.next();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe","system","system");
		//Connection con=DriverManager.getConnection("jdbc:oracle:oci:@Xe","system","system");//type 2 driver
		Statement st1= con.createStatement();
		String s="select * from loginpage where username='"+user+"' and password='"+pwd+"'";
		
		ResultSet rs= st1.executeQuery(s);
		
		if(rs.next())
		{
			System.out.println("valid");//xe is service id of database
		}
		else
			System.out.println("invalid");
/*	while(rs.next())	
	{
		System.out.println(rs.getInt(1)+"->"+rs.getString(2));
	}
	System.out.println(con.getClass().getName()+"-->"+st1.getClass().getName());*/
	con.close();
	}
}
