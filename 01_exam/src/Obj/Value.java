package Obj;

public class Value {
	
	int value;
	
	public Value(int va)
	{
		this.value = va;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		// value값이 같으면 true 결과 리턴
		// 다를 경우 false 리턴
		
		// obj가 value 객체로 변환할 수 있는지 확인
		if(obj instanceof Value)
		{
			Value v = (Value)obj;		// 캐스팅
			
			if(this.value == v.value)
				return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return value+"";
	}

}
