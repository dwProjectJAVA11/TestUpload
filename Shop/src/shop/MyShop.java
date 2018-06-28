package shop;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop {

	Scanner sc = new Scanner(System.in);
	ArrayList<Product> cart = new ArrayList<>();
	Product[] products = new Product[4];
	Product p;
	User[] users = new User[3];

	
	private String title;
	private int selUser;

	void productList()
	{
		System.out.println(title + " : 상품목록 - 상품선택");
		for (int i = 0; i < products.length; i++)
		{
			System.out.println("[" + i + "] 상품이름 : " + products[i].getPname());
			System.out.println("가격 : " + products[i].getPrice());
			products[i].printExtra();
		}

		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");

		String c = sc.next();

		switch(c) {
		case "h" : start(); break;
		case "c" : System.out.println("## " + c + " 선택 ##");	checkOut();	break;
		default : if( Integer.parseInt(c) >= 0 && Integer.parseInt(c) < products.length) {
			//cart = new ArrayList<Product>();
			cart.add(products[Integer.parseInt(c)]);
			productList();
		}
		}
	}

	void checkOut()
	{
		int order = 0;
		int priceSum = 0;
		// 장바구니 담기

		for (Product p : cart)
		{
			System.out.println("[" + order + "] 이름 : " + p.getPname() + ", 가격 : " + p.getPrice());
			order++;
			priceSum = p.getPrice();
		}

		System.out.println("결제방법 : " + users[selUser].getPayType());
		System.out.println("합계 : " + priceSum + "원");
		System.out.println("[p]이전, [q]결제완료");

		String c = sc.next();

		if (c.equals("p"))
			productList();

		else if (c.equals("q"))
		{
			System.out.println("## 결제가 완료되었습니다. 종료합니다. ##");
		}

		else
		{
			System.out.println("잘못된 명령입니다.");
			checkOut();
		}

	}

	@Override
	public void setTitle(String title)
	{
		// 쇼핑몰 이름 설정
		this.title = title;
	}

	@Override
	public void genUser()
	{
		// 사용자 정보를 입력받고 객체 생성 후 배열에 저장
		users[0] = new User("홍길동", payType.CARD);
		users[1] = new User("블로거", payType.CASH);
		users[2] = new User("종료", null);

	}

	@Override
	public void genProduct()
	{
		// Cellphone,smartTV생성 후 배열에 저장
		products[0] = new CellPhone("갤럭시 노트5", 1000000, "SKT");
		products[1] = new CellPhone("애플 아이폰7", 980000, "KT");
		products[2] = new SmartTV("삼성 3D Smart TV", 5000000, "4K");
		products[3] = new SmartTV("LG Smart TV", 1000000, "Full HD");
	}

	@Override
	public void start()
	{
		selUser = 0;
		System.out.println(title + " : 메인화면 -> 계정선택");
		System.out.println("-------------------------");
		for (int i = 0; i < users.length; i++)
			System.out.println("[" + i + "] " + users[i].getName() + "(" + users[i].payType + ")");

		System.out.print("선택 : ");
		int choice = sc.nextInt();
		if (choice >= 0 && choice < users.length - 1)
		{
			selUser = choice;
			System.out.println("## " + choice + "선택 ##");
		} else if (users[choice].payType == null)
		{
			System.out.println("종료합니다.");
		} else
		{
			System.out.println("다시 선택해주십시오.");
			start();
		}
	}

}
