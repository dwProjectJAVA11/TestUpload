package Modifier2;

import Modifier.Test;

public class TestpackageEx2 {

	public static void main(String[] args) {

		// Modifier에 선언된 TestPackage 객체 생성 후 사용 -> default 클래스로 선언되었기 때문에 X
		// TestPackage obj = new TestPackage();
		
		
		// Modifier에 선언된 Test 객체 생성, 사용
		Test obj2 = new Test(22,"Test");

	}

}
