package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListTest5 {

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();

		// 리스트 초기화
		list.add("hi");
		list.add("hello");
		list.add("JAVA");
		list.add("C++");
		list.add("Linux");
		list.add("Swing");
		list.add("zoo");

		System.out.println(list.indexOf("C++"));
		list.sort(Comparator.naturalOrder());
		list.sort(Comparator.reverseOrder());
		
		Collections.sort(list);	// 오름차순
		Collections.sort(list, Comparator.reverseOrder());	// 내림차순
		
		for(String e : list)
			System.out.println(e);
		
		
	}
}
