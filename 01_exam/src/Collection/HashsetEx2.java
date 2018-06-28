package Collection;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetEx2 {

	public static void main(String[] args)
	{
		// Hashset -> 중복된 값이 저장되지 않으며 순서가 정해져 있지않다.
		Set<String> set = new HashSet<>();
		
		set.add("java");
		set.add("ss");
		set.add("JAVA");
		set.add("JDBC");
		
		// list는 get가능
		// for(int i =0;i<set.size();i++)
		// 	System.out.println(set.get(i));

		System.out.println(set.toString());
		// 결과가 16진수로 뜨면 오버라이딩이 안되어있는 것!
		
		// 컬렉션에 저장된 요소들을 읽어오는 방법 표준화
		Iterator<String> iter = set.iterator();
		while(iter.hasNext())
			System.out.println(iter.next() + " ");
		
		
	}

}
