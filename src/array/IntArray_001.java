package array;

public class IntArray_001 
{

	public static void main(String[] args) 
	{
		int intarray[]=new int[5];
		intarray[0]=101;
		intarray[1]=102;
		intarray[2]=103;
		intarray[3]=104;
		intarray[4]=105;
		for(int i=0;i<intarray.length;i++)
		{
			//System.out.println("Index "+i+" value is : "+intarray[i]);
			System.out.print(intarray[i]+" ");
		}
		System.out.println();
		for(int x=intarray.length-1;x>=0;x--) 
		{
			System.out.print(intarray[x]+" ");
		}
	}
}