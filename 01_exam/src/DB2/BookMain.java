package DB2;

import java.util.ArrayList;

public class BookMain {

	public static void main(String[] args)
	{
		BookDAO dao = new BookDAO();
		BookVO vo = new BookVO();

		// insert 실행

		// 한꺼번에 담기 위해서 VO 객체를 생성해서 담아준다.
		// vo.setTitle("Operating System Conceptions");
		// vo.setPublisher("wiley");
		// vo.setYear("2007");
		// vo.setPrice(35000);
		//
		// int result = dao.bookinsert(vo);
		//
		// if(result > 0) System.out.println("입력성공");
		// else System.out.println("입력실패");

		// 검색

		//vo = dao.bookselectOne(3);
		//System.out.println(vo.toString());

		// 전체 조회
//		ArrayList<BookVO> list = dao.getList();
//		for (BookVO b : list)
//		{
//			System.out.println("book_id : " + b.getBook_id());
//			System.out.println("Title : " + b.getTitle());
//			System.out.println("Publisher : " + b.getPublisher());
//			System.out.println("Year : " + b.getYear());
//			System.out.println("getPrice : " + b.getPrice());
//		}
		
		// 수정
		
		int result = dao.bookUpdate(4, 100000);
		if(result > 0) {
			System.out.println("수정 완료");
			vo = dao.bookselectOne(4);
			System.out.println(vo.toString());
		}
		else System.out.println("수정실패");
	}

}
