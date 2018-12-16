package jdbc1;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbc14 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe","system","system");
		PreparedStatement ps=con.prepareCall("insert into image values(?,?)");
	/*	File f=new File("C://00000PORTRAIT_00000_BURST20180203110244384.jpg");
		FileInputStream fis=new FileInputStream(f);
		ps.setString(1,"harsh");
		ps.setBinaryStream(2, fis);
		int rc=ps.executeUpdate();
		System.out.println("successfully");*/
		ps.close();
	}

}
