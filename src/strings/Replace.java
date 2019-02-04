package strings;

public class Replace 
{

	public static void main(String[] args) 
	{
		String str="i love you.com";
		//replace()
		System.out.println(str.replace("love", "hate"));
		System.out.println(str.replace('o', 'u'));
		//replaceFirst()
		System.out.println(str.replaceFirst("com", "net"));
		//replaceAll()
		System.out.println(str.replaceAll("o", "e"));

	}

}
