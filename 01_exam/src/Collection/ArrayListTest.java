package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

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
		list.add("SW");
		
		// 리스트 요소 출력
		for(String e : list)
			System.out.println(e);
		
		System.out.println(list.toString());
		
	}

}
