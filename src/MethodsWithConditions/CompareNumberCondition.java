package MethodsWithConditions;

import org.junit.Test;

public class CompareNumberCondition {
	
	
public void compareNumber_test()
{
	compareNumber_test(22,33);
	compareNumber_test(44,55);
	
}

public static void compareNumber_test(int x,int y)
{
	System.out.println("First value : " +x);
	System.out.println("Second value : " +y);
	if (x==y)
	{
		
		System.out.println("Both A and B are equal");
		
	}
	else 
	{
		System.out.println("Both A and B are not equal");
	}
	
}
	

//write a program to read two inputs and perform addition if they are equal, if a>b then do subtraction, if a<b then do multiplication
	@Test
	public void multipledecision_test()
{
	multipleDecision (22,22);//code coverage=lines covered/Total lines*100 = 5/15*100 = 33.33333
	multipleDecision (33,11);
	multipleDecision (44,55);
			
}
	//Based on SonarCube codelevel was Less
	//Whitebox testing & Glassbox testing done by Developers
	// Our code will send to QA team
	
public void multipleDecision(int a,int b)
{
	System.out.println("First value :" +a);
	System.out.println("Second value :" +b);
	if (a==b)
	{
		int sum = a+b;
		System.out.println("sum of two numbers :" +sum);
	}
	else if(a>b)
	{
		int diff = a-b;
		System.out.println("Difference of two numbers :" +diff);
	}
	else if(a<b)
	{
		int prod = a*b;
		System.out.println("Product of two numbers :" +prod);
	}
}

	@Test
public void nestedcondition_test()
{
	nestedConditions(4,8);
	nestedConditions(14,8);
	nestedConditions(4,48);
	nestedConditions(44,10);
	nestedConditions(44,18);
	nestedConditions(44,88);
	nestedConditions(64,64);
}
public void nestedConditions(int a, int b)
{
	System.out.println("First value : " + a);
	System.out.println("Second value :" + b);
	if ((a>10) && (b>10))//Logical End Operator // Outer condition
		//T && T : T
	{
		if (a==b)// True condition // Nested if (if under if means Nested if)// ==,<,> : Relational Operator
		// inner condition
		{
			int sum = a+b;// = , : Assignment Operator
			System.out.println("sum of two numbers :" +sum);
		}
		else if(a>b)
		{
			int diff = a-b;// +,-,* : Arithmetic Operator
			System.out.println("Difference of two numbers :" +diff);
		}
		else if(a<b)
		{
			int prod = a*b;
			System.out.println("Product of two numbers :" +prod);
		}
		else //False condition
			{
			System.out.println("Both A and B or any of them might be below 10");
			}
	}
	}
		//write a program to read a number as input and find that num is even or odd.
          @Test
        public void findEvenOdd_test()
        {
        	  findEvenOdd(16);
        	  findEvenOdd(99);
        }
		public void findEvenOdd (int a)
		{
			System.out.println("Given number : " + a);
			// num /2 = Q , num % 2 = R, so 5/2 = Q : 2, R : 1
			int rem = a%2 ; // % is Modules
			if (rem == 0)
			{
				System.out.println("Given number is even" );
			}
			else
			{
				System.out.println("Given number is odd" );
			}
		}
		
		
	} 
		   





	





