package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest1 {
	
	public static void main(String[] args)
	{
		List<String> list = new LinkedList<String>();
		List<String> list2 = new ArrayList<String>();
		
		long startTime, endTime;
		
		/////
		startTime = System.nanoTime();
		for(int i= 0;i<100000;i++)
			list.add(0,String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("LinkeList 걸린시간 : " + (endTime - startTime) + "ns");
		
		//////
		startTime = System.nanoTime();
		for(int i= 0;i<100000;i++)
			list2.add(0,String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간 : " + (endTime - startTime) + "ns");
		
	}
}
