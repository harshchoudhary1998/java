package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc4 {

	public static void main(String[] args)throws Exception
	{
		String NAME,Choice;
		int ROLL;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:oci:@Xe","system","system");
Scanner sc=new Scanner(System.in);
Statement s=con.createStatement();
while(true)
{
System.out.println("enter roll");
ROLL=sc.nextInt();
System.out.println("enter name");
NAME=sc.next();
String querry=String.format("insert into khandu values(%d,'%s')",ROLL,NAME);
s.executeUpdate(querry);
System.out.println("wnt enter more record");
Choice=sc.next();
if(Choice.equalsIgnoreCase("no"))
{
	break;
}
}
System.out.println("record update successful");

//System.out.println("record update"+no);
con.close();
}

}
