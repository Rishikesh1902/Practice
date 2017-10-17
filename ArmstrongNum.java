//PROGRAM TO CHECK WHETHER N-DIGIT NUMBER IS ARMSTRONG OR NOT

package task;
import java.util.Scanner;

public class ArmstrongNum 
{
	public static void main(String[] args) 
	{
		boolean flag;
		
		Scanner sc = new Scanner(System.in);
		
		//DECLARATION
		int n, d=0, m=0, r, sum=0;			//Initialization of variables
		
		//INPUT
		System.out.print("Enter number to check whether it is Armstrong or not: ");	
		n = sc.nextInt();			//Assigning Input to variable	
		
		//LOGIC
		m = n;
		String  s = Integer.toString(n);
		d = s.length();
		
		while(m != 0)			//While condition
		{
			r = m % 10;			//getting Single digit 
			sum += Math.pow(r, d);		//Getting cube of single digit and adding it to the sum
			m /= 10;
		}
		if(sum == n)
			flag = true;
		else
			flag= false;
		
		//OUTPUT
		if(flag)			//Armstrong Condition
			System.out.println(n+" is Armstrong number.");
		else
			System.out.println(n+" is not a Armstrong number.");
		
		sc.close();
	}
}
