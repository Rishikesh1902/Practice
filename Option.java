package task;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Arrays;
import java.lang.Math;

public class Option 
{
	public static void main(String[] args) 
	{
		int op, ch;
		
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("============================================================================\n");
			System.out.print("			WELCOME - © RISHIKESH SHUKLA			 						 \n");
			System.out.print("============================================================================\n");	
					
			System.out.println("\n\n 1.   Program of Base and Exponent");
			System.out.println("\n 2.   Program of Triangluar Sum");
			System.out.println("\n 3.   Program of Factorial");
			System.out.println("\n 4.   Program of Pattern's");
			System.out.println("\n 5.   Program of Armstrong Number");
			System.out.println("\n 6.   Program of Fibonacci Series within Range");
			System.out.println("\n 7.   Program of Palindrome");
			System.out.println("\n 8.   Program of Basic Calculator");
			System.out.println("\n 9.   Program of Division without Use /");
			System.out.println("\n 10.  Program of Prime Number within Range");
			System.out.println("\n 11.  Program of Even Odd Check without Use of Arithmetic Operators");
			System.out.println("\n 12.  Program of Age Calculator (Age in Years Months and Days)");
			System.out.println("\n 13.  Program of Array's");
			System.out.println("\n 14.  EXIT");
					
			System.out.print("\n\n Please Enter the Number (1-14) : ");
			op = sc.nextInt();
			sc.nextLine();
			
			System.out.println("\n=================================================");
			
			switch(op)
			{
				case 1 :	System.out.println("BASE AND EXPONENT");
							
							double b, e, b_e_answer;
							
							System.out.print("Enter the base : ");
							b=sc.nextInt();
							
							System.out.print("\nEnter the exponent : ");
							e =sc.nextInt();
							
							b_e_answer = base_exponent(b,e);
							
							System.out.println("Answer of "+b+"^("+e+") is "+b_e_answer);
							
							break; 
									
				case 2 :	System.out.println("TRIANGULAR SUM ");
							
							int num1, t_s_answer;																		// NUM 1
							
							System.out.print("Enter any number to know its Triangular Sum : ");
							num1 = sc.nextInt();
							
							t_s_answer = triangular_sum(num1);
							
							System.out.println("The Triangular Sum of "+num1+ " is : "+t_s_answer);
							
							break;
							
				case 3 :	System.out.println("FACTORIAL");
							int num2;																					// NUM 2
							long factorial=1;
							
							System.out.print("\nEnter Number whose Factorial you want to find out : ");
							num2 = sc.nextInt();
							
							factorial = factorial(num2);
							
							System.out.print("\nFactorial of "+num2+"! is : "+factorial);
							
							break;
									
				case 4 :	System.out.println("PATTERN'S");
				
							System.out.println("\n=================================================");
				
							int choice;
							
							System.out.println("\n1. School Pattern");
							System.out.println("\n2. Number Pattern");
							System.out.println("\n3. Reverse Number Pattern");
							System.out.println("\n4. Diamond Pattern");
							System.out.print("\nPlease Select the Pattern you want to print : ");
							choice = sc.nextInt();
							sc.nextLine();
							switch(choice)
							{
								case 1 :	System.out.println("\nSchool Pattern");
								
											String s1;
											
											System.out.print("\nEnter any Word : ");
											s1 = sc.nextLine();

											school_pattern(s1);
											
											break;
											
								case 2 :	System.out.println("\nNumber Pattern");
								
											int num3;																	// NUM 3
											
											System.out.print("\nEnter Maximum number till which you want to print : ");
											num3=sc.nextInt();
											
											number_patter(num3);
											
											break;
											
								case 3 :	System.out.println("\nReverse Number Pattern");
								
											int num4;																	// NUM 4
											
											System.out.print("\nEnter Maximum number till which you want to print : ");
											num4 = sc.nextInt();
											
											reverse_number_pattern(num4);
											
											break;
											
								case 4 :	System.out.println("\nDiamond Pattern");
											
											int num5;																	// NUM 5
											char c;
											
											System.out.print("\nEnter any number: ");
											num5 = sc.nextInt();
											
											System.out.print("\nEnter an character:");
											c = sc.next().charAt(0);
											
											diamond_pattern(num5, c);
											
											break;
											
								default :	System.out.println("\nINVALID INPUT !!!!\nPlease Enter a Valid Number");
											break;
							}
							
							break; 
									
				case 5 :	System.out.println("ARMSTRONG NUMBER");
				
							int num6;																					// NUM 6
							boolean flag;
							
							System.out.print("\nEnter number to check whether it is Armstrong or not: ");	
							num6 = sc.nextInt();
							
							flag = armstrong_no(num6);
							
							if(flag)
								System.out.println("\n"+num6+" is an Armstrong Number");
							else
								System.out.println("\n"+num6+" is not an Armstrong Number");
							
							break; 
									
				case 6 :	System.out.println("FIBONACCI SERIES WITHIN RANGE");
							
							System.out.print("\nEnter the Starting number : ");
							long num7 = sc.nextInt();																	// NUM 7
							
							System.out.print("\nEnter the Ending Number : ");
							long num8 = sc.nextInt();																	// NUM 8
							
							fibonacci_series_range(num7, num8);
							
							break; 
									
				case 7 :	System.out.println("PALINDROME");
				
							String original;			
							System.out.println("\nEnter any String to check it is or not Palindrome: ");
							original = sc.nextLine();
							
							palindrome(original);
							
							break; 
				
				case 8 :	System.out.println("SIMPLE CALCULATOR");
				
							simple_calculator();
							
							break;
							
				case 9 :	System.out.println("DIVISION WITHOUT USING /");

							double divid, div;
							int c;
				
							do
							{
								System.out.print("Enter the Dividend : ");
								divid = sc.nextDouble();
								
								System.out.print("Enter the Divisor : ");
								div = sc.nextDouble();
								
								System.out.print("\nYou want to divide "+divid+" by "+div+"\n\nDo you want to Continue (1-Continue ; 2 - Re-Enter) ? : ");
								c = sc.nextInt();
							}while(c != 1);
				
							division_not_op(div, divid);
							
							break; 
									
				case 10 :	System.out.println("PRIME NUMBER WITHIN RANGE");
							
							System.out.println("\nEnter Starting number of range: ");
							int num9 = sc.nextInt();																	// NUM 9
							
							System.out.println("\nEnter Ending number of range: ");
							int num10 = sc.nextInt();																	// NUM 10
							
							primeno_range(num9, num10);
							
							break; 
									
				case 11 :	System.out.println("EVEN ODD CHECK WITHOUT USE OF ARITHMETIC OPERATOR");
				
							System.out.println("\nEnter any number to know whether number is even or not :");
							String num=sc.nextLine();
							
							even_odd_without_ar_op(num);
							
							break; 
									
				case 12 :	System.out.println("AGE CALCULATOR - AGE IN YEARS, MONTHS AND DAYS");
				
							int b_yr=0, b_m=0, b_d=0;						//INITIALISING BIRTH YEAR, MONTH, DATE
							int yr=0, m=0, d=0;								//INITIALISING CURRENT YEAR, MONTH, DATE
			
							String age_l="", age ="";						//Defining String to get the Age which are in String form
							
							int m_d[]={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};		//Respective number of days in each month for non-leap years
							int m_d_l[]={31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	//Respective number of days in each month for leap years
				
							System.out.println("\nPlease, Enter the Birthdate as Asked \n");
							
							System.out.print("Enter your Birth Date : ");
							b_d = sc.nextInt();
							
							System.out.print("\nEnter your Birth Month : ");
							b_m = sc.nextInt();
							
							System.out.print("\nEnter your Birth Year : ");
							b_yr = sc.nextInt();
							
							//DISPLAYING BIRTHDATE PROVIDED BY THE USER
							System.out.println("\nBirthdate Entered by You is : "+b_d+"/"+b_m+"/"+b_yr);
							
							//CREATING INSTANCE OF CALENDAR TO GET CURRENT DATE
							Calendar cal = Calendar.getInstance();
							
							yr = cal.get(Calendar.YEAR);			//Initializing the "yr" variable with Current Year
							m = cal.get(Calendar.MONTH)+1;			//Initializing the "m" variable with Current Month
														//Adding 1 to "m" because in development January is taken as '0'
							d = cal.get(Calendar.DAY_OF_MONTH);		//Initializing the "d" variable with Current Date

							//DATE VALIDATION 
							if(valid_date(b_d, b_m, b_yr, d, m, yr))	
							{
								//PRINTING TODAYS DATE 
								System.out.println("\nToday's date is : "+d+"/"+m+"/"+yr);
								
								if(leap_yr(yr))						//LEAP YEAR
								{
									age = cal_age(d, b_d, m, b_m, yr, b_yr, m_d);				// OUTPUT IN FORM STRING 
									
									System.out.println("\nYour Age is :"+age);					//PRINTING AGE
									
								}
								else								//NON-LEAP YEAR
								{
									age_l = cal_age_leap(d, b_d, m, b_m, yr, b_yr, m_d_l);		// OUTPUT IN FORM STRING
													
									System.out.println("\nYour age is : "+age_l);				//PRINTING AGE
								}
							}
							else
							{
								if((yr < b_yr) || (m < b_m) || (d < m_d[b_m-1]) || ((d < m_d_l[b_m-1]) && ((b_yr % 400 == 0) || ((b_yr % 4 == 0) && (b_yr % 100 != 0)))))
								{
									System.out.println("\nThis is NOT a TIME MACHINE !!!\nPlease, Enter a VALID DATE !!!!");
								}
								else
								{
									System.out.println("\nPlease, Enter a VALID DATE !!!!");		// INVALID INPUT MESSAGE
								}
							}
							
							break; 
									
				case 13 :	System.out.println("ARRAY'S");
				
							System.out.println("\n=================================================");
				
							int choice_arrays;
							
							System.out.println("\n1. Sorting of Entered Integer and String Array");
							System.out.println("\n2. Finding Common Elements between Two Integer Arrays");
							System.out.println("\n3. Removing Duplicate Elements from an Integer Array");
							System.out.println("\n4. Finding Pair of Elements in an Integer Array which is Equal to Specfied Number");
							System.out.print("\n Please Enter the type of Array Operation you want to perform : ");
							choice_arrays = sc.nextInt();
							
							switch(choice_arrays)
							{
								case 1 :	System.out.println("\nSorting of Entered Integer and String Array");
								
											int i;
								
											System.out.println("Enter the size of Integer Array : ");
											int len1 = sc.nextInt();
											
											int arr1[] = new int[len1];
											
											System.out.print("Enter elements for Integer array : ");
											for(i=0; i<len1; i++)
											{
												arr1[i] = sc.nextInt();
											}
											
											System.out.println();
											
											System.out.println("Original numerical array : "+Arrays.toString(arr1));
											System.out.println("\n");
											
											System.out.println("Enter the size of String Array : ");
											int len2 = sc.nextInt();
											
											String arr2[] = new String[len2];
											
											System.out.print("Enter elements for String array : ");
											for(i=0; i<len2; i++)
											{
												arr2[i] = sc.nextLine();
											}
											System.out.println();
											System.out.println("Original String Array : "+Arrays.toString(arr2));
								
											sort_array(arr1, arr2);
											
											break;
											
								case 2 :	System.out.println("\nFinding Common Elements between Two Integer Arrays");
								
											System.out.println("Enter the size of array 1: ");
											int len3 = sc.nextInt();
											
											System.out.println("Enter the size of array 2: ");
											int len4 = sc.nextInt();
											
											int arr3[] = new int[len3];		
											
											int arr4[] = new int[len4];
											
											System.out.println("Enter the elements of the array 1 : ");
											for(i=0; i<len3; i++)
											{
												arr3[i] = sc.nextInt();
											}
											
											System.out.println("Enter the elements of the array 2 : ");
											for(i=0; i<len4; i++)
											{
												arr4[i] = sc.nextInt();
											}
											
											common_elements_array(len3, arr3, len4, arr4);
								
											break;
											
								case 3 :	System.out.println("\nRemoving Duplicate Elements from an Integer Array");
								
											System.out.println("Enter the array size : ");
											int len5= sc.nextInt();
											
											int arr5[] = new int[len5];
											
											System.out.println("Enter the elements of the array : ");
											for(i=0; i<len5; i++)
											{
												arr5[i] = sc.nextInt();
											}
											
											removing_duplicate_elements_array(len5, arr5);
											
											break;
											
								case 4 :	System.out.println("\nFinding Pair of Elements in an Integer Array which is Equal to Specified Number");
											
											System.out.print("Enter the size of array : ");
											int len6 = sc.nextInt();
											
											int arr6[] = new int[len6];	
											
											System.out.println("\nEnter the Array Elements : ");
											for(i=0; i<len6; i++)
											{
												arr6[i] = sc.nextInt();
											}
											
											System.out.print("\nEnter the number to which the Sum of Pair of Elements has to same : ");
											int number = sc.nextInt();
								
											pair_of_elements_no_array(len6, arr6, number);
								
											break;
										
								default :	System.out.println("\nINVALID INPUT !!!!\nPlease Enter a Valid Number");
											break;
							}
							
							break; 
									
				case 14 :	break; 
									
				default :	System.out.println("\nINVALID INPUT !!!!\nPlease Enter a Valid Option Number !!!");
							break; 
	
			}
			System.out.print("\nDo you to Continue (1-continue) ? : ");
			ch = sc.nextInt();
			
			System.out.println("\n==========================================================================================");
			
		}while(ch == 1);
		sc.close();
	}
//=====================================================================================================================================
	/*
			PROGRAM 1 - BASE AND EXPONENT CLASS
	*/
	public static double base_exponent(double base, double expo)
	{
		double ans=1;		
		double e = expo;

		if(e>0)
		{
			while(e!=0)
			 {
				 ans *= base;
				 e--;
			 }
		}
		else if(e<0)
		{
			double e1 = Math.abs(e);
			for(int i=0; i<e1; i++)
			{
				ans = Math.pow(base, (1.0/e1));
			}
		}
		else
		{
			ans = 1;
		}
		return ans;
	}
//=====================================================================================================================================	
	/*
			PROGRAM 2 - TRIANGULAR SUM
	*/
	public static int triangular_sum(int num)
	{
		int sum=0;
		for(int i= num; i>0; i--)
		{
			sum += num;
			num--;
		}
		return sum;
	}
//=====================================================================================================================================	
	/*
			PROGRAM 3 - FACTORIAL
	*/
	public static long factorial(int n)
	{
		long ans=1;
		for(int i=1; i<=n; i++)
		{
			ans *= i;
		}
		return ans;
	}
//=====================================================================================================================================	
	/*
	 		PROGRAM 4 - PATTREN'S
	*/
	
	/*
			SCHOOL PATTERN
	*/
	public static void school_pattern(String s)
	{
		for(int i=0; i<=s.length(); ++i)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(s.charAt(j)+" ");
			}
			System.out.println();
		}
	}
	
	/*
			NUMBER PATTERN
	*/
	public static void number_patter(int n)
	{
		for(int i=1; i<=n; ++i)
		{
			for(int j=1; j<=i; ++j)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	/*
			REVERSE NUMBER PATTERN
	*/
	public static void reverse_number_pattern(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=n; j>=i; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}
	
	/*
			DIAMOND PATTERN
	*/
	public static void diamond_pattern(int n, char c)
	{
		int i, j, k;
		for(i=1; i<=n; i++)
		{
			for(j=i; j<n; j++)
			{
				System.out.print(" ");
			}
			for(k=1; k<=(i*2)-1; k++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
		
		for(i=(n-1); i>=1; i--)
		{
			for(j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			for(k=1; k<=(i*2)-1; k++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}

//=====================================================================================================================================	
	
	/*
			PROGRAM 5 - ARMSTRONG NUMBER
	*/
	public static boolean armstrong_no(int n)
	{
		boolean flag;
		int d=0, m=0, r, sum=0;			//Initialization of variables

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
		
		return flag;
	}

//=====================================================================================================================================	

	/*
			PROGRAM 6 - FIBONACCI SERIES WITHIN RANGE
	*/
	public static void fibonacci_series_range(long n1, long n2)
	{
		long x = 0, y = 1, temp=0;
		
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
	}

//=====================================================================================================================================	

	/*
			PROGRAM 7 - PALINDROME
	*/
	public static void palindrome(String original)
	{
		String reverse="";
		int l = original.length();		//length of string
		for(int i=l-1; i>=0; i--)
		{
			reverse = reverse + original.charAt(i);
		}
		if(original.equals(reverse))
			System.out.println("Entered string "+original+" is palindrome");
		else
			System.out.println("Entered string "+original+" is not palindrome");
	}

//=====================================================================================================================================	

	/*
			PROGRAM 8 - BASIC CALCULATOR
	*/
	public static void simple_calculator()
	{
		//input
		int num1, num2;			//Declaration of Variable	
		double result=0.0;		//Declaration of Variable
		char op;				//Declaration of Variable
				
		//output
		do						//do-while loop
		{
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			System.out.print("Enter the number of operation you want to perform: ");
			Scanner s = new Scanner(System.in);			//Creating Scanner object
			op = s.next().charAt(0);			//Assigning input from user to variable
					
			switch(op)		//switch case
			{
				case '1':	//ADDITION
							System.out.print("Enter First Number:");
							num1=s.nextInt();
							System.out.print("Enter Second Number:");
							num2=s.nextInt();
							result = num1 + num2;
							System.out.print("Result: "+result);
							break;
									
				case '2':	//SUBTRACTION
							System.out.print("Enter First Number:");
							num1=s.nextInt();
							System.out.print("Enter Second Number:");
							num2=s.nextInt();
							result = num1 - num2;
							System.out.print("Result: "+result);
							break;
									
				case '3':	//MULTIPLICATION
							System.out.print("Enter First Number:");
							num1=s.nextInt();
							System.out.print("Enter Second Number:");
							num2=s.nextInt();
							result = num1 * num2;
							System.out.print("Result: "+result);
							break;
									
				case '4':	//DIVISION
							System.out.print("Enter Numerator :");
							num1=s.nextInt();
							System.out.print("Enter Denominator :");
							num2=s.nextInt();
							if(num2>0)
							{
								result = num1 / num2;
								System.out.print("Result: "+result);
							}
							else if(num2==0)
							{
								System.out.println("\nDenominator cannot be 0 !!");
							}
							else
							{
								System.out.println("\nPlease enter Denominator value greater than 0");
							}
							break;
									
				case '5':	//EXIT
							break;
									
				default:	//INVALID INPUT
							System.out.println("You have entered invalid input.");
							break;
			}
			s.close();
		}while(op!=5);		
		
	}

//=====================================================================================================================================	

	/*
			PROGRAM 9 - DIVISION WITHOUT USING '/'
	*/
	public static void division_not_op(double divid, double div)
	{
		double divid1, div1, answer=0, remainder;
		
		if(div==0)
		{
			System.out.print("\nERROR !!!!!\nCannot divide by 0 !!");
		}
		else
		{
			divid1=divid;
			div1=div;
			
			while(divid1>=div1)
			{
				divid1 -= div1;
				answer++;
			}
			remainder = divid1;
			
			System.out.println("\nQuotient : "+answer+"\nRemainder : "+remainder);
		}
	}

//=====================================================================================================================================	

	/*
			PROGRAM 10 - PRIME NUMBER WITHIN RANGE
	*/
	public static void primeno_range(int n1, int n2)
	{
		int i, j, flag=0;
		
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
	}

//=====================================================================================================================================	

	/*
			PROGRAM 11 - EVEN ODD CHECK WITHOUT USE OF ARITHMETIC OPERATOR
	*/
	public static void even_odd_without_ar_op(String num)
	{
		int i = num.length()-1;
		char j=num.charAt(i);
		System.out.println();
		
		//LOGIC & OUTPUT
		if(j == '0' || j == '2' || j == '4' || j == '6' || j == '8')
		{
			System.out.println(num+" is even");
		}
		else
		{
			System.out.println(num+" is odd");
		}
	}
	
//=====================================================================================================================================	

	/*
		PROGRAM 12 - AGE CALCULATOR
	*/
	
	/*
	DATE VALIDATION CLASS
	*/
	public static boolean valid_date(int birth_date, int birth_month, int birth_year, int date, int month, int year)
	{
	if(year > birth_year)		//Checking Current Year is greater than Birth Year
	{
		if((birth_month>=1) && (birth_month<=12))		//Checking Month Number is between 1 and 12
		{
			//Checking Date of Month with 31 days
			if((birth_date>=1)&&(birth_date<=31) && (birth_month == 1 || birth_month == 3 || birth_month == 5 || birth_month == 7 || birth_month == 8 || birth_month == 10 || birth_month == 12))
				return true;
			//Checking Date of Month with 30 days
			if((birth_date>=1)&&(birth_date<=30) && (birth_month == 4 || birth_month == 6 || birth_month == 9 || birth_month == 11))
				return true;
			//Checking Date of Month February with 28 days
			if((birth_date>=1)&&(birth_date<=28) && (birth_month == 2))
				return true;
			//Checking Date of Month February with 29 days (Leap Year)
			if((birth_date>=1)&&(birth_date<=29) && (birth_month == 2) && ((birth_year % 400 == 0) || ((birth_year % 4 == 0) && (birth_year % 100 != 0))))
				return true;
			else
				return false;
		}
		else
			return false;
	}
	else if(year == birth_year)		//Checking Current Year is equal to Birth Year  
	{
		if((birth_month>=1) && (birth_month<=12))			//Checking Month Number is between 1 and 12
		{
			if((birth_month == month) && (birth_date <= date))		//Checking Birth Month is same as Current Month with Birth Date less than equal to Current Date 
			{
				//Checking Date of Month with 31 days
				if((birth_date>=1)&&(birth_date<=31) && (birth_month == 1 || birth_month == 3 || birth_month == 5 || birth_month == 7 || birth_month == 8 || birth_month == 10 || birth_month == 12))
					return true;
				//Checking Date of Month with 30 days
				if((birth_date>=1)&&(birth_date<=30) && (birth_month == 4 || birth_month == 6 || birth_month == 9 || birth_month == 11))
					return true;
				//Checking Date of Month February with 28 days
				if((birth_date>=1)&&(birth_date<=28) && (birth_month == 2))
					return true;
				//Checking Date of Month February with 29 days (Leap Year)
				if((birth_date>=1)&&(birth_date<=29) && (birth_month == 2) && ((birth_year % 400 == 0) || ((birth_year % 4 == 0) && (birth_year % 100 != 0))))
					return true;
	
				else
					return false;
			}
			else if (birth_month < month)			//Checking whether Birth Month is less than Current Month
			{
				//Checking Date of Month with 31 days
				if((birth_date>=1)&&(birth_date<=31) && (birth_month == 1 || birth_month == 3 || birth_month == 5 || birth_month == 7 || birth_month == 8 || birth_month == 10 || birth_month == 12))
					return true;
				//Checking Date of Month with 30 days
				if((birth_date>=1)&&(birth_date<=30) && (birth_month == 4 || birth_month == 6 || birth_month == 9 || birth_month == 11))
					return true;
				//Checking Date of Month February with 28 days
				if((birth_date>=1)&&(birth_date<=28) && (birth_month == 2))
					return true;
				//Checking Date of Month February with 29 days (Leap Year)
				if((birth_date>=1)&&(birth_date<=29) && (birth_month == 2) && ((birth_year % 400 == 0) || ((birth_year % 4 == 0) && (birth_year % 100 != 0))))
					return true;
				else
					return false;
			}
			else
			{
				return false;
			}
		}
		else 
			return false;
	}
	else
		return false;
	}
	
	/*
		LEAP YEAR CHECKING CLASS
	*/
	public static boolean leap_yr(int y)
	{
	boolean a = (y % 4)==0;
	boolean b = (y % 100) != 0;
	boolean c = (((y % 100) == 0) && ((y % 400) == 0));
		
	return a && (b || c);
	}
	
	/*
		CALCULATION CLASS
	*/
	public static String cal_age(int date, int birth_date, int month, int birth_month, int year, int birth_year, int[] m_dm)
	{
	String cal_age="";										//To get the Age in form of String
	
	int cal_days=0 , cal_month=0 , cal_years=0  ;			//Initializing Variables to hold Age Years, month and days
	
	//BIRTH YEAR LESS THAN CURRENT YEAR
	if(year > birth_year)			
	{
		//CHECKING DATE, so that we can manipulate the Month and Year Values accordingly
		if(date < birth_date)
		{
			date = date + m_dm[month-1];			// As the current date is less than birth date we have to convert current month in number of days 
			month = month - 1;						// As the current month is converted into dates we have to decrease the value of month
			
			cal_days = (date - birth_date)-1;		//Calculating the days of the user
			
			if(month < birth_month)					//Checking month is less than birth month
			{	
				/*
				 As this condition is true we have to convert single year into months, i.e., 12 months
				 And, then we have to decrease the year value as 1 year is converted into 12 months
				 And then simply we have to calculate the User age months and years 
				 */
				month = month + 12;
				year = year - 1;
				
				cal_month = month - birth_month;
				
				cal_years = year - birth_year;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
			else if(month == birth_month)			//Checking month is equal to birth month
			{
				/*
				 If the months are same the age month of user will be 0 and simply we can calculate the value of user age year
				 */
				cal_month = 0;
				
				cal_years = year - birth_year;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
			else									//Checking month is greater than birth month
			{
				/*
				 If this condition comes then we have to simply subtract and get the months and years
				 */
				cal_month = month - birth_month;
				
				cal_years = year - birth_year;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
		}
		else if(date > birth_date)			//Checking the Current Date is Greater than Birth Date
		{
			/*
			 As the current date is greater than birth date then to calculate the age in days we simply calculate by subtracting dates
			 And then as above we will calculate month and age 
			 */
			
			cal_days = date - birth_date;		
			
			if(month < birth_month)						//Current Month is less than Birth month
			{
				month = month + 12;
				year = year - 1;
				
				cal_month = month - birth_month;
				
				cal_years = year - birth_year;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
			else if(month == birth_month)				//Current Month is equal to Birth Month
			{
				cal_month = 0;
				
				cal_years = year - birth_year;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
			else										//Current Month is greater than Birth Month
			{
				cal_month = month - birth_month;
				
				cal_years = year - birth_year;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
		}
		else						//Current Date is equal to Birth Date
		{
			cal_days = 0;
			
			if(month < birth_month)			
			{
				month = month + 12;
				year = year - 1;
				
				cal_month = month - birth_month;
				
				cal_years = year - birth_year;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
			else if(month == birth_month)
			{
				cal_month = 0;
				
				cal_years = year - birth_year;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
			else
			{
				cal_month = month - birth_month;
				
				cal_years = year - birth_year;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
		}
	}
	
	/*
	 As we had checked the condition for Birth Year less than Current Year, and, the condition Current Year greater than Birth Year is not applicable
	 So, now we have to check condition for Birth Year equal to Current Year
	 And, then, we have to calculate the month and year 
	 */
	else if(year == birth_year)
	{
		cal_years=0;
		
		if(month == birth_month)
		{
			cal_month = 0;
			
			if(date > birth_date)
			{
				cal_days = date - birth_date;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
			else
			{
				cal_days =0;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
		}
		else
		{
			if(date == birth_date)
			{
				cal_month = month - birth_month;
				
				cal_days = 0;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
			else if(date > birth_date)
			{
				cal_month = month - birth_month;
				
				cal_days = date - birth_date;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
			else
			{
				date = date + m_dm[month-1];
				month = month - 1;
				
				cal_days = date - birth_date;
				
				cal_month = month - birth_month;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
		}
	}
	
	return cal_age;
	}
	
	/*
		CALCULATION WITH LEAP YEAR
	*/
	
	/*
	The while logic is same as above, i.e., for non-leap year, only the difference is that the array used for getting total number of days 
	of respective months is changed. Otherwise, whole program is same.
	*/
	public static String cal_age_leap(int date, int birth_date, int month, int birth_month, int year, int birth_year, int[] m_dm_l)
	{
	String cal_age="";
	
	int cal_days , cal_month , cal_years ;
	if(year > birth_year)
	{
		if(date < birth_date)
		{
			date = date + m_dm_l[month-1];
			month = month -1;
			
			cal_days = (date - birth_date)-1;
			
			if(month < birth_month)
			{
				month = month + 12;
				year = year - 1;
				
				cal_month = month - birth_month;
				
				cal_years = year - birth_year;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
			else if(month == birth_month)
			{
				cal_month = 0;
				
				cal_years = year - birth_year;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
			else
			{
				cal_month = month - birth_month;
				
				cal_years = year - birth_year;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
		}
		else if(date > birth_date)
		{
			cal_days = date - birth_date;
			
			if(month < birth_month)
			{
				month = month + 12;
				year = year - 1;
				
				cal_month = month - birth_month;
				
				cal_years = year - birth_year;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
			else if(month == birth_month)
			{
				cal_month = 0;
				
				cal_years = year - birth_year;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
			else
			{
				cal_month = month - birth_month;
				
				cal_years = year - birth_year;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
		}
		else
		{
			cal_days = 0;
			
			if(month < birth_month)
			{
				month = month + 12;
				year = year - 1;
				
				cal_month = month - birth_month;
				
				cal_years = year - birth_year;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
			else if(month == birth_month)
			{
				cal_month = 0;
				
				cal_years = year - birth_year;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
			else
			{
				cal_month = month - birth_month;
				
				cal_years = year - birth_year;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
		}
	}
	else if(year == birth_year)
	{
		cal_years=0;
		
		if(month == birth_month)
		{
			cal_month = 0;
			
			if(date > birth_date)
			{
				cal_days = date - birth_date;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
			else
			{
				cal_days =0;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days \n\nWelcome to this INCREDIBLE WORLD !!!\n\nBut! It really SUCKS !";
			}
		}
		else
		{
			if(date == birth_date)
			{
				cal_month = month - birth_month;
				
				cal_days = 0;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
			else if(date > birth_date)
			{
				cal_month = month - birth_month;
				
				cal_days = date - birth_date;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
			else
			{
				date = date + m_dm_l[month-1];
				month = month - 1;
				
				cal_days = date - birth_date;
				
				cal_month = month - birth_month;
				
				//ASSIGNING THE AGE TO CAL_AGE IN STRING FORM
				cal_age = cal_years+" years "+cal_month+" months "+cal_days+" days ";
			}
		}
	}
	//RETURNING THE AGE VIA CAL_AGE TO MAIN FUNCTION
	return cal_age;
	}
	
//=====================================================================================================================================	
	
	/*
	 		PROGRAM 13 - ARRAY'S
	*/
	
	/*
			SORTING OF ENTERED INTEGER ARRAY
	*/
	public static void sort_array(int[] arr1, String[] arr2 )
	{
		Arrays.sort(arr1);
		System.out.println("Sorted numerical array : "+Arrays.toString(arr1));
		System.out.println();
		Arrays.sort(arr2);
		System.out.println("Sorted String Array : "+Arrays.toString(arr2));
	}
	
	/*
			FINDING COMMON ELEMENTS BETWEEN TWO INTEGER ARRAYS
	*/
	public static void common_elements_array(int len1, int[] arr1, int len2, int[] arr2)
	{
		int i, j;
		
		System.out.print("Entered array 1 is : ");
		for(i=0; i<len1; i++)
		{
			System.out.print(arr1[i]+"  ");
		}
		System.out.println();
		
		System.out.print("Entered array 2 is : ");
		for(i=0; i<len2; i++)
		{
			System.out.print(arr2[i]+"  ");
		}
		System.out.println();
		
		System.out.println("\nCommon elements in array 1 and array 2 are: " );
		for(i=0; i<len1; i++)
		{
			for(j=0; j<len2; j++)
			{
				if(arr1[i] == arr2[j])
				{
					System.out.print("\n"+arr1[i]+" at index number "+i+" of array 1 and at index number "+j+" of array 2");
				}
			}
		}
	}
	
	/*
			REMOVING DUPLICATE ELEMENTS FROM AN INTEGER ARRAY
	*/
	public static void removing_duplicate_elements_array(int len, int[] arr)
	{
		int i, j;
		
		System.out.print("Entered array is : ");
		for(i=0; i<len; i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		//Printing the Repeated Elements in Arrays
		System.out.println("Repeated elements in array are: " );
		for(i=0; i<len; i++)
		{
			for(j=i+1; j<len; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
				
		int len1 = arr.length;		//Initializing new variable with array length to make manipulation
				
				
		//Checking and Deleting Duplicate Elements in array
		for(i=0; i<len1;i++)
		{
			for(j=i+1; j<len1; j++)
			{
				if(arr[i] == arr[j])
				{
					arr[i] = arr[len1-1];
					len1--;
					j--;
				}
			}
		}
		
		int arr1[] = new int [len1];		//Creating new array of length with unique number of elements
		
		//Initializing arr1 with unique number of elements
		for(i=0; i<len1; i++)
		{
			arr1[i] = arr[i];
		}
		
		//OUTPUT
		
		//Printing Array with Unique Elements
		System.out.println("\nArray after deleting Duplicate values : ");
		for(i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
	}
	
	/*
			FINDING PAIR OF ELEMENTS IN AN INTEGER ARRAY WHICH IS EQUAL TO SPECIFIED NUMBER
	*/
	public static void pair_of_elements_no_array(int len, int[] arr, int no)
	{
		int i, j;
		
		System.out.print("Entered array  is : ");
		for(i=0; i<len; i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		
		System.out.println("\nPair of Elements whose Sum is equal to Specified Element are :\n");
		for(i=0; i<len; i++)
		{
			for(j=i+1; j<len; j++)
			{
				if((arr[i] + arr[j]) == no)
				{
					System.out.println(arr[i]+" at index "+i+" and "+arr[j]+"at index "+j+" are equal to "+no);
				}
			}
		}
	}
	
}