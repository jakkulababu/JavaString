package strings;

public class CharAt_003_IndexOutOfBoundsException 
{
	public static void main(String[] args) 
	{
		String str="Welcome";
		char ch=str.charAt(-1);
		System.out.println(ch);
	}
}