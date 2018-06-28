package Obj;

public class Member {
	private String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member)
		{
			
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return id+"";
	}
}
