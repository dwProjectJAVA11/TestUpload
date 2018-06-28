package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSelectPreparedOne {

	public static void main(String[] args)
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try
		{
			// 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/javadb?useSSL=false";
			con = DriverManager.getConnection(url, "root", "1234");
			pstmt = con.prepareStatement("select * from userTBL where no=?");

			int x=3;
			pstmt.setInt(1,x);

			rs = pstmt.executeQuery();
			
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
				pstmt.close();
				con.close();
				
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
}