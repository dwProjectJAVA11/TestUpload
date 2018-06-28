package DB2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {

	private static DBUtils utils;

	private DBUtils()
	{
	}

	public static DBUtils getConnection() // 클래스이름.getConnection()
	{
		if (utils == null)
			utils = new DBUtils();
		return utils;
	}

	public Connection DBConnect()
	{
		Connection con = null;

		try
		{
			Class.forName("com.mysql.jdbc.Diver");
			String url = "jdbc:mysql://localhost:3306/javadb?useSSL=false";
			con = DriverManager.getConnection(url, "root", "1234");

		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		} catch (SQLException e)
		{
			e.printStackTrace();
		}

		return con;
	}

	public void close(Connection con, PreparedStatement pstmt)
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
	
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs)
	{
		try
		{
			rs.close();
			pstmt.close();
			con.close();

		} catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
