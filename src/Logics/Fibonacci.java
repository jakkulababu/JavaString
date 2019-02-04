package Logics;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		int x,y,z;
		int t=50;
		x=0;
		y=1;
		z=x+y;
		while(z<t)
		{
			System.out.println(z);
			x=y;
			y=z;
			z=x+y;
		}

	}

}
