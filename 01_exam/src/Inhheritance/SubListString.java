package Inhheritance;

public class SubListString extends ListString {
	String name = "림꺽정";
	
	@Override
	public void list()
	{
		// super.list();
		System.out.println(name+"하위클래스");
	}
	
	@Override
	public void write()
	{
		super.list();
	}
}
