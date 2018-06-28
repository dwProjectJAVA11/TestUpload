package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {

	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<>();
		
		map.put("id_0123", "1234");
		map.put("id_0124", "1234");
		map.put("id_0125", "4567");
		map.put("id_0126", "1031");
		
		System.out.println(map.toString());
		
		// 특정 키 값만 출력하고 싶다면 get()	-> 특정 키 값의 value출력
		System.out.println(map.get("id_0123"));
		
		System.out.println("전체 Entry 수 : " + map.size());

	}

}
