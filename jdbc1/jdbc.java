package jdbc1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class jdbc {
public static void main(String[] args) throws Exception
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe","system","system");
	Connection con=DriverManager.getConnection("jdbc:oracle:oci:@Xe","system","system");//type 2 driver
	Statement st1= con.createStatement();
	ResultSet rs= st1.executeQuery("select * from khandu");//xe is service id of database
while(rs.next())	
{
	System.out.println(rs.getInt(1)+"->"+rs.getString(2));
}
ResultSetMetaData rd=rs.getMetaData();
int count =rd.getColumnCount();
for(int i=1;i<=count;i++)
{
	System.out.println("column name:-"+rd.getColumnName(i));
	System.out.println("column type:-"+rd.getColumnType(i));
	System.out.println("column size:-"+rd.getColumnDisplaySize(i));
}
//int no=st1.executeUpdate("update khandu set roll=10 where name='cc'");
//System.out.println("record update"+no);
//System.out.println(con.getClass().getName()+"-->"+st1.getClass().getName());
con.close();
}
}