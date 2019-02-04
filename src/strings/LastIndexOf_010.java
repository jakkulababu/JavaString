package strings;

public class LastIndexOf_010 
{

	public static void main(String[] args) 
	{
		String str1=new String("This is BeginnersBook tutorial");
		String str2=new String("Beginners");
		String str3=new String("Book");
		String str4=new String("Books");
		//int lastIndexOf(int ch)
		System.out.println("Last 'B' in strt1: "+str1.lastIndexOf('B'));
		//int lastIndexOf(int ch, int fromindex)
		System.out.println("Last 'B' in str1 whose index <=10 "+str1.lastIndexOf('B', 10));
		//int lastIndexOf(string str)
		System.out.println("Last occurrence of str2 in str1:"+str1.lastIndexOf(str2));
		//int lastIndexOf(String str,int fromindex)
		System.out.println("Last occurrence of str2 in str1 before 10:"+str1.lastIndexOf(str2, 10));
		
		System.out.println("Last occurrence of 'is' in str1: "+str1.lastIndexOf("is"));
		System.out.println("Last occurrence of 'is' in str1: "+str1.lastIndexOf("is", 10));
		
	}

}
