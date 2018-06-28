package String;

public class CharAtTest1 {

	public static void main(String[] args)
	{
		String str1 = new String("Hello");
		
		System.out.println(str1.indexOf('e'));		// 몇 번째에 위치하는지
		System.out.println(str1.contains("ell"));	// boolean으로 해당 열이 있는지 없는지
	}

}
