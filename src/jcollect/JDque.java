package jcollect;
import java.util.*;

public class JDque 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Deque<Integer> deque=new ArrayDeque<Integer>();
		HashSet<Integer> hset=new HashSet<Integer>();
		
		int n=in.nextInt();
		int m=in.nextInt();
		long max=0;
		
		for(int i=0;i<n;i++)
		{
			int val=in.nextInt();
			deque.add(val);
			hset.add(val);
			
			if(deque.size()==m)
			{
				//long count=deque.stream().distinct().count();
				long count=hset.size();
				max=count>max?count:max;
				
				int head=deque.remove();
				if(!deque.contains(head))
				{
					hset.remove(head);
				}
			}
		}
		
		System.out.println(max);
		in.close();
	}

}
