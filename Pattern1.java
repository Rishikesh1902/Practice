// JAVA SCHOOL PATTERN - STRING

package task;

import java.util.Scanner;

public class Pattern1 
{
	public static void main(String [] arg)			//Defining void main
	{	
		//input
		String s;			//Declaration of Variable
		System.out.print("Enter any Word : ");
		Scanner sc = new Scanner(System.in);		//Creating object of Scanner
		s = sc.nextLine();
		
		//logic and output
		for(int i=0; i<=s.length(); ++i)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(s.charAt(j)+" ");
			}
			System.out.println("");
		}
		sc.close();
	}

}