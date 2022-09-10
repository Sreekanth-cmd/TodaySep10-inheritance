package CoreJavaTestcase;

import org.junit.Test;

//public class GmailwithMainMetho {

	//public static void main(String[] args) {
		//System.out.println("GMail Automation with Main Method");
		//composeAndSend();
		//replytoAnEmail();
		//ForwardAnEmail();
		//DeleteAnEmail();
	
	
	//composeAndSend, replytoAnEmail, ForwardAnEmail, DeleteAnEmail
	//public static void composeAndSend()
	//{
		//System.out.println("Test case : ComposeAndSendAnEmail");
	//}
	//public static void replytoAnEmail()
	//{
		//System.out.println("Test case : ReplytoAnEmail");
	//}
	//public static void ForwardAnEmail()
	//{
		//System.out.println("Test case : ForwardAnEmail");
	//}
	//public static void DeleteAnEmail()
	//{
		//System.out.println("Test case : DeleteAnEmail");
	//}

public class LoopingStatements 
{
	
  // @Test
   //public void applycolorTosteps()
   //{
	 //  System.out.println("Apply color to step 1");
	   //System.out.println("Apply color to step 2");
	   //System.out.println("Apply color to step 3");
	   //System.out.println("Apply color to step 4");
	   //System.out.println("Apply color to step 5");
	 //  System.out.println("Apply color to step 6");
   //}
   //iterator = value; condition ; step size
   //for(int iterator = 1; i<40; i=i+1) (Task)
 //@Test
   //public void applycolor_test(int i)// Apply colors for Floors
  //{
	//   for (int iterator=1;iterator<=40;iterator=iterator+1);
	   
	  // {
		 //if condition is true then it will come here  
		//System.out.println("Apply color to step: " + i);
	   
 // }




//@Test
  // public void applycolor_2()
   //{
	 // int i;
	//for ( i=40;i>100;i++);
	  // {
		//   System.out.println("Apply color to step: " + i);
	   //}
		   
	   //}
//}
 
	

   
   
//@Test
//public void findstudent()
//{ 
	//int i;
	//for(int i=1;i<=100;i++);
	//{
	    
	   // System.out.println("Searching the student :" + i);
       // if(i==92)
		//{
		
			//System.out.println("Found the student");
			
		//}
	//}
//}
//}
//@Test
//public void ascendingOrder()
//{
	//for(int i=0;i<=100;i++)
	//{
	
		//System.out.println("sorting ascendingorder:" + i);
	//}
//}

 //@Test
 //public void descendingOrder()
 
 //{
	 
	// for(int i=10;i>=1;i--)

	 //{
			
		//	System.out.println("sorting descendingorder:" + i);
		//}
	//}	 
 
  @Test
  public void FindDuplicates()
  {
	  String[] arr = {"Java","String","Selenium","Test","Java"};
	  for(int i=0;i<arr.length-1;i++)
	  {
		  for(int j=i+1;j<arr.length-3;j++)
		  {
			  
			 if(arr[i]==arr[j]);
			 {
		
			System.out.println("Find duplicates:" + arr[i]);
		}
	}	 
	  
	  }
  }


@Test
  public void MaxAndMinValues()
  {
	 int[] arr = {1,2,4,6,10,9,8};
	 int max=arr[0];
	 
	 for(int i=0;i<arr.length;i++)
	 {
		 if (arr[i]>max)
		 {
			 max=arr[i];
		 }
	 }
			 System.out.println("Maximum Element is Array is :" + max);
		 }
	 
	 
@Test
public void MinValues()
{
	 int[] arr = {1,2,4,6,10,9,8};
	 int min=arr[0];
	 
	 for(int i=0;i<arr.length;i++)
	 {
		 if (arr[i]<min)
		 {
			 min=arr[i];
		 }
	 }
			 System.out.println("Maximum Element is Array is :" + min);
		 }
	 
	 


public void SecondHighestNumber()
{
	 int[] arr = {1,2,4,6,10,9,8};
	 
	  for(int i=6;i<arr.length;i++)
	 {
		 
		 System.out.println("Second Max Element in Array is :" + arr[arr.length-2]);
		 }
	 
	 
	 
}
@Test
public void SecondSmallestNumber()
{
	 int[] arr = {1,2,4,6,10,9,8};
	 
	  for(int i=2;i<arr.length-4;i++)
	 {
		 
		 System.out.println("Second Min Element in Array is :" + i);
		 }
	 
	 
	 
}


@Test
public void FindStdRollNum()
{
	boolean flag = false;
	for(int i=1;i<=20;i++)
	{
		
		//System.out.println(i);
		if(i==25)
		{
			flag=true;
			//System.out.println("Found the Student");
			break;
		}
	}
		if(flag==true)
		{
			System.out.println("t");
		}
		else
		{
			System.out.println("f");
		}
	}
}





