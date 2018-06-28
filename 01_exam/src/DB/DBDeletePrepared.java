package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDeletePrepared {

	public static void main(String[] args)
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/javadb?useSSL=false";
			con = DriverManager.getConnection(url, "root", "1234");
			
			pstmt = con.prepareStatement("delete from userTBL where no=14");
			int result = pstmt.executeUpdate();
			
			if(result>0) System.out.println("삭제 성공");
			else	System.out.println("삭제 실패");
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try
			{
				pstmt.close();
				con.close();
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
