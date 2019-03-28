package sorting;
import java.util.*;
import java.io.*;

public class Test 
{
	public static void main(String[] args)throws IOException
	{
		Scanner in=new Scanner(System.in);
		BufferedReader breader = new BufferedReader(new FileReader("input.txt"));
		BufferedWriter bwriter = new BufferedWriter(new FileWriter("output.txt"));
		
		
		//int n=0;//=in.nextInt();
		//in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		int i=0;
		
		
		String line;
		String[] arrItems=new String[50];// = in.nextLine().split(" ");
		
		/*
		if((line=breader.readLine())!=null)
		{
			n=Integer.parseInt(line);
		}*/
		
		
		
		
		
		
		while((line=breader.readLine())!=null)
		{
			arrItems = line.split(" ");
			
		}
		
		int n=arrItems.length;
		int[] myarray=new int[n];
		
		//String[] arrItems = in.nextLine().split(" ");
        //in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
        
		while(n-- >0)
		{
			myarray[i]=Integer.parseInt(arrItems[i++]);
		}
		
		
		MergeSort msort=new MergeSort();
		//msort.print(myarray);
		msort.mergeSort(myarray);
		bwriter.write(Arrays.toString(myarray));
		//msort.print(myarray);
		
		bwriter.close();
		breader.close();
		in.close();
		
		System.out.println("done");
	}

}
