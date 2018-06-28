package UserTBL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO {
	// 데이터베이스 조회,삽입,삭제,수정

	private Connection con = null;
	private ResultSet rs = null;
	private PreparedStatement pstmt = null;

	/*
	 * public int registUser(String name,String birth,String addr) { //삽입 String
	 * sql="insert into userTBL(name,birthday,address) "; sql+="values(?,?,?)"; int
	 * result=0; DBUtils utils=DBUtils.getInstance();
	 * 
	 * try { con=utils.connect(); //삽입하다가 이상이 발생하면 쿼리를 반영시키지 않기 위해
	 * con.setAutoCommit(false); pstmt=con.prepareStatement(sql); pstmt.setString(1,
	 * name); pstmt.setString(2, birth); pstmt.setString(3, addr);
	 * result=pstmt.executeUpdate(); if(result>0) con.commit(); //쿼리 반영 } catch
	 * (SQLException e) { try { con.rollback(); //이상 발생시 쿼리 되돌리기 } catch
	 * (SQLException e1) { e1.printStackTrace(); } e.printStackTrace(); }finally {
	 * utils.close(con, pstmt); } return result; }
	 */
	public int registUser(UserVO vo)
	{ // 삽입
		String sql = "insert into userTBL(name,birthday,address) ";
		sql += "values(?,?,?)";
		int result = 0;
		DBUtils utils = DBUtils.getInstance();

		try
		{
			con = utils.connect();
			// 삽입하다가 이상이 발생하면 쿼리를 반영시키지 않기 위해
			con.setAutoCommit(false);
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setDate(2, vo.getBirthday());
			pstmt.setString(3, vo.getAddress());
			result = pstmt.executeUpdate();
			if (result > 0)
				con.commit(); // 쿼리 반영
		} catch (SQLException e)
		{
			try
			{
				con.rollback(); // 이상 발생시 쿼리 되돌리기
			} catch (SQLException e1)
			{
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally
		{
			utils.close(con, pstmt);
		}
		return result;
	}

	// 회원삭제
	/*
	 * public int removeUser(int no) { int result=0; DBUtils
	 * utils=DBUtils.getInstance(); try { con=utils.connect();
	 * con.setAutoCommit(false); String sql="delete from userTBL where no=?";
	 * pstmt=con.prepareStatement(sql); pstmt.setInt(1, no);
	 * result=pstmt.executeUpdate(); if(result>0) con.commit(); } catch
	 * (SQLException e) { try { con.rollback(); } catch (SQLException e1) {
	 * e1.printStackTrace(); } e.printStackTrace(); }finally { utils.close(con,
	 * pstmt); } return result; }
	 */
	public int removeUser(UserVO vo)
	{
		int result = 0;
		DBUtils utils = DBUtils.getInstance();
		try
		{
			con = utils.connect();
			con.setAutoCommit(false);
			String sql = "delete from userTBL where no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, vo.getNo());
			result = pstmt.executeUpdate();
			if (result > 0)
				con.commit();
		} catch (SQLException e)
		{
			try
			{
				con.rollback();
			} catch (SQLException e1)
			{
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally
		{
			utils.close(con, pstmt);
		}
		return result;
	}

	/*
	 * public int updateUser(int no, String addr) { int result=0;
	 * 
	 * DBUtils utils=DBUtils.getInstance();
	 * 
	 * 
	 * try { con=utils.connect(); con.setAutoCommit(false); String
	 * sql="update userTBL set address=? where no=?";
	 * pstmt=con.prepareStatement(sql); pstmt.setString(1, addr); pstmt.setInt(2,
	 * no); result=pstmt.executeUpdate(); if(result>0) con.commit(); } catch
	 * (SQLException e) { try { con.rollback(); } catch (SQLException e1) {
	 * e1.printStackTrace(); } e.printStackTrace(); }finally { utils.close(con,
	 * pstmt); } return result; }
	 */
	public int updateUser(UserVO vo)
	{
		int result = 0;

		DBUtils utils = DBUtils.getInstance();

		try
		{
			con = utils.connect();
			con.setAutoCommit(false);
			String sql = "update userTBL set address=? where no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getAddress());
			pstmt.setInt(2, vo.getNo());
			result = pstmt.executeUpdate();
			if (result > 0)
				con.commit();
		} catch (SQLException e)
		{
			try
			{
				con.rollback();
			} catch (SQLException e1)
			{
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally
		{
			utils.close(con, pstmt);
		}
		return result;
	}

	// 조회
	public UserVO getUser(UserVO vo)
	{
		DBUtils utils = DBUtils.getInstance();
		try
		{
			con = utils.connect();
			con.setAutoCommit(false);
			String sql = "select * from userTBL where no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, vo.getNo());
			rs = pstmt.executeQuery();
			if (rs.next())
			{
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setBirthday(rs.getDate(3));
				vo.setAddress(rs.getString(4));
			}
			con.commit();
		} catch (SQLException e)
		{
			try
			{
				con.commit();
			} catch (SQLException e1)
			{
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally
		{
			utils.close(con, pstmt, rs);
		}
		return vo;
	}

	public ArrayList<UserVO> getUsers()
	{
		ArrayList<UserVO> list = new ArrayList<>();
		DBUtils utils = DBUtils.getInstance();

		try
		{
			con = utils.connect();
			String sql = "select * from userTBL";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next())
			{
				UserVO vo = new UserVO();
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setBirthday(rs.getDate(3));
				vo.setAddress(rs.getString(4));
				list.add(vo);
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			utils.close(con, pstmt, rs);
		}
		
		return list;
	}
}
