package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSelect1 {

	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try
		{
			// 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
			// 커넥션 생성
			String url = "jdbc:mysql://localhost:3306/javadb?useSSL=false";

			con = DriverManager.getConnection(url, "root", "1234");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from userTBL where no=3");

			if (rs.next())
			{
				int no = rs.getInt("no");
				String name = rs.getString("name"); // 컬럼명 직접 쓰기~
				String birth = rs.getString("birthday");
				String addr = rs.getString("address");
				System.out.println(no + ". " + name + " : " + birth + ", " + addr);
			}
			else {
				System.out.println("rs is null");
			}
			
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		} catch (SQLException e)
		{
			e.printStackTrace();
		} finally
		{
			try
			{
				rs.close();
				stmt.close();
				con.close();
				
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
}
