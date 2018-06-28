package CLS;

public class MethodTest2 {

	int sum(int a, int b)
	{
		return a+b;
	}
	
	
	void print (int a, int b)
	{
		int result = sum(a,b);
		System.out.println(result);
	}
	
	long func(int a, int b)
	{
		return a*b;
	}
	double divede(double a, double b)
	{
		return a/b;
	}
}
