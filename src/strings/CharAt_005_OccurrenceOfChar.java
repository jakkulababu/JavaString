package strings;
public class CharAt_005_OccurrenceOfChar 
{
	public static void main(String[] args) 
	{
		String str="Welcome BaBu";
		int count=0;//Initializing count as 0
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='B')
			{
				count++;//increasing the counter value at each occurrence of 'B'
				continue;
			}
		}
		System.out.println("Character B occurred "+count+" times");
	}
}