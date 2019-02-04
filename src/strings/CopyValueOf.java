package strings;

public class CopyValueOf 
{
	public static void main(String[] args) 
	{
		char[] data= {'b','a','b','u','j','a','k','k','u','l','a'};
		String str1="Text";
		String str2="String";
		str1=str1.copyValueOf(data);
		System.out.println(str1);		
		str2=str2.copyValueOf(data, 4, 7);
		System.out.println(str2);
	}

}
