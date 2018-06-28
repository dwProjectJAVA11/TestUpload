package CLS;

public class GoodsStock {
	
	String goodsCode;
	int stockNum;
	
	GoodsStock(){}
	
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
