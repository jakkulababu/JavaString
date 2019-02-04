package strings;

import java.util.Locale;

public class Contains {

	public static void main(String[] args) 
	{
		String str="Babu working in capgemini";
		
		String str2=str.toLowerCase();String str3=str.toUpperCase();
		System.out.println(str2+"\n"+str3);
		System.out.println(str.toLowerCase().contains(str.toLowerCase(Locale.getDefault())));
		
		System.out.println(str.contains("in"));
		boolean flag=true;
		if(str.contains("working"))
		{
			flag=true;
			System.out.println("Test passed...Awesome");
		}
		else
		{
			flag=false;
			System.out.println("Test failed...!");
		}

	}

}
