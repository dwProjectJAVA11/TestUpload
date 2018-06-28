package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest2 {
	
	public static void main(String[] args)
	{
		List<String> list = new LinkedList<String>();
		List<String> list2 = new ArrayList<String>(100000000);
		
		long startTime, endTime;
		
		/////
		startTime = System.nanoTime();
		for(int i= 0;i<100000;i++)
			list.add(String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("LinkeList 걸린시간 : " + (endTime - startTime) + "ns");
		
		//////
		startTime = System.nanoTime();
		for(int i= 0;i<100000;i++)
			list2.add(String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("Array_List 걸린시간 : " + (endTime - startTime) + "ns");
		
	}
}
