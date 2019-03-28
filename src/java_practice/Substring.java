package java_practice;
import java.util.Scanner;

public class Substring
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		String input=in.next();
		
		int start=in.nextInt();
		int end=in.nextInt();
		
		String substring=input.substring(start, end);
		
		System.out.println(substring);
		
		in.close();
	}

}
