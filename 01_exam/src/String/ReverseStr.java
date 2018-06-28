package String;

public class ReverseStr {
	public static void main(String[] args)
	{
		String str = new String("abcAde");
		
		char[] ch = new char[100];
		
		for(int i = 0; i<str.length();i++)
		{	
			if(i-1 > str.length()/2 +1)
				break;
			ch[i] = str.charAt(str.length()-i-1);
		}
		
		for(int i = 0; i<str.length();i++)
			System.out.println(ch[i]);
		
		//////////// 2.
		StringBuilder bil2 = new StringBuilder();
		
		StringBuilder bil = new StringBuilder(str);
		System.out.println(bil.reverse().toString());
		
		
		
	}
}
