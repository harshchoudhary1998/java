package jdbc1;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbc16 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe","system","system");
		PreparedStatement ps=con.prepareCall("insert into note values(?,?)");
		File f=new File("E:\\faltu.txt");
		FileReader fis=new FileReader(f);
		ps.setString(1, "farzi");
		ps.setCharacterStream(2, fis);
		System.out.println("file inserted from:"+f.getAbsolutePath());
		int rc=ps.executeUpdate();
		if(rc!=0)
			System.out.println("successfully");
		else
			System.out.println("bakwas");
		con.close();
	}

}
