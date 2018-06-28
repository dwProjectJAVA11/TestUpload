package Reference;

public class ArrayTest12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strArray[] = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");

		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		
		// 객체이므로 heap에 저장
		// 다만 stack에 주소를 잡는 방식이 다르다.
		// new를 쓰는 순간 따로 공간을 잡게된다.
		
	}

}
