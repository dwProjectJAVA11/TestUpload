package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args)
	{
		Map<Integer,String> map = new HashMap<>();
		
		map.put(1, "홍길동");
		map.put(2, "김길동");
		map.put(3, "장길동");
		map.put(4, "고길동");
		
		// KeySet은 저장된 가
		Set<Integer> set = map.keySet();
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext())
		{
			Integer key = iter.next();
			String value = map.get(key);
			System.out.printf("%d : %s : \n",key,value);
			
		}
		
		map.remove(3);
		map.clear();
	}

}
