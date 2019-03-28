package jcollect;

import java.util.*;
import java.util.Map;
import java.util.ArrayList;


public class JMap
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		Map<String,ArrayList<Integer>> mp=new HashMap<String,ArrayList<Integer>>();
		
		while(n-- >0)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
			
			ArrayList<Integer> lst=null;
			lst=mp.get(name);
			if(lst!=null)
			{
				lst.add(phone);
			}
			else
			{
				lst=new ArrayList<>();
				lst.add(phone);
			}
			mp.put(name,lst);
		}
		
		
		/*
		for(String nam:mp.keySet())
		{
			String key=nam.toString();
			String phon=mp.get(key).toString();
			System.out.println(key+ " "+phon);
			
		}*/
		
		
		while(in.hasNext())
		{
			String s=in.nextLine();
			Object value=mp.get(s);
			System.out.println(mp.get(s)==null? "Not found" : s + "=" + value.toString()
			.replace("[","")
			.replace("]","")
			.replace(" ",""));
		}
		in.close();
	}
}
