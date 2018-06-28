package Except;

public class CheckedExept {

	public static void main(String[] args) {
		
		// 컴파일러 체크 exception
		
		try {		
			Class.forName("");
		}	catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}

}
