package CLS;

public class GoodsStockEx {

	public static void main(String[] args) {

		GoodsStock goods = new GoodsStock();
		// 1. 변수을 통해서 직접 지정	2. 생성자를 통해서 지정

		goods.goodsCode = "52135";
		goods.stockNum= 200;
				
		System.out.println("상품코드 : "+goods.goodsCode);
		System.out.println("재고수량 : "+goods.stockNum);
		
		goods.addStock(100);
		
		
	}

}
