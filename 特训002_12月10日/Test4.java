import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

public class Test4 
{
	public static void main(String[] args) 
		throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		try
		(
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pbs","root","congrobot");
			PreparedStatement stmt=conn.prepareStatement("insert into student_table values(null,?,?,?,?)")
		)
		{
			Scanner sc=new Scanner(System.in);
			for(int i=1;i<5;i++)
			{
				stmt.setString(i,sc.next());
				
			}
			stmt.executeUpdate();
			try
			(
				Statement stmt1=conn.createStatement();
			)
			{
				String str="select * from student_table";
				ResultSet rs=stmt1.executeQuery(str);
				ResultSetMetaData rsmd=rs.getMetaData();
				int col=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=0;i<col;i++)
					{
						System.out.print(rs.getString(i+1)+"\t");
					}
					System.out.println();

				}
			}
			


		}
	}
}
