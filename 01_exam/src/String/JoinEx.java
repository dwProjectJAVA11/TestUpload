package String;

public class JoinEx {
	public static void main(String[] args)
	{
		String str1 = String.join("-", "Java", "Recipe", "is", "Great");
		System.out.println(str1);

		String animals = "dog12,cat12,bear";
		String[] arr = animals.split(",");
		
		for (String str : arr)
			System.out.println(str);

	}

}
