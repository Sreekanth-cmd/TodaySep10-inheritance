package seleniumPractice;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApsrtcAutomation {
	WebDriver driver;
	public ApsrtcAutomation (){
		System.out.println("ApsrtcAutomation Default Constructor");
		System.setProperty("webdriver.chrome.driver","D:\\Automation Testing\\CoreJava\\JarFiles\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void lauchApplication() {
		driver.get("https://www.apsrtconline.in/");

		
		
	}
	

}
