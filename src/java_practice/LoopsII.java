package java_practice;
import java.util.Scanner;

public class LoopsII
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-- >0)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++)
            {
                int sum=0;
                for(int k=0;k<=j;k++)
                {
                	sum+=(int)(Math.pow(2,k)*b);
                }
                System.out.printf(a+sum+" ");
            }
            System.out.printf("\n");
        }
        in.close();
		
	}
}
