package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class jdbc12 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe","system","system");
		PreparedStatement ps=con.prepareCall("insert into dates values(?,?)");
		Scanner sc=new Scanner(System.in);
		String name;
		System.out.println("enter name");
		name=sc.next();
		System.out.println("enter the doj(dd-mm-yyyy):");
		String doj;
		doj=sc.next();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date sdate=sdf.parse(doj);
		java.sql.Date sd=new java.sql.Date(sdate.getTime());
		ps.setString(1, name);
		ps.setDate(2, sd);
		ps.execute();
		con.close();
	}

}
