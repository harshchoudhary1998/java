package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;

public class jdbc22 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe","system","system");
		PreparedStatement ps=con.prepareCall("insert into khandu values(?,?)");
ParameterMetaData pd=ps.getParameterMetaData();
int count =pd.getParameterCount();
System.out.print("total count"+count);
/*for(int i=1;i<=count;i++)
{
	System.out.println("parameter mode:-"+pd.getParameterMode(i));
	System.out.println("parameter type:-"+pd.getParameterType(i));
	//System.out.println("column size:-"+rd.getColumnDisplaySize(i));
}*/
con.close();
	}

}
