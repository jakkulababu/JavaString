package array;

public class Search 
{

	public static void main(String[] args) 
	{
		char[] letters= {'a','b','c','d','8','d'};
		printReverse(letters);
		

	}
	public static void printReverse(char[] letters) 
	{
		for(int i=letters.length-1;i>=0;i--) 
		{
			System.out.print(letters[i]+ " ");
		}
	}

}
