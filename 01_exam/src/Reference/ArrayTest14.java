package Reference;

public class ArrayTest14 {

	public static void main(String[] args) {

		int oldArray[] = {10,20,30};
		int newArray[] = new int[4];
		
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		newArray[oldArray.length] = 40;
		
		for(int i : newArray)
			System.out.println(i + " ");
		
	}

}
