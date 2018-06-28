package Inter;

public class ActionEx {

	public static void main(String[] args) {	
		
		Action ac = new Action(){

			@Override
			public void work() {
				System.out.println("복사를 합니다.");
				
			}
			
		};
		ac.work();
	
	}
}
