package jcollect;
import java.util.*;

public class JDque2 
{
public static void main(String[] args)
{
	Scanner in=new Scanner(System.in);
	Deque<Integer> deque=new ArrayDeque<Integer>();
	HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
	
	int n=in.nextInt();
	int m=in.nextInt();
	long max=0;
	
	for(int i=0;i<n;i++)
	{
		if(i>=m)
		{
			int rem=deque.remove();
			
			rem=hmap.get(rem)>1?hmap.put(rem, hmap.get(rem)-1):
				hmap.remove(rem);
			
		}
		int val=in.nextInt();
		deque.add(val);
		//hmap.merge(val,1,Integer::sum);
		hmap.put(val,hmap.get(val)!=null?hmap.get(val)+1:1);
		max=hmap.size()>max?hmap.size():max;
	}
	System.out.println(max);
	in.close();
}

}
