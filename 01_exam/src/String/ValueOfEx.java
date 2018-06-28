package String;

public class ValueOfEx {

	public static void main(String[] args)
	{
		int i = 45;
		float f = 4.5f;
		char c = 'c';
		
		String str = String.valueOf(i);
		String str2 = String.valueOf(f);
		String str3 = String.valueOf(c);
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);

		String str4 = "45";
		System.out.println(str4);
		System.out.println(Integer.parseInt(str4));
		System.out.println(Double.parseDouble(str4));
		System.out.println(Boolean.parseBoolean(str4));	
	}

}
