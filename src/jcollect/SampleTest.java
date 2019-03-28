package jcollect;
import java.util.*;

public class SampleTest
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		int[][]a=new int[n][n];
		int[][]b=new int[n][n];
		
		
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j]=input.nextInt();
		
		
		//System.out.printf("len is: %d\n",a.length);
		ArrayOps ao=new ArrayOps();
		b=ao.rotateClock(a);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) 
			{
				System.out.printf("%d ",b[i][j]);
			}
			System.out.printf("\n");
		}
		input.close();
	}
}
