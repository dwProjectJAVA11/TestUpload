package DB;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUpadate {

	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/javadb?useSSL=false";
			con = DriverManager.getConnection(url, "root", "1234");
			stmt = con.createStatement();

			int result = stmt.executeUpdate("update userTBL set address='서울시 영등포구' where no=10");
			if (result > 0)
				System.out.println("수정 성공");
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
				stmt.close();
				con.close();
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		}

	}

}
