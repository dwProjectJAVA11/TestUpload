package loop;

public class WhileTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		int num = 12345;
		int sum = 0;
		
//		while(count<=100) {
//			count++;
//			if(count%3 == 0)
//				sum += count;
//		}
//		
//		System.out.println("Sum is " + sum);
//	
//		for(;num!=0;) {
//			sum+= num%10;
//			num = num/10;
//	}
//		System.out.println("sum is " + sum);
		
//	for(;;)
//		System.out.println("Test");
//	
	while(num!=0) {
		sum += num%10;
		num = num/10;
		System.out.println(sum);
	}
	
	
	
	}
}
