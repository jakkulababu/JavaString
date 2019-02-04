package array;
public class StringReverse 
{
	public static void main(String[] args) 
	{
		String str="Jakkula babu working in CAPGEMINI";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {System.out.print(ch[i]);}
		System.out.println();
		for(int j=ch.length-1;j>=0;j--) {System.out.print(ch[j]);}
		
	}
}