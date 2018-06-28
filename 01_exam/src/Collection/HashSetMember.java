package Collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetMember {

	public static void main(String[] args)
	{
		Set<Member> set = new HashSet<>();
		
		// 원래 set은 동일한 값 저장안하는데 사용자 정의 클래스로 저장하면서 중복값이 들어간다.
		// Member클래스로 가서 수정해주자.
		
		/*
		 HashSet은 객체를 저장하기 전에 먼저 객체의 HashCode()를 호출해서 해시코드를 얻어낸 다음
		 동일한 해시코드라면 그 다음에 equals()까지 비교한 후 true일 경우
		 두 객체가 같다고 판단하여 저장하지 않는다.
		 1. 해시코드를 비교	2. equals	를 비교해서 저장여부 판단		 
		 */
		
		set.add(new Member(1024,"박보검"));
		set.add(new Member(1025,"김다슬"));
		set.add(new Member(1024,"박보검"));
		
		// Member 클래스에 해시코드와 이퀄즈 생성했더니 중복값 비교됨
		for(Member mem : set)
			System.out.println(mem);
		
		
	}

}
