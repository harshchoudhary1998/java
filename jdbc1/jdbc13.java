package jdbc1;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbc13 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe","system","system");
		PreparedStatement ps=con.prepareCall("select * from image");
		ResultSet rs=ps.executeQuery();
		FileOutputStream fos=new FileOutputStream("E://harsh.jpg");
		if(rs.next())
		{
			String name =rs.getString(1);
			InputStream fis=rs.getBinaryStream(2);
			byte[] b=new byte[1024];
			while(fis.read(b)>0)
				fos.write(b);
			fos.flush();
		}
		con.close();
	}

}
