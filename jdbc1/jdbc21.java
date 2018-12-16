package jdbc1;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc21 {

	public static void main(String[] args)throws Exception
	{Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe","system","system");
	//	Connection con=DriverManager.getConnection("jdbc:oracle:oci:@Xe","system","system");//type 2 driver
		Statement st1= con.createStatement();
		// TODO Auto-generated method stub
DatabaseMetaData dm=con.getMetaData();
String catalog=null,schemapattern=null,tablenamepattern=null;
String[] types=null;
ResultSet rs=dm.getTables(catalog, schemapattern, tablenamepattern, types);
while(rs.next())	
{
	System.out.println(rs.getString(3));
}
	}

}
