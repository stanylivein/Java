package java_practice;
import java.util.Scanner;
import java.util.regex.*;


public class PatternSyntaxChecker {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.nextLine());
		
		while(n-- >0)
		{
			String pattern=in.nextLine();
			try
			{
				Pattern.compile(pattern);
				System.out.print("Valid");
			}
			catch(PatternSyntaxException e)
			{
				System.out.println("Invalid");
			}
		}
		in.close();

	}

}
