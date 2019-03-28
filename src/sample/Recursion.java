package sample;

public class Recursion 
{
	
	
	public static int factorial(int n)
	{
		if(n>1)
			n*=factorial(n-1);
		return n;
	}
	
	public static int fibonacci(int n)
	{
		if(n<=1)
			return n;
		else
		{
			int left=fibonacci(n-1);
			int right=fibonacci(n-2);
			return left+right;
		}
		
	}

	public static void main(String[] args)
	{
		System.out.printf("%d",fibonacci(3));
	}

}
