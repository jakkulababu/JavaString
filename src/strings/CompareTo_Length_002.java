package strings;

public class CompareTo_Length_002 {

	public static void main(String[] args) 
	{
		String str1="Babu";
		String str2="";
		
		
		int var=str2.compareTo(str2);
		System.out.println(var);
		
		int var2=str1.compareTo(str2);
		System.out.println(var2);

		String str3="BABU";
		String str4="babu";
		int comp1=str3.compareTo(str4);
		System.out.println(comp1);
		
	}

}
