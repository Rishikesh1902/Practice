//TRIANGULAR SUM

package task;
import java.util.Scanner; 

public class TriangularSum 
{
	public static void main(String[] args) 
	{
		//DECLARATION		
		int n, m, sum=0;

		//INPUT
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number to know its Triangular Sum : ");
		n = sc.nextInt();
		
		m=n;
		
		//LOGIC
		for(int i= m; i>0; i--)
		{
			sum += m;
			m--;
		}
		
		//OUTPUT
		System.out.println("Triangular Sum of "+n+" is "+sum);
		
		sc.close();
	}
}