// PRIME NUMBER WITHIN USER DEFINED RANGE

package task;
import java.util.Scanner;

public class PrimeNoRange 
{
	public static void main(String[] args) 
	{
		//input
		int n1, n2, flag = 0, i, j;			//Defining variables

		
		Scanner sc = new Scanner(System.in);		//Creating object from  Scanner
		
		System.out.println("Enter Starting number of range: ");
		n1 = sc.nextInt();				//Assigning input from user to the variable
		
		System.out.println("Enter Ending number of range: ");
		n2 = sc.nextInt();				//Assigning input from user to the variable
				
		System.out.println("The prime number between "+n1+" and "+n2+" is : ");
		for(i=n1; i<=n2; i++)
		{
			for(j=2; j<i; j++)
			{
				if(i%j == 0)
				{
					flag =0;
					break;
				}
				else
				{
					flag = 1;
				}
			}
			if(flag == 1)
			{
				System.out.print(i+" ");
			}
		}
		
		sc.close();
	}
}
