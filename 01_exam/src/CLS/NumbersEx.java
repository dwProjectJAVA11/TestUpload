package CLS;

public class NumbersEx {

	public static void main(String[] args) {

		int arr[] = { 15, 35, 26, 37, 95, 88, 66, 72, 53, 23 };
		Numbers obj = new Numbers(arr);

		System.out.println("합계 : " + obj.getTotal());
		System.out.println("평균 : " + obj.getAverage());
	}

}
