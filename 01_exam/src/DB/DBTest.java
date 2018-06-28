package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest {

	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/javadb?userSSL=false";
			String user = "root";
			String password = "1234";

			// Connection 객체 생성
			Connection con = DriverManager.getConnection(url, user, password);
			if (con != null)
			{
				System.out.println("Connection 확인");

			}
		} catch (

		ClassNotFoundException e)
		{
			e.printStackTrace();
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

}
