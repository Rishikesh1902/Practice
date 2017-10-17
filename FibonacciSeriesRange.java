package task;

import java.util.Scanner;

public class FibonacciSeriesRange 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		
		//input
		long temp=0;
		//Initializing variables 
		System.out.println("Fibonacci Series");
		
		System.out.print("\nEnter the Starting number : ");
		long n1 = sc.nextInt();
		
		System.out.print("\nEnter the Ending Number : ");
		long n2 = sc.nextInt();
		
		long x = 0, y = 1;
		
		//logic and output
		for(long i=n1; i<n2; i++)
		{
			if(temp<=n2)
			{
				if(temp>=n1)
				{
					System.out.println(temp+" ");
				}
				x=y;
				y=temp;
				temp=x+y;
			}
		}
		sc.close();
	}
}