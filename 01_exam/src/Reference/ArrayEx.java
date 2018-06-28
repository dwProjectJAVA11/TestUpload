package Reference;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {75,50,28,83,97,99,81,64,70,48,150};
		
		int max = 0;
		int sum = 0;
		for(int i =0;i<array.length;i++)
		{
			
			sum+=array[i];
			
			if(i == 0)
				max = array[i];
			else
			{
				if(array[i] > max)
					max = array[i];			
			}
			
		}
		 
		System.out.println("최대값은 " + max);
		System.out.println("전체 항목의 합 : " +sum+" 과 평균 : "+(sum/array.length));
		
	}
	
}
