package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc3 {
public static void main(String[] args) throws Exception
{
	int ROLL=90;
	String NAME="harsh";
	
	//Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe","system","system");
	Statement st1= con.createStatement();
	int t=st1.executeUpdate("insert into khandu values("+ROLL+",'"+NAME+"')");
/*	ResultSet rs= st1.executeQuery("select * from khandu");//xe is service id of database
while(rs.next())	
{
	System.out.println(rs.getInt(1)+"->"+rs.getString(2));
}
System.out.println(con.getClass().getName()+"-->"+st1.getClass().getName());*/
con.close();
}
}


