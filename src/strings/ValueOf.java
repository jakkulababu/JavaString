package strings;
public class ValueOf {
	public static void main(String[] args) 
	{
		int number=23;
		String str=String.valueOf(number);
		System.out.println(str+99);
		
		char vowel[]= {'V','O','W','E','L'};
		String str2=String.valueOf(vowel);
		System.out.println(str2);
		
		int i=23;
		float f=10.03f;
		double d=123.03d;
		long l=25000;
		char c='J';
		
		String str3=String.valueOf(i);System.out.println(str3);
		String str4=String.valueOf(f);System.out.println(str4);
		String str5=String.valueOf(d);System.out.println(str5);
		String str6=String.valueOf(l);System.out.println(str6);
		String str7=String.valueOf(c);System.out.println(str7);
		
	}
}