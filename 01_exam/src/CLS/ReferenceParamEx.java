package CLS;

public class ReferenceParamEx {

	public static void main(String[] args) {

		int[] arr = new int[] {3,2,1,6,5,4};
		printArr(arr);			// 매개변수를 기본타입으로 사용하면 변경XXXX 값의 복사가 일어남, 그 외(참조변수)에는 변경O
		int sum = sumArr(arr);
		System.out.println("Sum : " + sum);
		
	}
	
	static void printArr(int[] arr)
	{
		arr[0] =12;
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
	}
	
	static int sumArr(int[] arr)
	{
		int sum = 0;
		
		for(int i =0; i< arr.length; i++)
			sum += arr[i];
		
		// System.out.println("Sum : " + sum);
		return sum;
	}
	

}
