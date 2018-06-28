package String;

public class StringArray {

	public static void main(String[] args)
	{
		String str1 = new String("Hello Java!");

		// 스트링으로 선언된 str1을 char배열에 담고 배열 출력하기
		char[] Arr = new char[str1.length()];
		for (int i = 0; i < str1.length(); i++)
		{
			Arr[i] = str1.charAt(i);
			System.out.println(Arr[i]);
		}
	}

}
