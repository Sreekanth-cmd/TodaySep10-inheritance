package seleniumPractice;

import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class NaukriAutomation {
	
	String expectedTitle = "Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com";
	@Test
	public void launchApplication()
	{
		
		System.out.println("Lauch Application");
		System.setProperty("webdriver.chrome.driver","D:\\Automation Testing\\CoreJava\\JarFiles\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String session = driver.getWindowHandle();//Hexa decimal
		System.out.println("window session ID:" + session);
		String actualTitle = driver.getTitle();
		System.out.println("window actualTitle:" + actualTitle);
		String cUrl = driver.getCurrentUrl();
		System.out.println("window currentUrl:" + cUrl);
		Assert.assertEquals(expectedTitle, actualTitle);//Validation or Assertion
	  // WebElement naukriobj = driver.findElement(By.className("nI-gNb-menuItems__anchorDropdown"));
       // naukriobj.click();
        //List<WebElement> elements = driver.findElements(By.className("nI-gNb-menuItems__anchorDropdown"));
        //WebElement element = elements.get(0);
        //element.click();
       // List<WebElement> elements = driver.findElements(By.className("nI-gNb-menuItems__anchorDropdown"));
        //WebElement ele = elements.get(1);
        //ele.click();
//        List<WebElement> elements = driver.findElements(By.className("nI-gNb-menuItems__anchorDropdown"));
//        WebElement element = elements.get(2);
//        element.click();
      //  WebElement naukriobj = driver.findElement(By.id("login_Layer"));
//	    naukriobj.click();
		//WebElement naukriobj = driver.findElement(By.id("register_Layer"));
        //naukriobj.click();
        
//         List<WebElement> elements = driver.findElements(By.className("nI-gNb-menuItems__anchorDropdown"));
//         WebElement element = elements.get(3);
//         element.click();
//         
      //   WebElement naukriobj = driver.findElement(By.className("qsbSubmit"));
        // naukriobj.click();
         

//        for(int i=0;i<elements.size();i++)
//        {
//		  String txt = elements.get(i).getText();
//		  System.out.println("Objects.searched :" + txt);
//		  if(txt.equals("Login")) // DYNAMIC CODE
//		  {
//			  elements.get(i).click();
//			  break;
//		  }}		  
//		


//	    WebElement naukriwebobj = driver.findElement(By.xpath("//input[@type='submit']"));
//	    naukriwebobj.click();

	    //naukObj.click();
	   // naukObj.sendKeys("fhguigihohoi");//DOM - Data Object Model // XML File
	    //naukObj.clear();
	    //naukriobj1.sendKeys("dvsreekanth7");
       
       //WebElement naukriobj4 = driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));//No Such Element Exception : Unable to locate Element;
       //naukriobj4.sendKeys("dvsreekanth7");
	    //WebElement naukriobj2 = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
       //naukriobj2.sendKeys("9550267967");
       //WebElement naukriobj4 = driver.findElement(By.xpath("//input[@class='btn-primary loginButton']"));
        //naukriobj4.click();
      
    
//     	List<WebElement> elements = driver.findElements(By.xpath("//input[@type='submit']"));
//        WebElement element = elements.get(0);
//        element.click();
//        for(int i=0;i<elements.size();i++)
//        {
//		  String txt = elements.get(i).getText();
//		  System.out.println("Objects.searched :" + txt);
//		  if(txt.equals("Next")) // DYNAMIC CODE
//		  {
//			  elements.get(i).click();
//			  break;
//		  }}		  
		  }
		
	   // driver.findElement(By.xpath("//button[@type='submit']")).click();
//	    
	    //driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).click();
	    
	    
	    //WebElement elements = driver.findElement(By.className("text"));
	    //driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
		
		//elements.click();
		//elements.sendKeys("dvsrre");
	    //elements.sendKeys("9000");
	    //elements.click();
	   
	   
	       
	   
//	WebElement text = driver.findElement(By.xpath("//input[@class='Enter your active Email ID / Username']"));
//   text.sendKeys("dvsreekanth7@gmail.com");
    
		
	@Test
	public void jobs()
{
		launchApplication();
		System.out.println("User Forgot his NaukriMail");
		ChromeDriver driver = new ChromeDriver();
		driver.findElement(By.className("nI-gNb-menuItems__anchorDropdown"));
		List<WebElement> elements = driver.findElements(By.className("nI-gNb-menuItems__anchorDropdown"));
//        WebElement element = elements.get(0);
//        element.click();
        for(int i=0;i<elements.size();i++)
		{
		  String txt = elements.get(i).getText();
		  if(txt.equals("Forgot Naukrimail"))
		  {
			  elements.get(i).click();
			  break;
			  
		  }
		}
		
	}

	

}



