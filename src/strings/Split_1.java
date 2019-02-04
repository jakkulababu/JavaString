package strings;

public class Split_1 
{
	public static void main(String[] args) 
	{
		String s = new String("bbaaccaa");
		//Splitting with limit as 0
		String arr2[]= s.split("c", 0);
		System.out.println("Zero Limit split:");
		for (String str2: arr2)			{	  System.out.println(str2);		}
		//Splitting with negative limit
		String arr1[]= s.split("a", -1);
		System.out.println("Negative Limit split:");
		for (String str: arr1)			{		System.out.println(str);	}
	    System.out.println("End of program");
	}

}
