package arraysConcepts;

import org.junit.Test;

public class DynamicArrayInteger {

	@Test
	public void dynamicArray_Integer()
	{
		int[] numbers = new int[10];
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



