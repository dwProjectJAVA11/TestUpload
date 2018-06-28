package CLS;

public class GoodsStockEx2 {

	public static void main(String[] args) {

		// 1. 변수을 통해서 직접 지정	2. 생성자를 통해서 지정
		GoodsStock2 goods = new GoodsStock2();
		GoodsStock2 goods2 = new GoodsStock2("52136",100);

		goods.goodsCode = "52135";
		goods.stockNum= 200;
		goods.addStock(100);
				
		System.out.println("상품코드 : "+goods.goodsCode);
		System.out.println("재고수량 : "+goods.stockNum);

		System.out.println("상품코드2 : "+goods2.goodsCode);
		System.out.println("재고수량2 : "+goods2.stockNum);
		
		
	}

}
