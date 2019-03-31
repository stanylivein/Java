package sorting;
//sorting package

public class MergeSort 
{
	public void mergeSort(int[] myarray)
	{
		int[] temp=new int[myarray.length];
		mergeSort(myarray,temp,0,myarray.length-1);
		
	}
	public void mergeSort(int[] myarray,int[] temp,int left,int right)
	{
		if(left>=right)
		{
			return;
		}
		int middle=(left+right)/2;
		mergeSort(myarray,temp,left,middle);
		mergeSort(myarray,temp,middle+1,right);
		mergeBoth(myarray,temp,left,right);
		
	}
	
	
	public void mergeBoth(int[] myarray,int[] temp,int left, int right)
	{
		int leftend=(right+left)/2;
		int rightstart=leftend+1;
		int size=right-left+1;
		
		
		int templeft=left;
		int tempright=rightstart;
		int index=left;
		
		while(templeft<=leftend && tempright<=right)
		{
			if(myarray[templeft]<=myarray[tempright])
			{
				temp[index]=myarray[templeft];
				templeft++;
			}
			else
			{
				temp[index]=myarray[tempright];
				tempright++;
			}
			index++;
		}
		System.arraycopy(myarray,templeft,temp,index,leftend-templeft + 1);
		System.arraycopy(myarray,tempright,temp,index,right-tempright + 1);
		System.arraycopy(temp,left,myarray,left,size);
	}
	
	public void print(int[] myarray)
	{
		for(int i=0;i<myarray.length;i++)
		{
			System.out.printf("%d,",myarray[i]);
			
		}
		System.out.printf("\n");
		
	}
}
