package jdbc1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class jdbc7 {
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe","system","system");
		CallableStatement cst=con.prepareCall("{call hc1(?,?)}");
		cst.setInt(1,1);
		cst.registerOutParameter(1,Types.INTEGER);
		cst.execute();
		System.out.println(cst.getInt(1));
		con.close();
	}
}
