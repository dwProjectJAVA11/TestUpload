package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		
		// 리스트 초기화
		list.add("hi");
		list.add("hello");
		list.add("JAVA");
		list.add(2,"C++");
		list.add("Linux");
		list.add("Swing");
		list.add("SW");
		
		// 리스트 사이즈 출력
		System.out.println("List Size : " + list.size());
		
		print(list);
		
		// 아이템 삭제
		list.remove("C++");

		// 객체를 담고있는지 확인
		System.out.println(list.contains("JAVA"));
		
		// 특정 위치의 객체 가져오기
		System.out.println(list.get(1));
		
		// print(list);
		
	}
	
	public static void print(List<String> list)
	{
		for(String str : list)
			System.out.println(str);
		System.out.println();
	}

}
