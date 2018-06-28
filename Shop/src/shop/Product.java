package shop;

public abstract class Product extends MyShop{

	private String pname;
	private int price;
	
	abstract void printDetail();
	abstract void printExtra();
	
	Product()
	{
		
	}
	
	Product(String pname, int price)
	{
		this.pname = pname;
		this.price = price;
	}
	
	public String getPname()
	{
		return pname;
	}
	public void setPname(String pname)
	{
		this.pname = pname;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}

	
}
