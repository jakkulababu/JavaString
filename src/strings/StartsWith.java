package strings;

public class StartsWith {

	public static void main(String[] args) 
	{
		String str1=new String("Babu got job in new Company");
		String str2="Babu";
		String endStr="Company";
		String conStr="job";
		//System.out.println("Length of the string: "+str1.length());
		boolean x, y;
		x=str1.startsWith("Babu");
		System.out.println("String Starts with: "+x);
		
		/*y=str1.startsWith("got", 5);
		System.out.println(y);	*/
		if(str1.startsWith(str2)) 
		{
			System.out.println("Starts with test Passed");
		}
		else
		{
			System.out.println("Starts with test Failed");
		}
		if(str1.endsWith(endStr)) {System.out.println("Endswith string test case passed");}else {System.out.println("Endswith test case failed");}
	}
}