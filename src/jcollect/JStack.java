package jcollect;
import java.util.*;

public class JStack 
{
	public static void main(String[] args)
	{
		Scanner inp=new Scanner(System.in);
		Stack<Object> stack=new Stack<Object>();
		
		while(inp.hasNext())
		{
			String input=inp.next();
			char[] ch=input.toCharArray();
			boolean flag=false;
			int left=0;
			int right=0;
			
			for(int i=0;i<ch.length;i++)
			{
				char c=ch[i];
				if(c == '[' || c == '{' || c == '(')
				{
					stack.push(c);
					right++;
					flag=false;
				}
				else if(c == ']' || c == '}' || c == ')')
				{
					char s='a';
					if(!stack.empty())
					{
						s=stack.pop().toString().toCharArray()[0];
						left++;
					}
					
					if(c == ']' && s=='[' || c == '}' && s=='{' || c == ')' && s=='(')
					{
						flag=true;
					}
					else
					{
						flag=false;
						//break;
					}
				}
			}
			//System.out.println(left);
			//System.out.println(right);
			System.out.println(left==right && flag==true? "true": "false");
		}
		inp.close();
	}
}
