package Modifier;

public class StudentEx {

	public static void main(String[] args) {
		Student stuArr[] = new Student[5];
		
		 stuArr[0] = new Student(50,50,50,"kim","ID123");
		 stuArr[1] = new Student(40,60,50,"park","ID124");
		 stuArr[2] = new Student(50,80,50,"Lee","ID125");
		 stuArr[3] = new Student(80,50,70,"Jeong","ID126");
		 stuArr[4] = new Student(50,90,60,"kang","ID127");
		 
		 for(int i=0;i<stuArr.length; i++)
		 {
			 stuArr[i].print(stuArr[i].getScoreC()+stuArr[i].getScoreJava());
		 }
	}

}
