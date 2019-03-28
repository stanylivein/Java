package jcollect;
import java.util.*;

public class HSet 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		String[] pair_left=new String[t];
		String[] pair_right=new String[t];
		
		
		for(int i=0;i<t;i++)
		{
			pair_left[i]=s.next();
			pair_right[i]=s.next();
		}
		
		HashSet<String> myset=new HashSet<String>(t);
		
		for(int i=0;i<t;i++)
		{
			myset.add(pair_left[i]+" "+pair_right[i]);
			System.out.println(myset.size());
		}
	s.close();	
	}
}