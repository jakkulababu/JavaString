package strings;

public class IsEmpty 
{

	public static void main(String[] args) 
	{
		String str1="Hello";
		String str2="";		
		String str3=null;
		System.out.println(str1.isEmpty());
		System.out.println(str2.isEmpty());
		if(str1.isEmpty()||str3==null) {System.out.println("String either  is empty or null");}
	}
}