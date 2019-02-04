package strings;

public class TringAndHashCode {

	public static void main(String[] args) 
	{
		String str="  Babu working in capgemini    ";
		String x;
		x=str.trim();
		System.out.println(x);
		
		
		String str1="Babu";
		int y=str1.hashCode();
		System.out.println(y);
		
		for(int i=0;i<=str1.length()-1;i++) {
				System.out.print(str1.charAt(i));}
		int y1=str1.charAt(0);
		int y2=str1.charAt(1);
		int y3=str1.charAt(2);
		int y4=str1.charAt(3);
		System.out.println("\n"+y1+" "+y2+" "+y3+" "+y4);
		//System.out.println("Hashcode calculation: s[0]*31^(n-1)+s[0]*31^(n-2)+s[0]*31^(n-3) + (n-1)");
		//System.out.println("66*31^(4-1)+97*31^(4n-2)+98*31^(4-3) + 117[4-1]");
		char c1=str1.charAt(0);System.out.println(c1);
		
				
	}

}
