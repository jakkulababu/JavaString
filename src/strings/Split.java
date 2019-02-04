package strings;

public class Split {

	public static void main(String[] args) 
	{
		String str=new String("01/21/2019");
		String array1[]=str.split("/");
		for(String temp:array1) {System.out.println(temp);}
		
		String array2[]=str.split("/",2);
		for(String temp1:array2) {System.out.println(temp1);}
		
		String array3[]=str.split("/",-5);
		for(String temp2:array3) {System.out.println(temp2);}

	}

}
