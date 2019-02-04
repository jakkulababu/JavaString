package strings;

public class Intern {

	public static void main(String[] args) 
	{
		/*String str1="Babu working for Capgemini from last 12 years";
		String str2=new String("Capgemini").intern();
		System.out.println(str2);
		System.out.println(str1==str2);*/
		
		String str1="Hello";
		String str2="Hello";
		String str3="Hello".intern();
		String str4=new String("Hello");
		
		if(str1==str2) {System.out.println("Str1 and str2 are same");}
		if(str1==str3) {System.out.println("str1 and str3 are same");}
		if(str1==str4) {System.out.println("Str1 and str4 are same");}
		else {System.out.println("Str1 is not same as str4 as str4 is an object");}
			
		
		
	}

}
