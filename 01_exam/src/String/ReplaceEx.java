package String;

public class ReplaceEx {

	public static void main(String[] args)
	{
		String str = "자바는 객체지향 언어입니다. 자바는 풍부한  API를 제공합니다.";
		// -> String 클래스는 한 번 들어간 것에 대해서는 바뀌지 않는다.
		// 기존에 선언된 공간을 버리고 새롭게 메모리를 잡는다.
		// Hello + Test 하면 Hello Test로 연결된 것 처럼 보이지만
		// 파괴 하고 새로 만드는 것!
		
		// 궁금한것!! -> 왜 이런 시스템을...? 어떤 원리로?
		// 그리고 int+""하면 바로 String이 되는데 왜 이건 별로라고 하신걸까?
		
		System.out.println(str);
		//System.out.println(str.replace("자바", "Java"));
		
		str = str.replaceFirst("자바", "Java");	// 다시 대입해주지 않으면 그 문장 그대로
		// str = str.replaceFirst("Java", "자바");	// 처음 나오는 해당 문자열만 대체해준다.
		System.out.println(str);
	}

}
