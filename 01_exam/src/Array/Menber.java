package Array;

public class Menber implements Comparable<Menber>{
	private String name;
	private Integer java;
	
	public Menber(String name,int java) {
		this.name=name;
		this.java=java;
	}
	@Override
	public String toString() {
		return name+":"+java;
	}
	@Override
	public int compareTo(Menber o) {
		//정렬조건 
		return this.java.compareTo(o.java);
	}	
}








