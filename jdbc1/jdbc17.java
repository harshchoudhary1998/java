package jdbc1;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.Reader;
//import java.nio.CharBuffer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//import oracle.sql.CHAR;

public class jdbc17 {
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe","system","system");
		PreparedStatement ps=con.prepareCall("select * from note");
		ResultSet rs=ps.executeQuery();
		FileWriter fos=new FileWriter("F://farzi.txt");
		if(rs.next())
		{
			String name =rs.getString(1);
			Reader fis=rs.getCharacterStream(2);
			char[] b=new char[1024];
			while(fis.read(b)>0)
				fos.write(b);
			fos.flush();
		}
		con.close();
	}

}
