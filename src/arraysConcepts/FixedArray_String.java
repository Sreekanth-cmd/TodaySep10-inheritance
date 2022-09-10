package arraysConcepts;

import org.junit.Test;

public class FixedArray_String {
	
	@Test
	public void fixedArray_integer()
	{
		String[] names = {"Ram","Ravi","Raj","Rani"};
		int len = names.length;
		System.out.println("Length of the array:" + len);
		 String temp = names[1];
		System.out.println(temp);
//		for(int i=0;i<len;i++)
//		{
//			int mynum = numbers[i];
//			System.out.println("Elements:"+ mynum);
//		}
//	
	for(int i=0;i<len;i++)
	{
		names[i] = "Selenium"+i;
         String mynum = names[i];
        System.out.println("Elements after:" + mynum);
}
	}
}



