package generalStore;

import org.junit.Test;

import calculator.ArithematicOperations;
import calculator.CommercialCalculator;
import calculator.MiniCalculator;
import calculator.ScientificCalculator;

public class CustomerBill {
	@Test
	public void generalCustomerBill(){
		int prod1 = 343434;
		int prod2 = 242424;
		//MiniCalculator mCalc = new MiniCalculator();// Class = Contractor
		//CommercialCalculator cCalc = new CommercialCalculator();
		ScientificCalculator sCalc = new ScientificCalculator();
		ArithematicOperations aCalc = new ScientificCalculator();
		aCalc.addition(prod1, prod2);
		sCalc.displayLogo();
		//WebDriver driver = new ChromeDriver(); Selenium Concept equal as 18th line // WebDriver = Interface,  ChromeDrive = Class;
		//cCalc.displayLogo();
		//mCalc.displayLogo();
		int bill = sCalc.multiplication(prod1, prod2);
		//int bill1 = cCalc.substraction(prod1, prod2);
		//int bill = mCalc.addition(prod1, prod2);
		//System.out.println("Bill Amount :" + bill);
		//System.out.println("Bill Amount :" + bill1);
		System.out.println("Bill Amount :" + bill);
		
		
		
		}

}
