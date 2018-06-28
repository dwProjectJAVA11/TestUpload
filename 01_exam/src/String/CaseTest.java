package String;

public class CaseTest {

	public static void main(String[] args)
	{
		String str1 = "abcdefg";
		System.out.println(str1.toUpperCase());	// 대문자로
		
		String str2 = "ABCEDFG";
		System.out.println(str2.toLowerCase());	// 소문자로
		
		String str3 = "		ABCD		efg			";
		System.out.println(str3.trim());		// 앞,뒤 공백제거 & 중간공백은 못하니까 replace로 하도록 하자
		
	}

}
