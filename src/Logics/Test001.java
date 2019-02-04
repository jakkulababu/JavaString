package Logics;

public class Test001 
{

	public static void main(String[] args) 
	{
		for(int i=0;i<=5;i++) 
		{
			for(int j=0;j<=i;j++) 
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print("$");
			}
			for(int l=5;l>=i;l--) 
			{
				System.out.print("@");
			}
			for(int n=0;n<=i;n++)
			{
				System.out.print(" ");
			}
			for(int m=0;m<=5;m++) 
			{
				System.out.print("B");
			}
			System.out.println();
		}
		
		for(int i=0;i<=5;i++) 
		{
			for(int j=0;j<=19;j++) 
			{
				if(i==0||i==5||j==0||j==19) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}System.out.println();
		}

	}

}
