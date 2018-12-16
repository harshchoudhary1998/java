package jdbc1;

public class jdbc11 {

	public static void main(String[] args) 
	throws Exception
	{
		java.util.Date ud=new java.util.Date();
		System.out.println(ud);
		long l=ud.getTime();
		java.sql.Date sd1=new java.sql.Date(1);
		System.out.println("sql date:"+sd1+"-->"+sd1.getTime());

	}

}
