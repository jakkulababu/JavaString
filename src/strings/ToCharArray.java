package strings;

public class ToCharArray 
{
	public static void main(String[] args) 
	{
		String str="Welcome";
		char[] array=str.toCharArray();
		
		System.out.print("ASCII codes are :");
		for(int i:array) 
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.print("Charaters are : ");
		for(char c:array) 
		{
			System.out.print(c+"   ");
		}System.out.println();System.out.print("Index are : ");
		for(short j=0;j<array.length;j++) 
		{
			System.out.print(j+" ");
		}

	}

}
