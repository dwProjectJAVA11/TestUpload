package DB2;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookDAO {

	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	private Connection getConnection() // 외부에서 이 함수를 얻어올 일이 없기 때문에 private로 만들어 주었다. close 또한 마찬가지
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
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

	private void close(Connection con, PreparedStatement pstmt, ResultSet rs)
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

	private void close(Connection con, PreparedStatement pstmt)
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

	public int bookinsert(BookVO vo)
	{
		int result = 0;
		con = getConnection(); // 1. 커넥션 얻어오기 -> con을 통해서 통신이 이루어짐
		String sql = "insert into bookTBL(title, publisher, year, price)";
		sql += "values(?,?,?,?)"; // 컬럼명을 만들지 않고 순서만 지켜도 OK
		try
		{
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getPublisher());
			pstmt.setString(3, vo.getYear());
			pstmt.setInt(4, vo.getPrice());

			result = pstmt.executeUpdate(); // 쿼리 실행
		} catch (SQLException e)
		{
			e.printStackTrace();
		} finally
		{
			close(con, pstmt);
		}

		return result;
	}

	public BookVO bookselectOne(int book_id) // 특정 조건에 맞는 책 정보 가져오기
	{
		BookVO vo = null;

		con = getConnection();
		String sql = "select * from bookTBL where book_id=?";

		try
		{
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, book_id);
			rs = pstmt.executeQuery(); // select이기 때문에 rs와 executeQuery가 동반 됨
			if (rs.next()) 		// 또한 book_id는 pk이기 때문에 하나의 결과가 나오거나 나오지 않음 따라서 있는지만 확인하면됨
			{
				vo = new BookVO();	// 다시 봉투에 담아준다.
				vo.setBook_id(rs.getInt(1));
				vo.setTitle(rs.getString(2));
				vo.setPublisher(rs.getString(3));
				vo.setYear(rs.getString(4));
				vo.setPrice(rs.getInt(5));
				
			}
		} catch (SQLException e)
		{
			e.printStackTrace();
		}

		return vo;
	}
	
	public ArrayList<BookVO> getList()
	{
		// 보통 DB에서 소팅해서 나오기 때문에 그냥 ArrayList로 담아준다.
		con = getConnection();
		ArrayList<BookVO> list = new ArrayList<>();
		String sql = "select * from bookTBL";
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next())		// rs.next() -> 다음에 읽어올 것이 있으면 true를 리턴해준다.
			{
				BookVO vo = new BookVO();
				vo.setBook_id(rs.getInt(1));
				vo.setTitle(rs.getString(2));
				vo.setPublisher(rs.getString(3));
				vo.setYear(rs.getString(4));
				vo.setPrice(rs.getInt(5));
				
				list.add(vo);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			close(con, pstmt, rs);
		}
		return list;
	}
	
	// 도서 정보 수정 -> book_id가 일치하는 도서에 한해서 가격 수정
	public int bookUpdate(int book_id, int price)
	{
		con = getConnection();
		int result = 0;
		String sql = "Update bookTBL set price=? where book_id=?";		// where가 없으면 전체에 set됨
		try
		{
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,price);
			pstmt.setInt(2,book_id);
			result = pstmt.executeUpdate();
			
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			close(con, pstmt);
		}
		
		return result;
	}

}
