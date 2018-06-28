package Member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {

	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private int idx = 0;

	private Connection getConnection() // -> Connection 담당 클래스
	{
		try
		{
			// JDBC 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");

			// DB접속 URL
			String url = "jdbc:mysql://localhost:3306/javadbseSSL=false";

			// DriverManager를 통한 DBConnection 가져오기
			return DriverManager.getConnection(url, "root", "1234");

		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		} catch (SQLException e)
		{
			e.printStackTrace();
		}

		return null;
	}

	private void close(Connection con, PreparedStatement pstmt)
	{
		try
		{
			if (pstmt != null)
				pstmt.close();
			if (con != null)
				con.close();
		}

		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

	private void close(Connection con, PreparedStatement pstmt, ResultSet rs)
	{
		try
		{
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (con != null)
				con.close();
		}

		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

	// 조회
	public ArrayList<MemberVO> getList()
	{
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		list.setInt(rs.getInt(1));
		list.setInt(rs.getInt(2));
		list.setInt(rs.getInt(3));

	}
	
	public int insert(String name, int age, String gender)
	{
		int result = 0;
		con = getConnection();
		if (con != null)
		{
			String sql = "insert into memberTBL(name,age,gender) values(?,?,?)";
			try
			{
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, name);
				pstmt.setInt(2, age);
				pstmt.setString(3, gender);
				result = pstmt.executeUpdate();	
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			finally
			{
				close(con, pstmt);
			}

		}
		return result;
	}
	// select * from MemberTBL;

	public int delete()
	{
		int result = 0;

		try
		{
			con = getConnection();
			String sql = "delete from memberTBL where idx=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idx);
			result = pstmt.executeUpdate();
			return result;
		}

		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
