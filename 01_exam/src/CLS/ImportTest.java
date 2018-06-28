package CLS;

import java.io.File;
import java.util.Scanner;

import loop.ForTest6;

public class ImportTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String st = new String();		// import문 필요없음 -> java.lang.*은 처음부터 삽입되어 있다. ex) Math.PI
		
		File f = new File(":c\\test");
		
		ForTest6 test = new ForTest6();		// 내 것도 import할 수 있다. 다른 패키지에 있는 클래스를 import할 수 있다.!

	}

}
