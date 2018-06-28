package Reference;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열 선언과 할당
		int[] score = new int[5];
		String[] name = new String[5];
		
		// 길이 초과하면 엑셉션
		for(int i = 0; i< score.length;i++) {
			System.out.println(score[i]);
		}
		
	}

}
