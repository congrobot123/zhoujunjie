import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.sql.Savepoint;


@FunctionalInterface
interface Accept<T>
{
	void create(Connection conn)
		throws Exception;
}



public class Test5 
{
	Connection conn;
	private void init()
		throws Exception
	{

		Class.forName("com.mysql.jdbc.Driver");
		try 
		{
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pbsbase","root","congrobot");
		}
		catch(Exception e)
		{
			System.exit(0);
		}
	}

	public void rollback(Accept T)
		throws Exception
	{
		
		init();
		try 
		(
			PreparedStatement pstmt=conn.prepareStatement("insert into student_table values (null,?,?,default,null);");
		)
		{
			conn.setAutoCommit(false);
			for(int i=0;i<2;i++)
			{
				pstmt.setString(1,"xxx"+i);
				pstmt.setString(2,"123"+i);
				pstmt.executeUpdate();
			}

			T.create(conn);
			System.out.println();
			
			Savepoint a=conn.setSavepoint();
			for(int i=0;i<2;i++)
			{
				pstmt.setString(1,"yyy"+i);
				pstmt.setString(2,"456"+i);
				pstmt.executeUpdate();
			}
			T.create(conn);
			System.out.println();

			Savepoint b=conn.setSavepoint();
			for(int i=0;i<2;i++)
			{
				pstmt.setString(1,"zzz"+i);
				pstmt.setString(2,"789"+i);
				pstmt.executeUpdate();
			}
			T.create(conn);
			System.out.println();

			conn.rollback(b);
			T.create(conn);
			conn.commit();
			
		}
		conn.close();
			
	}

	public static void main(String[] args) 
		throws Exception
	{

		Test5 t=new Test5();
		t.rollback(conn->
			{
				try
				(
					Statement stmt=conn.createStatement();
				)
				{
				
					stmt.executeQuery("select * from student_table");
					try
					(
						//5.�������
						ResultSet rs=stmt.getResultSet();
					)
					
					{
						ResultSetMetaData rsmd=rs.getMetaData();
						int columnCount=rsmd.getColumnCount();
						while(rs.next())
						{
							for(int i=0;i<columnCount;i++)
							{
								System.out.print(rs.getString(i+1)+"\t");
							}
							System.out.println();
						}
					}

				}
		});

	}
}
