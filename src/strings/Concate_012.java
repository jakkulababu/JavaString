package strings;

public class Concate_012 
{

	public static void main(String[] args) 
	{
		String str=new String("beginneers");
		String s1="www."+str.concat("book").concat(".").concat("com");
		
		System.out.println(s1);
		System.out.println("www."+str.concat("books").concat(".").concat("com"));

	}

}
