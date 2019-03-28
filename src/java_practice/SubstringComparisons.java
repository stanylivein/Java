package java_practice;


public class SubstringComparisons {

	public static void main(String[] args) 
	{
		java.util.Scanner in=new java.util.Scanner(System.in);
		String ip=in.next();
		int a=in.nextInt();
		java.util.List<String> strings=new java.util.ArrayList<String>();
		
		int i=0;
		int len=ip.length();
		while(i<len-(a-1))
		{
			strings.add(ip.substring(i,i+a));
			i++;
		}
		
		java.util.Collections.sort(strings);
		System.out.println(strings.get(0));
		System.out.println(strings.get(strings.size()-1));
		
		in.close();

	}

}
