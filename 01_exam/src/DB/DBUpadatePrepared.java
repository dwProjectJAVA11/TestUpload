package DB;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUpadatePrepared {

	public static void main(String[] args)
	{
		Connection con = null;
		PreparedStatement pstmt = null;

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/javadb?useSSL=false";
			con = DriverManager.getConnection(url, "root", "1234");
			pstmt = con.prepareStatement("update userTBL set address='서울시 영등포구' where no=?");
			pstmt.setInt(1,11);

			int result = pstmt.executeUpdate();
			
			if (result > 0)
				System.out.println("수정 성공!");
			else
				System.out.println("수정 실패");

		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		} finally
		{
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
