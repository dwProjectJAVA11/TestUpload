package Collection;

import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetEx {
	public static void main(String[] args)
	{
		Set<String> set = new HashSet<>();
		
		// set은 순서를 저장할 수 없고 순차적으로 저장되지 않는다.
		
		set.add("java");
		set.add("ss");
		set.add("java");		// 중복
		set.add("JDBC");
		
		for(String str : set)
			System.out.println(str);
		
	}
}
