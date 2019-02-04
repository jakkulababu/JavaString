package strings;
public class Matches 
{
	public static void main(String[] args) 
	{
		 String str = new String("Java String Methods");
	    // System.out.print("Regex: (.*)Java(.*) matches string? " );
	     System.out.println(str.matches("(.*)Java (.*)"));
         //System.out.print("Regex: (.*)Strings(.*) matches string? " );
	     System.out.println(str.matches("(.*)string(.*)"));
	     //System.out.print("Regex: (.*)Methods matches string? " );
	     System.out.println(str.matches("(.*)Methods"));
	}
}