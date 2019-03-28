package jcollect;
import java.util.*;

public class JStack2 
{
	public static void main(String[] args)
	{
		Scanner inp=new Scanner(System.in);
		Stack<Character> stack=new Stack<>();
		
		while(inp.hasNext())
		{
			String input=inp.next();
			
			for(int i=0;i<input.length();i++)
			{
				char c=input.charAt(i);
				if(c == '[' || c == '{' || c == '(')
				{
					stack.push(c);
				}
				if(c == ']' || c == '}' || c == ')')
				{
					if(stack.isEmpty())
					{
						stack.push(c);
					}
					else
					{
						char s=stack.peek();
						if(s == '[' || s == '{' || s == '(') 
						{
							stack.pop();
						}
					}
				}
			}
			System.out.println(stack.isEmpty());
			stack.removeAllElements();
		}
		inp.close();
	}
}
