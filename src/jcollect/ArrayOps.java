package jcollect;

public class ArrayOps 
{
	public int[][] rotateClock(int[][] arr)
	{
		int n=arr.length;
		int[][] a=new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=arr[n-j-1][i];
			}
		}
		return a;
	}
	
	public int[][] rotateCClock(int[][] arr)
	{
		int n=arr.length;
		int[][] a=new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=arr[j][n-i-1];
			}
		}
		return a;
	}

}
