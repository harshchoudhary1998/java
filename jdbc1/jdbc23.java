package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc23 {

	

	public static void main(String[] args)throws Exception
	{
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe","system","system");
		//Connection con=DriverManager.getConnection("jdbc:oracle:oci:@Xe","system","system");//type 2 driver
		Statement st1= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ResultSet rs=st1.executeQuery("select * from khandu");
		while(rs.next())
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
		System.out.println("reverse order"+"\n");
		while(rs.previous())
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
		con.close();
		
		
		

	}

}
