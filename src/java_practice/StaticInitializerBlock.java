package java_practice;
import java.util.*;
//import java.io.*;

public class StaticInitializerBlock 
{
	static int B=0,H=0;;
	static boolean flag=false;
	
	static
	{
		Scanner in=new Scanner(System.in);
		B=in.nextInt();
		H=in.nextInt();
		in.close();
	
		if(B>0 && H>0)
		{
			flag=true;
		}
		else
		{
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}
	
	
	public static void main(String[] args)
	{
			if(flag)
			{
				int area=B*H;
				System.out.print(area);
			}
			
	}

}
