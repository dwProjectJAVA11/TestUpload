package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args)
	{
		Date date = new Date();
		System.out.println(date);	//현재 날짜
		
		// 보고싶은 형태대로 변경
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm(ss)");
		System.out.println(sdf.format(date));	//현재 날짜
		
	}

}
