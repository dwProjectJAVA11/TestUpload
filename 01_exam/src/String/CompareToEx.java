package String;

public class CompareToEx {

	public static void main(String[] args)
	{
		// 나중에 정렬에 쓰일거야
		String str = "aaa";		// 아스키로 97
		String str2 = "bbb";	// 아스키로 98
		String str3 = "aaa";	
		
		System.out.println(str.compareTo(str2));
		System.out.println(str.compareTo(str3));
		System.out.println(str2.compareTo(str));
		// 숫자로 비교한다.
	}

}
