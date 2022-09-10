import org.junit.Test;

public class BasicConcepts {
	private int stdNum = 22;//variable nothing but datatypes
	String stdName = "Sree";//variable = (Nothing but Container)
	public double stdMarks = 94;//value = Sree,94,A,JNTU
	protected char stdGrade = 'A';//data type= byte,short,int,long,float,double,boolean,char
	public boolean stdResult = true;//Signature : Variable (Method/Function)
	public static final String collegeName = "JNTU";//Function = Modifier ReturnType Name(arguments=input parameters) {body = defination}
	
	String name = collegeName;
	private String j;
	//NonAccess Modifiers : static, final
	//Access Modifiers : public, default, protected, private
	//Modifier[opt] DataType Name = value;
	//static = without inherate available for someothers(Access for users)
	//Not suppose to give returntype = void
	//Yes - type [int, string, char]
	//Function can write Multiple ways : 4Types as No-inputs & No-outputs,No-output & with-input,No-input & with-output,with-input & with-output
	//Ambicutey : Noconfussion
	public static void main (String[] args)	{
		System.out.println("Welcome to Selenium Java Automation Testing");
		addition();
		addition(44,66);
		addition(56,64,78);
		addition(12,"Sree");
		addition(966,625,478,632);
		fundtransfer(10000,20000,30000);
		int empSal = employeesalary(20000,3000,7000);
		System.out.println("credit the salary:" + empSal);
		
	}//Concept is polymorphisam nothing but method overloading using different inputs
	public static void addition()//00,01,10,11---paranthasis empty means NoInput & NoOutput
	{
	 int sum = 25+22;//concatinate [This is hard coded values]
	 System.out.println("Sum of two numbers : " + sum);
	}
	public static void addition(int a, int b)//InInput & InOuput
	{
	 int sum = a+b;//Reusable functions
	 System.out.println("Sum of two numbers Dynamic : " + sum);//Dynamic means different class can also call
	 
	}
	public static void addition(int a, String b)//Int+string,string+int,string+string = String
	{
	 String sum = a+b;//int+string = string [concatination]
	 System.out.println("Sum of two numbers Dynamic : " + sum);//Dynamic means different class can also call
	 
	}
	public static void addition(int a, int b, int c)//InInput & InOuput
	{
	 int sum = a+b+c;
	 System.out.println("Sum of three numbers Dynamic : " + sum);//Dynamic means different class can also call
	 
	}
	public static void addition(int x, int y, int z, int w)//InInput & InOuput
	{
	 int sum = x+y+z+w;
	 System.out.println("Sum of three numbers Dynamic : " + sum);//Dynamic means different class can also call
	 
	}
	public static int employeesalary(int basic, int hra, int hike)//InInput & InOuput
	{
	 int sal = basic+hra+hike;
	return sal;
	 
	}
	public static void fundtransfer(int fromAcc, int toAcc, int amount)//InInput & InOuput
	{
		 
		 System.out.println("From account : " + fromAcc);//Dynamic means different class can also call
		 System.out.println("TO account : " + toAcc);
		 System.out.println("Amount : " + amount);
	}

	//Apply color to steps in five floors each floor having 20 steps,apply different color in each floor
			@Test
			public void floorcolorToBuilding()
			{
				for(int i=1;i<=5;i++)//Outer loop
				{
					System.out.println("Apply color in First Floor :" + i);
					
						for(int j=1;j<=20;j++);//Inner loop
						{
					System.out.println("Apply color to Step :" + j);
					
				}
			}
				}
}



