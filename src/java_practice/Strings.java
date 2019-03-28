package java_practice;
import java.util.Scanner;

public class Strings 
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		
		String A=in.next();
		String B=in.next();
		
		System.out.println(A.length()+B.length());
		
		System.out.println(A.compareTo(B)>0?"Yes":"No");
		
		String AA=A.substring(0,1).toUpperCase()+A.substring(1,A.length());
		String BB=B.substring(0,1).toUpperCase()+B.substring(1,B.length());
		
		System.out.println(AA+" "+BB);
		
		in.close();
		
	}

}
