package jdbc1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;

import oracle.jdbc.OracleTypes;

public class jdbc8 {
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe","system","system");
		CallableStatement cst=con.prepareCall("{call hc2(?)}");
		cst.registerOutParameter(1,OracleTypes.CURSOR);
		cst.execute();
		ResultSet rs=(ResultSet)cst.getObject(1);
		System.out.println("roll"+"\t"+"name");
		while(rs.next())
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
		con.close();
	}

}
