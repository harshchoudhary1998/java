package jdbc1;


	import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	public class jdbc2 {
	public static void main(String[] args) throws Exception
	{
		Scanner sc= new Scanner(System.in);
		String pattern;
		System.out.println("enter");
		pattern=sc.next()+"%";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe","system","system");
		Statement st1= con.createStatement();
	//	int t=st1.executeUpdate("insert into khandu values(30,'cc')");
		String querry=String.format("select * from khandu where name like '%s'",pattern);
		ResultSet rs=st1.executeQuery(querry);
	
	//	int t1=st1.executeUpdate("delete from khandu where ROLL=1");
		//System.out.println("report update"+t);
		
	//	ResultSet rs= st1.executeQuery("select * from khandu");//xe is service id of database
	while(rs.next())	
	{
		System.out.println(rs.getInt(1));
	}
//	System.out.println(con.getClass().getName()+"-->"+st1.getClass().getName());
	con.close();
	}
		
}
