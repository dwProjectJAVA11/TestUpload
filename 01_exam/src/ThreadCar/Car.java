package ThreadCar;

public class Car {
	
	Tire frontLeftTrie = new Tire("앞왼쪽",6);
	Tire frontRightTrie = new Tire("앞왼쪽",6);
	Tire backLeftTrie = new Tire("앞왼쪽",6);
	Tire backRightTrie = new Tire("앞왼쪽",6);

	int run()
	{
		System.out.println("run");
		if(frontLeftTrie.roll() == false) {	stop(); return 1;}
		if(frontRightTrie.roll() == false) {stop(); return 2;}
		if(backLeftTrie.roll() == false) {	stop(); return 3;}
		if(backRightTrie.roll() == false) {	stop(); return 4;}
		
		return 0;
	}
	
	void stop()
	{
		System.out.println("stop");
	}
}
