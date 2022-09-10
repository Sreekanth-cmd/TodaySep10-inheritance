import org.junit.Test;

public class StringOperations 
{
	String a = "          Selenium with Java        ";
	String b = "JAVA";
	String c = "              Selenium with Java     ";
	@Test
	public void basicOperations()
	{
		int len = a.length();// How many characters
		System.out.println("String length : " + len);
		    String aT = a.trim();// It will remove all leading and trailing spaces(Front & Back space remove)
		    System.out.println("String Length after trim : "+ aT.length());
		    String aL = a.trim().toLowerCase();//Java is completely k-sensitive
		    System.out.println("String in Lowercase : " + aL);
		    String aU = a.trim().toUpperCase();
		    System.out.println("String in Uppercase : " + aU);
	}
	@Test
	public void subStringOperation()//substring function
	{
		String a8 = a.trim().substring(8);//Overloaded function 
		System.out.println("String from 8th char : " + a8);
		String a08 = a.trim().substring(0, 8);//Beginning index & Ending index
		System.out.println("String from 0th - 8th : " + a08);
	}
	@Test
	public void stringContainOperation()
	{
		String aTL = a.trim().toLowerCase();
		String bTL = b.trim().toLowerCase();
		boolean result = aTL.contains(bTL);
		if (result==true)
		{
			System.out.println("String a contains String b");
		}
		else
		{
			System.out.println("String a does not contains String b");
		}
		}
	@Test
	public void stringEqualsOperation()
	{
		//Both must be strings, same in length, same in case sensitivity, same in character sequence[spelling]
		//String aTL = a.trim().toLowercase();
		//String cTL = c.trim().toLowerCase();
		//Boolean result = aTL.equals(cTL);
		boolean result = a.trim().equalsIgnoreCase(c.trim());//true or false
		if(result == true)
		{
			System.out.println("Both Strings are equal");
		}
		else
		{
			System.out.println("Both Strings are not equal");
		}
		
	}
	//split, concatenation, charAt
	
	String d = "Selenium Automation with Java";
	
	public void stringCharacterAtOperation()
	{
		int count = 0;
		char c0 = d.trim().charAt(0);
		System.out.println("Character at 0 index : " + c0);
		for(int i=0;i<d.trim().length();i++)
		{
			char ci = d.trim().charAt(i);
			System.out.println("Char at i th place  : " + ci);
			if(ci == 'a')
			{
				System.out.println("Char a is present in the main string");
				break;
			}
		}
		
	}
	public void stringCharacterCount()
	{
		int count = 0;
		for(int i=0;i<d.length();i++)
		{
			char ci = d.charAt(i);
			System.out.println("Char at "+ i +" th place : " + ci);
			if (ci=='a' || ci=='A')
			{
				count++;
			}
			}
		System.out.println("Char a count :" + count);
			}
		

	//string + string = string; string + int = string; int + string = string; 
@Test
public void stringConcatenation()
{
	System.out.println("Selenium" + "Java");
	System.out.println("Selenium" + 22);
	System.out.println(44 + "Java");
	System.out.println(22 + 44 + "Java");
	System.out.println(a.concat(d));
}

		
	String f = "Selenium with Java"; //c# , python;
	@Test
	public void splitOperation()
	{
		String[] myarr = f.trim().split(" ");
		System.out.println("My Technology :" + myarr[2]);
	}
	}
	
	


