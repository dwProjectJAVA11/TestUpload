package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSelectPrepared {

	public static void main(String[] args)
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try
		{
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/javadb?userSSL=false";
			String user = "root";
			String password = "1234";
			con = DriverManager.getConnection(url, user, password);

			if (con != null)
			{
				String sql = "select * from userTBL";
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery(sql);

				while (rs.next())	// 내가 가져온 테이블에 데이터가 있을 때 true를 리턴한다.
				{
					int no = rs.getInt(1);
					String name = rs.getString(2);
					String birth = rs.getString(3);
					String addr = rs.getString(4);
					System.out.println(no + " " + name + " " + birth + " " + addr);
				}
			}
		}

		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}

		catch (SQLException e)
		{
			e.printStackTrace();
		}

		finally
		{
			try
			{
				rs.close();
				pstmt.close();
				con.close();
			}
			
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
}
