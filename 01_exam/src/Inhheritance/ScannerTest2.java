package Inhheritance;

import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {

	Scanner sc = new Scanner("\n\n\nHello\n\nTest\n");
		
		while(sc.hasNext())			// hasNext
			System.out.println("ㅜㄹ력 : "+sc.nextLine());
		
		while(sc.hasNext())			// hasNext
			System.out.println("ㅜㄹ력 : "+sc.next());
		
	}

}
