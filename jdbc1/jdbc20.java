package jdbc1;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;

public class jdbc20 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe","system","system");
		System.out.print(con.getTransactionIsolation());
	DatabaseMetaData d=	con.getMetaData();
	System.out.println(d.getClass().getName());
	System.out.println("drivername"+d.getDriverName()+"\n"+d.getDatabaseProductName()+"\n+"+d.getUserName()+"\n"+d.getMaxColumnsInTable()+"\n"+d.getURL());
		//con.setTransactionIsolation(1);
		//System.out.print(con.getTransactionIsolation());
		//Connection con=DriverManager.getConnection("jdbc:oracle:oci:@Xe","system","system");//type 2 driver
	//	Statement st1= con.createStatement();
		
		/*con.setAutoCommit(false);
		 st1.executeQuery("insert into khandu values(2,'pp')");
		 st1.executeQuery("update khandu set roll=30 where name='cc'");
		 Savepoint s=con.setSavepoint();
			//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe","system","system");
		st1.executeQuery("insert into khandu values(56,'dsa')");//not execute becoz of rollback
		 con.rollback(s);*/
		 con.close();
	}

}
