package java_practice;
import java.util.*;
//import java.io.*;


public class EndOfFile 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int i=1;
		
		while(in.hasNext())
		{
			System.out.println(i++ +" "+ in.nextLine());
		}
		in.close();
	}

}
