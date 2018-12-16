package jdbc1;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

public class jdbc18 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	
		
	//	Properties p=new Properties();
		//FileReader f=new FileReader("E://hc.txt");
		//p.load(f);
		 String url="jdbc:oracle:thin:system/system@localhost:1521:Xe";
		//String url=p.getProperty("url");
		//String name=p.getProperty("username");
		//String pass=p.getProperty("password");
		Connection con=DriverManager.getConnection(url);
		Statement st1= con.createStatement();
		ResultSet rs= st1.executeQuery("select * from khandu");//xe is service id of database
	while(rs.next())	
	{
		System.out.println(rs.getInt(1)+"->"+rs.getString(2));
	}

	}

}
