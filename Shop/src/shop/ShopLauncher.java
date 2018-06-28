package shop;

public class ShopLauncher {

	public static void main(String[] args)
	{
		MyShop ms = new MyShop();
		//쇼핑몰 이름 설정
		ms.setTitle("MyShop");
		
		//쇼핑몰 사용자 생성
		ms.genUser();
		
		//쇼핑몰 제품 등록
		ms.genProduct();
		
		ms.start();
		
		ms.productList();
		
		
		
	}

}
