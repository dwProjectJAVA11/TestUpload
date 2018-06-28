package shop;

public class CellPhone extends Product{

	private String carrier;
	
	CellPhone(String pname,int prc, String carrier)
	{
		super(pname, prc);
		this.carrier = carrier;
	}
	
	@Override
	void printDetail()
	{
		
	}

	@Override
	void printExtra()
	{
		System.out.println("통신사 정보 : " + carrier);
	}

	
}
