import org.junit.Test;

public class MyArrays 
{
	//Modifier[opt],  DataType,  Name  =   Value;
	public int stdNum = 22;// Instance Member
	public int stdNum2 = 23;
	public int stdNum3 = 24;
	 
	//Modifier[opt], DataType[], Name = (Value.......);
	@Test
	public void fixedArray_integer()
	{
		//local variable should not have any access modifier as private,default,protected,public
		// private : visible in class level; default : visible in package level
		//               0  1  2 3  4  5  6  7 8 9  //[10]---index out of bounds Exeception
		int[] numbers = {45,23,6,23,78,98,54,3,2,76};//Allows duplicate values  [Local member so this Illegal Modifier]
		//declaration, assignment, length, read elements, write elements
		String[] names= {"Ram", "Ramesh", "Rajesh", "Ravi"};
	        int len = numbers.length;
		
		System.out.println("Array Length : " + len);
		String value = names[3];
		names[0] = "Ram";
		int value1 = numbers[0]; // reading the values
		numbers[0] = 99; // writing the values
		for (int i=0; i<len; i++)
		{
			for(int s=0; s<len; s++)
			{
			value1 = numbers[i];
			
			int s1 = 0;
			value = names[s1];
			System.out.println("Elements in the array :" + value1);
			System.out.println("Elements in the array :" + value);
		}
		}
	}
	
		

	
public void dynamicArray_integer()
{
	int[] numbers = new int[10];//0-9
	//default values int = 0; string = null; boolean = false
	String[] names= {"Ram", "Ramesh", "Rajesh", "Ravi"};
        int len = numbers.length;
	System.out.println("Array Length : " + len);
	//String value = names[3];
	//names[0] = "Ram";
	//int value1 = numbers[0]; // reading the values
	//numbers[0] = 99; // writing the values
	for (int i=0; i<len; i++)
	{
		
		int value = numbers[i];
		System.out.println("Elements in the array :" + value);
		
	}
	for(int i=0; i<len; i++)// 0-9 -->10 IndexoutofBounds exception
	{
		
	 numbers[i] = 22+i;
		System.out.println("Elements in the array :" + 	 numbers[i]);
		
	}
}
@Test
public void dynamicArray_string()
{
	//local variable should not have any access modifier as private,default,protected,public
	// private : visible in class level; default : visible in package level
	//               0  1  2 3  4  5  6  7 8 9  //[10]---index out of bounds Exeception
	//int[] numbers = {45,23,6,23,78,98,54,3,2,76};//Allows duplicate values  [Local member so this Illegal Modifier]
	//declaration, assignment, length, read elements, write elements
	//String[] names= {"Ram", "Ramesh", "Rajesh", "Ravi"};
	String[] names = new String[10];
        int len = names.length;
	
	System.out.println("Array Length : " + len);
	//String value = names[3];
	//names[0] = "Ram";
	//int value1 = numbers[0]; // reading the values
	//numbers[0] = 99; // writing the values
	for (int i=0; i<len; i++)
	{
		String value = names[i];
		System.out.println(i+"--Elements in the array :" + value);
	}
	for (int i=0; i<len; i++)
	{
	names[i] = "Java"+i;
		System.out.println(i+"--Elements in the array :" + names[i]);
	}
		//public void fixedArray_integer()
		{
			//local variable should not have any access modifier as private,default,protected,public
			// private : visible in class level; default : visible in package level
			//               0  1  2 3  4  5  6  7 8 9  //[10]---index out of bounds Exeception
			//int[] numbers = {45,23,6,23,78,98,54,3,2,76};//Allows duplicate values  [Local member so this Illegal Modifier]
			//declaration, assignment, length, read elements, write elements
			//String[] names= {"Ram", "Ramesh", "Rajesh", "Ravi"};
		      //  int len = numbers.length;
			
			//System.out.println("Array Length : " + len);
			//String value = names[3];
			//names[0] = "Ram";
			//int value1 = numbers[0]; // reading the values
			//numbers[0] = 99; // writing the values
			//for (int i=0; i<len; i++)
			//{
				//for(int s=0; s<len; s++)
				//{
				//value1 = numbers[i];
				
				//int s1 = 0;
				//value = names[s1];
				//System.out.println("Elements in the array :" + value1);
				//System.out.println("Elements in the array :" + value);
			}
			}
		{
		//value1 = numbers[i];
		
		//int s1 = 0;
		//value = names[s1];
		
		//System.out.println("Elements in the array :" + value);
	
	}
	
	
	
	
	
	
	
}
