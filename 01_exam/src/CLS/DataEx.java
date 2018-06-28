package CLS;

public class DataEx {

	public static void main(String[] args) {

		Data obj = new Data();
		obj.x = 10;
		System.out.println("main : x = " + obj.x);

		change(obj);
		System.out.println("After change(d.x)");
		System.out.println("man : " + obj.x);

	}

	static void change(Data d) // 값의 보가가
	{
		d.x = 1000;
		System.out.println("change : " + d.x);
	}

}

// 기본타입을 넘기면 값의 복사가 일어나고
// 배열이나 갹체를 넘기면 주소댮이 이동함