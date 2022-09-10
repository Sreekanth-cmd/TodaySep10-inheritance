import org.junit.Test;

public class ConditionalStatements {
	//write a program to read two numbers as inputs and perform addition if they are equal, substraction if a>b, multipication if a<b

//write a program to read two numbers as inputs and perform the below task if and only if both inputs are above 10
//Task : perform addition if they are equal, substract if a>b, multipication if a<b
	@Test
public void logicalOperations_Test()
{
	logicalOperations(4,8);
	logicalOperations(15,7);
	logicalOperations(6,12);
	logicalOperations(24,24);
}

 public void logicalOperations(int a, int b)
 {
	 System.out.println("two numbers:" + a);
	 System.out.println("two numbers:" + b);
	 if ((a>10)&&(b>10))// T && T = T // && - Logical Operator
{ 
		 if (a==b)// Relational Operator
		 {
			int sum = a+b;
			System.out.println("sum of two numbers:" + sum);
			}
			else if (a>b)
			{
				int diff = a-b;
				System.out.println("diff of two numbers:" + diff);
			}
			else if (a<b)
			{
				int prod = a*b;
				System.out.println("prod of two numbers:" + prod);
			}
			
		 
			else // F T, T F, F F --> F
			{ 
				System.out.println("your task is not performed because both or anyone of the inputs might be below 10");
			}
		 
}
 }

	 
 //write a program to find the given number is Even or Odd

  public void findEvenOdd_Test()
  {
	  findEvenOdd(22);
	  findEvenOdd(25);
  }
  
  public void findEvenOdd(int num)
  {
	  System.out.println("Given numbers:" + num);
	  // Num / 2 -> Q, Num % 2 -> R
	  int rem = num % 2;
	if (rem ==0)
	  {
		System.out.println("Given number is Even");

	  }
	else
	  {
		System.out.println("Given number is Odd");

  }
  }
}
 
 