package Reference;

public class ArrayTest13 {

	public static void main(String[] args) {

		int oldArray[] = {10,20,30};
		
		int newArray[] = new int[4];
		
		for(int i = 0; i < oldArray.length ; i++)
			newArray[i] = oldArray[i];
		
		newArray[oldArray.length] = 40;
		
		for(int i : newArray)
			System.out.println(i + " ");
		

	}

}
