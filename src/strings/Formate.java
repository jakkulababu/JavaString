package strings;

public class Formate {

	public static void main(String[] args) 
	{
		String str="Just a string";
		String str2="12.203040";
		
		String formatedstring=String.format("My String is %s", str);
		
		System.out.println(formatedstring);
		
		String formatedstring1=String.format("My String is %6f", 12.20302);
		System.out.println(formatedstring1);
		
		String formatedstring2=String.format("My String is %d", 12);
		System.out.println(formatedstring2);
	}

}
