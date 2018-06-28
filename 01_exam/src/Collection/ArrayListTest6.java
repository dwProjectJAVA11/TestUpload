package Collection;

import java.util.Arrays;
import java.util.List;

public class ArrayListTest6 {

	public static void main(String[] args)
	{
		// 배열 <-> 리스트
		// 여기부분 뭔가 코드가 이상해 졸아서 빠진부분이 많은듯
		List<String> list = Arrays.asList("Java","java","Strawberry","Sleep","Cold","Swing");
		
		String[] fruits = {"사과","포도","딸기","레몬","바나나"};
		
		List<String> fr =Arrays.asList();
		
		Object[] obj = list.toArray();
		
		for(Object i : obj)
			System.out.println(i);
	}

}
