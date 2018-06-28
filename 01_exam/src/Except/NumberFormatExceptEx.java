package Except;

public class NumberFormatExceptEx {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		int result = Integer.parseInt(data1) + Integer.parseInt(data2);
		System.out.println(result);
	}

}
