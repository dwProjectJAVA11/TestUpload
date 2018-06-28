package CLS;

public class GoodsStock2 {
	
	String goodsCode;
	int stockNum;
	
	GoodsStock2(){}
	
	GoodsStock2(String goodsCode, int stockNum)	// 생성자 오버로딩 : 동일한 이름으로 하나의 클래스에 여러 개 존재하는 것
	{
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	
	void addStock(int stockNum1)
	{	
		stockNum += stockNum1;
		//	이름이 같을 때만 this를 사용하는건가요?
		
		// this.stockNum++;
		// stockNum++;
	}

	int subStock(int stockNum)
	{
		if(this.stockNum >= stockNum)
			this.stockNum -= stockNum;
		return this.stockNum;
	}
	
}
