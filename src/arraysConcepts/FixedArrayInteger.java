package arraysConcepts;

import org.junit.Test;

public class FixedArrayInteger {
	public int[] rollnumbers = {22,24,25,67,4,8,47};
	@Test
	public void fixedArray_integer()
	{
		int[] numbers = {22,24,25,67,4,8,47};
		int len = numbers.length;
		System.out.println("Length of the array:" + len);
		int temp = numbers[1];
		System.out.println(temp);
//		for(int i=0;i<len;i++)
//		{
//			int mynum = numbers[i];
//			System.out.println("Elements:"+ mynum);
//		}
//	
	for(int i=0;i<len;i++)
	{
        numbers[i] = 222+i;
        int mynum = numbers[i];
        System.out.println("Elements after:" + mynum);
}
	}
}
