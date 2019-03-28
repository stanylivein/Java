package jcollect;
//import java.util.*;

public class RemoveDuplicate 
{
	public String removeDuplicate(String original)
	{
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<original.length();i++)
		{
			if(sb.indexOf(""+original.charAt(i))==-1)
			{
				sb.append(original.charAt(i));
			}
		}
		return sb.toString();
	}
	
	
	
	/*public String removeDuplicate(String original)
	{
		StringBuilder sb=new StringBuilder();
		int j=0;
		for(int i=0;i<original.length();i++)
		{
			for(j=0;j<i;j++)
			{
				if(original.charAt(i)==original.charAt(j))
				{
					break;
				}
			}
			if(i==j)
			{
				sb.append(original.charAt(i));
			}
		}
		return sb.toString();
	}*/

}

/*

aabbccdd
abcd




*/