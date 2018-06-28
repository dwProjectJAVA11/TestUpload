package StringBuffer;

public class StringbufferEx1 {

	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");
		
		if(sb1==sb2)
			System.out.println("두 문자열은 같다.");
		else	System.out.println("두 문자열은 다르다.");
		
		if(sb1.equals(sb2))
			System.out.println("두 문자열은 같다.");
		else	System.out.println("두 문자열은 다르다.");
		
		// 같은 스트링이라고 하더라고 이건 오버라이딩 안해서 주소비교한 것!
		// 스트링으로 대입해서 비교해줘!
		
		String st1 = sb1.toString();
		
	}

}
