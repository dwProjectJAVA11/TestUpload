package Date;

import java.util.Calendar;

public class CaledarEx {

	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year+"년 "+ month+"월 "+day+"일 / "+hour+"시 "+minute+"분 " + second + "초");
		
	}

}
