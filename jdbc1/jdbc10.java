package jdbc1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class jdbc10 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe","system","system");
Scanner sc=new Scanner(System.in);
String name,city,choice,salary;
int no;
Statement st;
System.out.println("add details");
while(true)
{
	System.out.println("add employee no");
	no=sc.nextInt();
	System.out.println("add name");
	name=sc.next();
	System.out.println("add salary");
	salary=sc.next();
	System.out.println("add city");
	city=sc.next(); 
	String querry=String.format("insert into harsh values(%d,'%s','%s','%s')",no,name,salary,city);
	st=con.createStatement();
	st.addBatch(querry);
	st.addBatch("update harsh set employeesalary=employeesalary+100 where employeeno<=2");
	System.out.println("enter yes or no");
	choice=sc.next();
	if(choice.equalsIgnoreCase("no"))
	break;
	st.executeBatch();
}
int[] t=st.executeBatch();
	for(int t1:t)
		System.out.println("value"+t1);
con.close();
sc.close();
	}

}
