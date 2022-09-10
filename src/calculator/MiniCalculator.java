package calculator;


//class extends class

public class MiniCalculator implements ArithematicOperations{
	
	
   public void displayLogo()
   {
	   System.out.println("Welcome To Casio Mini");
   }
   
	@Override
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		int sum = a+b;
		 
		return sum;
	}

	@Override
	public int substraction(int a, int b) {
		// TODO Auto-generated method stub
		int diff = a-b;
		return diff;
	}

	@Override
	public int multiplication(int a, int b) {
		// TODO Auto-generated method stub
		int prod = a*b;
		return prod;
	}

	@Override
	public int division(int a, int b) {
		// TODO Auto-generated method stub
		int div = a/b;
		return div;
	}

}
