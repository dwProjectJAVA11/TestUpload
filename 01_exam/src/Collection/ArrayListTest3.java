package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListTest3 {

	public static void main(String[] args)
	{
		List<Member> list = new Vector<>();
		List<Member> list2 = new ArrayList<>();
		
		list.add(new Member(1,"name1"));
		list.add(new Member(15,"name15"));
		list.add(new Member(48,"name48"));
		list.add(new Member(64,"name64"));
		list.add(new Member(87,"name87"));
		
		print(list);
	}
	
	public static void print(List<Member> list)
	{
		for(Member mem : list)
			System.out.println(mem);
		System.out.println();
	}

}
