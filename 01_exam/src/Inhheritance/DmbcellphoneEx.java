package Inhheritance;

public class DmbcellphoneEx {

	public static void main(String[] args) {

		// 자식클래스 객체 생성
		Dmbcellphone phone = new Dmbcellphone();
		
		// private가 아닌 필드는 자식 객체에서 사용가능
		phone.model = "java";
		phone.color = "Black";
		phone.channel =7;
		
		
		// private가 아닌 메소드는 자식 객체에서 사용가능
		phone.PowerOn();
		phone.turnOn();
		phone.changeChannelDmb(8);
		phone.turnOffDMB();
		phone.bell();
		phone.sendVoice("Hello");
		phone.receiveVoice("hi");
		phone.hangUp();
	}

}
