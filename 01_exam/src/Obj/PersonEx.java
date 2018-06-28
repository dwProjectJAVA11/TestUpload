package Obj;

public class PersonEx {

	public static void main(String[] args) {

		//id랑 name이 같으면 같은 사람이다.
		
		Person p1 =new Person("kim","kim");
		Person p2 =new Person("Park","Park");
		
		
		
		if((p1.getID()).equals(p1.getName()))
		{
			System.out.println("ID와 Name이 같으며 같은 사람입니다.");
		}
		else	System.out.println("ID와 Name이 다릅니다.");
		
	}

}
