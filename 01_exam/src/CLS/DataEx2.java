package CLS;

public class DataEx2 {
	public static void main(String[] args) {

		Data obj2 = new Data();
		obj2.x = 10;
		System.out.println("main : x = " + obj2.x);

		//change(obj2);
		System.out.println("After change(d.x)");
		System.out.println("man : " + obj2.x);

//		 static Data change(Data d) // 값의 보가가
//		 {
//			 d.x = 1000;
//			 System.out.println("change : "+d.x);
//			 return d;
//		 }
		
	}
		static Data change(Data obj)
		{
			obj.x = 1000;
			System.out.println("Change() : x =" + obj.x);
			return obj;
		}

	

}
