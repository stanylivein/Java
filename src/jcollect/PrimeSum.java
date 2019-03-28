package jcollect;
import java.util.*;

public class PrimeSum 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		while(n-- >0)
		{
			double a=s.nextDouble();
	
			int b=(int)a;
			int c=2;
			int flag=0;
			
			for(int i=b-2;i>b/2;i--)
			{
				if(checkPrime(c)==1 && checkPrime(i)==1)
				{
					if(i+c==b)
					{
						System.out.println("I is "+ i + " C is "+ c +" Yes");
						//System.out.println("Yes");
						flag=1;
						//break;
					}
				}
				c++;
			}
			if(flag!=1)
			{
				System.out.println("No");
			}
		}
		s.close();
	}
	
	static int checkPrime(double a)
	{
		int b=(int) Math.sqrt(a);
		
		for(int i=2;i<=b;i++)
		{
			if(a%i==0)
			{
				return 0;
			}
			
		}
		return 1;
	}

}
