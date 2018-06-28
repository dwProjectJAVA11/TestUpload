package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest4 {

	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(5);
		
		print(list);
	}
	
	public static void print(List<Integer> list)
	{
		for(Integer mem : list)
			System.out.println(mem);
		System.out.println();
	}

}
