package jcollect;
//import java.util.*;

public class ReversingVowels 
{
	public ReversingVowels()
	{
		
	}
	
	public String reversingVowels(String mystr)
	{	
		char[] vowels= {'a','e','i','o','u'};
		char[] str=mystr.toCharArray();
		int[] location=new int[str.length];
		
		int i,j,k=0,len=0;
		
		for(i=0;i<mystr.length();i++)
		{
			for(j=0;j<vowels.length;j++)
			{
				if(str[i]==vowels[j])
				{
					location[k++]=i; //STORING THE LOCATION INDEX
					len++;//SUM OF VOWELS
				}
			}
		}
		
		for(i=0;i<len/2;i++)//interchanging vowels
		{
			char a=str[location[i]];
			str[location[i]]=str[location[len-1-i]];
			str[location[len-1-i]]=a;
		}
		
		
		return new String(str);
	}

}
