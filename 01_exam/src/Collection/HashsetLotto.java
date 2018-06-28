package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashsetLotto {

	public static void main(String[] args)
	{
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < 6; i++)
		{
			int num = (int) (Math.random() * 45) + 1;
			set.add(num);
		}

		// List는 sort메소드를 가지고 있지만 Set은 sort메소드가 없다.
		// 또한 다른 방법인 Collections.sort()는 list만 인자로 받는다.
		
		// 컬렉션끼리 서로 변환할 수 있도록 제공 (Set -> List)
		List<Integer> list = new ArrayList<>(set);
		
		Collections.sort(list);
		
		// HashSet은 중복값을 삭제하기 때문에 그 값이 삭제되어 6개 이하의 숫자가 출력될 수 도 있다.
		System.out.println(list.toString());

	}

}
