package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe","system","system");
		//Connection con=DriverManager.getConnection("jdbc:oracle:oci:@Xe","system","system");//type 2 driver
		Statement st1= con.createStatement();
	//	ResultSet rs=st1.executeQuery("select * from harsh");
		ResultSet rs1=st1.executeQuery("select count(*) from harsh");
		if(rs1.next())
			System.out.println(rs1.getInt(1));
		ResultSet rs2=st1.executeQuery("select max(EmployeeSalary) from harsh");
	//	ResultSet rs3=st1.executeQuery("select * from harsh where EmployeeSalary in(select max(EmployeeeSalary) from harsh)");
		ResultSet rs=st1.executeQuery("select * from harsh order by EmployeeSalary DESC");
		while (rs2.next())
		{
System.out.println(rs2.getString(1));
		}
		while(rs.next())
		{
			System.out.println(rs.getString(1));
		}
		//while(rs3.next())	
		//{
			//System.out.println(rs3.getInt(1)+"->"+rs3.getString("employeename")+"-->"+rs3.getString(3)+"-->"+rs3.getString(4));
		//}
		con.close();

	}

}
