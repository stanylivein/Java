package java_practice;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		
		String str1=in.next();
		String str2=in.next();
		
		in.close();
		boolean ret=isAnagram(str1,str2);
		
		System.out.print( ret? "Anagrams": "Not Anagram");
	}
	
	static boolean isAnagram(String str1,String str2)
	{
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		char a[]=str1.toCharArray();
		char b[]=str2.toCharArray();
		
		java.util.Arrays.sort(a);
		java.util.Arrays.sort(b);
		
		if(java.util.Arrays.toString(a).equals(java.util.Arrays.toString(b)))
			return true;

		return false;
	}

}
