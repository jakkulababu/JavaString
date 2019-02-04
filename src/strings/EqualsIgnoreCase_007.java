package strings;

public class EqualsIgnoreCase_007 {

	public static void main(String[] args) {
		String str1="BABU";
		String str2="babu";
		boolean comp1;	
		comp1=str1.equalsIgnoreCase(str2);
		System.out.println(comp1);
	}
}