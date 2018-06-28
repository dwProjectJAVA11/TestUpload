package Modifier;

public class MemberEx {

	public static void main(String[] args) {

		// 멤버객체 10개 선언하고 생성, 사용
//		Member m1 = new Member("ga","idNum1");
//		Member m2 = new Member("na","idNum2");
//		Member m3 = new Member("da","idNum3");
//		Member m4 = new Member("ra","idNum4");
//		Member m5 = new Member("ma","idNum5");
//		Member m6 = new Member("ba","idNum6");
//		Member m7 = new Member("sa","idNum7");
//		Member m8 = new Member("aa","idNum8");
//		Member m9 = new Member("ja","idNum9");
//		Member m10 = new Member("cha","idNum10");
		
		Member[] arr = new Member[10];			// 먼저 자리를 잡고
		
		// 배열 안에 멤버객체 생성 후 초기화
		arr[0] = new Member("ga","idNum1");
		arr[1] = new Member("na","idNum2");
		arr[2] = new Member("da","idNum3");
		arr[3] = new Member("ra","idNum4");
		arr[4] = new Member("ma","idNum5");
		arr[5] = new Member("ba","idNum6");
		arr[6] = new Member("sa","idNum7");
		arr[7] = new Member("aa","idNum8");
		arr[8] = new Member("ja","idNum9");
		arr[9] = new Member("cha","idNum10");
		
		// 출력문
		for(int i =0; i< arr.length; i++)
		{
			System.out.println((i+1) + "번째 이름 : " + arr[i].getName() + " / ID : " + arr[i].getID());
		}
	}

}
