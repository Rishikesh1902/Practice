package task;
import java.util.Scanner;
import java.lang.Math;

public class BaseExpo 
{
	public static void main(String[] args) 
	{
		//DECLARATION
		double b, exp, ans=1;
		
		//INPUT
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the base : ");
		b=sc.nextInt();
		
		System.out.print("\nEnter the exponent : ");
		exp =sc.nextInt();
		
		double e = exp;
		
		//LOGIC
		if(e>0)
		{
			while(e!=0)
			 {
				 ans *= b;
				 e--;
			 }
		}
		else if(e<0)
		{
			double e1 = Math.abs(e);
			for(int i=0; i<e1; i++)
			{
				ans = Math.pow(b, (1.0/e1));
			}
		}
		else
		{
			ans = 1;
		}
		
		//OUTPUT
		
		System.out.print("\nAnswer : "+ans);
		
		sc.close();
	}
}
