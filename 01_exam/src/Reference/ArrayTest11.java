package Reference;

public class ArrayTest11 {

	public static void main(String[] args) {

		// 커맨드라인에 인자갑을 넘시지 않았을 경우
		// 나올 수 있는 ArrayIndexOutofBoundsException
		// 피하기
		
		
		if(args.length !=2) {
			System.out.println("프로그램 사용법");
			System.out.println("java 클래스명 인자1 인자2");
			System.exit(0);
	
		}
		
		
		int strNum1 = Integer.parseInt(args[0]);
		int strNum2 = Integer.parseInt(args[1]);
		
		System.out.println(strNum1);
		System.out.println(strNum2);
		System.out.println("strNum1 + strNum2 = " + (strNum1 + strNum2));
	}

}
