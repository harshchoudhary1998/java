package jdbc1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class jdbc9 {
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe","system","system");
		CallableStatement cst=con.prepareCall("{?=call hc3(?,?)}");
		
		cst.registerOutParameter(1,Types.INTEGER);
		cst.setInt(2,1);
		cst.setInt(3,2);
		
		cst.execute();
		System.out.println(cst.getInt(1));
		con.close();
	}


}
