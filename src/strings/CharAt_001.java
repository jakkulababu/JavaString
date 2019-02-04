package strings;
public class CharAt_001 
{
	public static void main(String[] args) 
	{
		String str1="Java beginner";//literal string
		char array[]= {'h','e','l','l','o'};
		String str2=new String(array);//creating new string by converting char array to str2
		String str3=new String("Welcome");//creating string by using new keyword
		System.out.println(str1+"\n"+str2+"\n"+str3);
	}
}