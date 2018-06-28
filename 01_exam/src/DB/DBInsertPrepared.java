package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DBInsertPrepared {

	public static void main(String[] args)
	{
		Connection con = null;
		PreparedStatement pstmt = null;

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/javadb?useSSL=false";
			con = DriverManager.getConnection(url, "root", "1234");
			if (con != null)
			{
				String sql = "insert into userTBL(name, birthday,address) ";
				// 쿼리문 맨 끝에 띄어쓰기 해줘... 다음 문장이랑 구별하도록
				
				sql += "values(?,?,?)";
				// 반복해서 sql에 += 하게 되면 성능상 좋지 않다. -> String을 추가하더라도 뒤에 붙이는 것이 아니라
				// 객체를 파괴하고 다시 만들기 때문에
				// String Builder나 Buffer를 사용하자
			
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, "하이");
				pstmt.setString(2, "2013-02-24");
				pstmt.setString(3, "광주광역시");
				
				int result = pstmt.executeUpdate(); // 성공하면 1, 실패하면 0

				if (result > 0)
				{
					System.out.println("입력 성공");
				} else
					System.out.println("입력 실패");
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
				pstmt.close();
				con.close();
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
	}

}
