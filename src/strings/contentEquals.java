package strings;

public class contentEquals {

	public static void main(String[] args) 
	{
		String str1="First String";
		String str2="Secound String";
		StringBuffer str3=new StringBuffer("Secound String");
		StringBuffer str4=new StringBuffer("First String");
		System.out.println(str1.contentEquals(str3));
		System.out.println(str2.contentEquals(str3));
		System.out.println(str1.contentEquals(str4));
		System.out.println(str2.contentEquals(str4));
	}
}