package java_practice;
import java.util.Scanner;


public class StringTokens
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		
		String str=in.nextLine();
		
		str=str.trim();
		
		//String[] strs=str.split("[ !,?._'@]+");
		String[] strs=str.split("[^a-zA-Z]+");
		
		System.out.println(str.length()==0? 0: strs.length);
		
		for(String a : strs)
		{
			System.out.println(a);
		}
		
		in.close();
	}

}
