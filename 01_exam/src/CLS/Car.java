package CLS;

public class Car {

	// 왜 전부 this로 묶는건 안되나용 -> 생성자를 불러서 쓰는 것이기 때문에 안되는 것이 었다!!!
	
	String comapny ="";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자 오버로딩
	Car(){	}
	
	Car(String model){
		this.model = model;
	}
	
	Car(String model, String color){
		this(model);
		//this.model = model;
		this.color = color;
	}
	
	Car(String model,String color,int maxSpeed){
		this(model, color);
		//this.model = model;
		//this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	Car(String model,String company,String color,int maxSpeed){
		this(model, color,maxSpeed);
		//this.model = model;
		//this.color = color;
		//this.maxSpeed = maxSpeed;
	}
	
	
	
}
