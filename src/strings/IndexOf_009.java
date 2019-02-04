package strings;

public class IndexOf_009 
{
	public static void main(String[] args) 
	{
		String str1=new String("This is BeginnersBook tutorial");
		String str2=new String("Beginners");
		String str3=new String("Book");
		String str4=new String("Books");
		
		System.out.println("Index of B in str1 :"+str1.indexOf('B'));
		System.out.println("Index of B in str1 after 10th character :"+str1.indexOf('B',10));
		System.out.println("Index of B in str1 after 30 character :"+str1.indexOf('B',30));
		
		System.out.println("Index of string str2 is in str1 :"+str1.indexOf(str2));
		System.out.println("Index of string str2 is in str1 after 5th character :"+str1.indexOf(str2,5));
		
		System.out.println(str1.indexOf("is"));
		System.out.println(str1.indexOf("is", 4));
		
	}

}
