package array;

public class AlphaOrder 
{

	public static void main(String[] args) 
	{
		char[] letters= {'a','d','k','b','c'};
		aplhaOrder(letters);

	}
	public static void aplhaOrder(char[] letters) 
	{
		for(char ch = 'a'; ch <= 'z'; ch++) 
		{
			System.out.print(ch);
		}
	}

}
