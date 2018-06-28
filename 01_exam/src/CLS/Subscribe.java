package CLS;

public class Subscribe {

	String name;
	String ID;
	String passwd;
	String tel;
	String address;
	
	Subscribe()
	{
		
	}
	
	void changepasswd(String passwd)
	{
		this.passwd = passwd;
	}

	void setPhoneNumber(String tel)
	{
		this.tel =tel;
	}
	
	void setAddress(String address)
	{
		this.address = address;
	}

}

