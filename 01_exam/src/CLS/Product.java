package CLS;

public class Product {

	String p_Code;
	String p_Name;
	String p_Company;
	int price;
	int discount;
	
	Product(String p_Code, String p_Name, String p_Company, int price, int discount)
	{
		this.p_Code = p_Code;
		this.p_Name = p_Name;
		this.p_Company = p_Company;
		this.price = price;
		this.discount = discount;
	}
	
	Product(String p_Code, String p_Name, String p_Company, int price)
	{
		this.p_Code = p_Code;
		this.p_Name = p_Name;
		this.p_Company = p_Company;
		this.price = price;
	}
	
	void setDiscount(int discount)
	{
		this.discount = discount;
	}
	
	void sellPrice()
	{
		this.price -= (this.price)*((this.discount)/100);
	}
}
