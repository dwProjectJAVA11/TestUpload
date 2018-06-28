package String;

public class StringArray2 {

	public static void main(String[] args)
	{
		String str1 = new String("Hello Java!");

		char[] Arr = str1.toCharArray();
		// 스트링을 char[]으로 변경
		
		for (int i = 0; i < str1.length(); i++)
		{
			System.out.println(Arr[i]);
		}
	}

}
