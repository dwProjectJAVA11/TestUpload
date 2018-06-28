package Obj;

public class Person {
	private String id;
	private String name;
	
	public Person(String id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Person) 
		{
			Person p = (Person)obj;		// 캐스팅
			if(p.id.equals(this.id) && p.name.equals(this.name))
				return true;
		}
		return false;

	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	public String getID()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	
}
