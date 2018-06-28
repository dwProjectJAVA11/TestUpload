package loop;

public class IfTest5 {
	public static void main(String[] args) {
		int score = 75;
		char grade;
		
		if(score>=90) {
			System.out.println("점수는 90~100");
			grade = 'A';
		//	System.out.println("A등급");
		}
		else if(score>=80) {
			System.out.println("점수는 80~90");
			grade = 'B';
		//	System.out.println("B등급");
		}

		else if(score>=70) {
			System.out.println("점수는 70~80");
			grade = 'C';
		//	System.out.println("C등급");
		}
		else {
			System.out.println("점수는 70미만");
			grade = 'D';
		//	System.out.println("D등급");
		}
		
		System.out.printf("등급은 %c입니다.",grade);

	}
}