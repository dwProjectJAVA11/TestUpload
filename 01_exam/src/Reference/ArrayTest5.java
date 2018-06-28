package Reference;

public class ArrayTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[] {1,2,3,4,5};
		int iArr3[] = {100,95,85,65};
		char[] chArr = {'a','n','s','w','e','r'};
		
		for(int i=0;i<iArr1.length;i++) 
			iArr1[i] = i+1;

		for(int i=0;i<iArr2.length;i++) 
			System.out.println(iArr2[i]);

		for(int i=0;i<iArr3.length;i++)
			System.out.println(iArr3[i]);
		
		System.out.println(chArr);

	}

}
