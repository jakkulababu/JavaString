package array;
public class IntArray_003_FindingMinAndMax 
{
	static void min(int array[]) 
	{
		int min=array[0];
		for(int i=0;i<array.length;i++) 
			if(min>array[i])
			min=array[i];
			System.out.println(": Minimum value from the given Array is :"+ min);		
	}
	static void max(int array[]) 
	{
		int max=array[0];
		for(int i=0;i<array.length;i++) 
			if(array[i]>max)
			max=array[i];
			System.out.println(": Maxmum value from the given array is : "+max);		
	}
	public static void main(String...args) 
	{
		int a[]= {33,4,2,93,53};
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" , ");
		min(a);
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" , ");
		max(a);
	}
}