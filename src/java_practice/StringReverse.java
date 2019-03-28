package java_practice;
//import java.io.*;
import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		
		String inp=in.next();
		StringBuilder input=new StringBuilder();
		
		input.append(inp);
		input.reverse();
		
		String out=input.toString();
		
		if(inp.equals(out))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		in.close();
	}
}
