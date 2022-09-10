package calculator;
// Class implements Interface
public class ScientificCalculator implements ArithematicOperations,TrigonametricOperations
{

	   public void displayLogo()
	   {
		   System.out.println("Welcome To Casio Scientific");
	   }
 
@Override
public int addition(int a, int b) {
	// TODO Auto-generated method stub
	return (a+b);
}
@Override
public int substraction(int a, int b) {
	// TODO Auto-generated method stub
	return (a-b);
}
@Override
public int multiplication(int a, int b) {
	// TODO Auto-generated method stub
	return (a*b);
}
@Override
public int division(int a, int b) {
	// TODO Auto-generated method stub
	return (a/b);
}

@Override
public void sinevalue() {
	// TODO Auto-generated method stub
	System.out.println("SINE VALUE");
	
}

@Override
public void cosecValue() {
	// TODO Auto-generated method stub
	System.out.println("COSEC Value");

}

@Override
public void cosineValue() {
	// TODO Auto-generated method stub
	System.out.println("COSINE VALUE");

}
}
