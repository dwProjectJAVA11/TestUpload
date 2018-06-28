package poly;

import HasA.Vehicle;
import exam.Bus;

public class DriverEx {

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		v.run();
		
		Vehicle v2 = new Bus();
		
		Driver d = new Driver();
		d.drive(v2);
		
//		Bus bus = new Bus();
//		bus.run();
//		
//		Taxi taxi = new Taxi();
//		taxi.run();
		
		//Vehicle v2 = new Bus();
		//v2.run();
		
		//v2 = new Taxi();
		//v2.run();
	}
	
	static void print(Bus bus)
	{
		
	}

}
