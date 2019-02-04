package array;

public class CharArray_001 
{

	public static void main(String[] args) 
	{
		char array[]= {'A','B','C','D','E'};
		
		for(int i=0;i<array.length;i++)
			{System.out.print(array[i]+"  ");}
			System.out.println();
		
		for(char c:array)
			{System.out.print(c+ "  ");}
			System.out.println();
			
		for(int x:array)
			System.out.print(x+" ");
		
		System.out.println("\nReverse order:");
		for(int y=array.length-1;y>=0;y--)
		{System.out.print(array[y]+ "-"+y+",");}
		
		

	}

}
