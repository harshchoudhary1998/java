package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.pool.OracleConnectionPoolDataSource;

public class jdbc19 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		OracleConnectionPoolDataSource ds=new OracleConnectionPoolDataSource();
		System.out.println(ds.getClass().getName());
		ds.setURL("jdbc:oracle:thin:@localhost:1521:Xe");
	ds.setUser("system");
	ds.setPassword("system");
		
		Connection con=ds.getConnection();
		Statement st1= con.createStatement();
		ResultSet rs= st1.executeQuery("select * from khandu");//xe is service id of database
	while(rs.next())	
	{
		System.out.println(rs.getInt(1)+"->"+rs.getString(2));
	}


	}

}
