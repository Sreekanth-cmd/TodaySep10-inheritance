package calculator;

public class CommercialCalculator implements ArithematicOperations
{

	   public void displayLogo()
	   {
		   System.out.println("Welcome To Casio Commercial");
	   }

	@Override
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int substraction(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int multiplication(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int division(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
