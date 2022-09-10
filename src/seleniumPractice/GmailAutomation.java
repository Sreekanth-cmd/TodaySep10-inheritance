package seleniumPractice;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class GmailAutomation {
	String expectedTitle = "Gmail";
	WebDriver driver; //null
	
		public GmailAutomation()
		{
	
	
	System.setProperty("webdriver.chrome.driver","D:\\Automation Testing\\CoreJava\\JarFiles\\chromedriver_win32\\chromedriver.exe");//Session Not Created Exception -- Chrome version not matched
	//ChromeDriver driver = new ChromeDriver(); //Opens an empty chrome browser window// Session ID
	driver = new ChromeDriver();//Web driver = Interface, Chrome driver = Class;
	
	//java.lang.IllegalStateException: The path to the driver executable must be set by the webdriver.chrome.driver system property; for more information, see https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver. The latest version can be downloaded from http://chromedriver.storage.googleapis.com/index.html
    //org.openqa.selenium.WebDriverException: unknown error: net::ERR_NAME_NOT_RESOLVED
	  //(Session info: chrome=104.0.5112.81)
		}
		// INSTANTIATE 
	
	@Test
	public void launchApplication()
	{
		System.out.println("Launch Application");
		driver.get("http://gmail.com");//java.lang.Null POINTER EXCEPTION ---> UNCHECKED EXCEPTION
		String session = driver.getWindowHandle();
		System.out.println("window session ID:" + session);
		String cUrl = driver.getCurrentUrl();
		System.out.println("Current URL :" + cUrl);
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title :" + actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle); // Validation or Assertion
		//WebElement emailObj = driver.findElement(By.name("identifier"));
		
	}
	
	@Test
	public void loginToApplication()
	{
		
		launchApplication(); //EMPTY SCREEN --> No Such Element Exception : Unable to locate Element;
		
		WebElement emailObj = driver.findElement(By.id("identifierId"));//No Such Element Exception : Unable to locate Element;
		emailObj.click();
//		emailObj.sendKeys("fhguigihohoi");//DOM - Data Object Model // XML File
//		emailObj.clear();
//		emailObj.sendKeys("srikanth.daruri");
//		List<WebElement> elements = driver.findElements(By.className("VfPpkd-vQzf8d"));
//		//WebElement element = elements.get(1);
//		//element.click();
//		for(int i=0;i<elements.size();i++)
//		{
//		  String txt = elements.get(i).getText();
//		  System.out.println("Objects.searched :" + txt);
//		  if(txt.equals("Next")) // DYNAMIC CODE
//		  {
//			  elements.get(i).click();
//			  break;
//			  
		  }
		
		
	
	//Exception Sequence :Constructor --> Lauch Application --> ForgotEmail
	
	@Test
	public void forgotMyEmail()
	{
		launchApplication();
		System.out.println("User Forgot his Email");
		driver.findElement(By.tagName("button")).click();
		List<WebElement> elements = driver.findElements(By.tagName("button"));
		for(int i=0;i<elements.size();i++)
		{
		  String txt = elements.get(i).getText();
		  if(txt.equals("Forgot Email"))
		  {
			  elements.get(i).click();
			  break;
			  
		  }
		}
		
	}
		@Test
		public void createMyAccount()
		{
			launchApplication();
			System.out.println("User Forgot his Email");
			driver.findElement(By.tagName("button")).click();
			List<WebElement> elements = driver.findElements(By.tagName("button"));
			for(int i=0;i<elements.size();i++)
			{
			  String txt = elements.get(i).getText();
			  System.out.println("Objects.searched :" + txt);
			  if(txt.equals("Create Account"))
			  {
				  elements.get(i).click();
				  break;
			  } 
			  }
			


}
			@Test
			public void userLearnMore()
			{
				launchApplication();
				System.out.println("User Forgot his Email");
				//driver.findElement(By.tagName("button")).click();
				List<WebElement> elements = driver.findElements(By.tagName("a"));
				for(int i=0;i<elements.size();i++)
				{
				  String txt = elements.get(i).getText();
				  System.out.println("Objects.searched :" + txt);
				  if(txt.equals("Learn more"))
				  {
					  elements.get(i).click();
					  break;
					  
				  }
				}
			}
			
				@Test
				public void Help()
				{
					launchApplication();
					System.out.println("User Forgot his Email");
					//driver.findElement(By.tagName("button")).click();
					List<WebElement> elements = driver.findElements(By.tagName("a"));
					for(int i=0;i<elements.size();i++)
					{
					  String txt = elements.get(i).getText();
					  System.out.println("Objects.searched :" + txt);
					  if(txt.equals("Help"))
					  {
						  elements.get(i).click();
						  break;
						  
					  }
					}
				}
				
					@Test
					public void Privacy()
					{
						launchApplication();
						System.out.println("User Forgot his Email");
						//driver.findElement(By.tagName("button")).click();
						List<WebElement> elements = driver.findElements(By.tagName("a"));
						for(int i=0;i<elements.size();i++)
						{
						  String txt = elements.get(i).getText();
						  System.out.println("Objects.searched :" + txt);
						  if(txt.equals("Privacy"))
						  {
							  elements.get(i).click();
							  break;
							  
						  }
						}
					}
						@Test
						public void termsOfService()
						{
							launchApplication();
							System.out.println("User Forgot his Email");
							//driver.findElement(By.tagName("button")).click();
							List<WebElement> elements = driver.findElements(By.tagName("a"));
							for(int i=0;i<elements.size();i++)
							{
							  String txt = elements.get(i).getText();
							  System.out.println("Objects.searched :" + txt);
							  if(txt.equals("Terms"))
							  {
								  elements.get(i).click();
								  break;
								  
							  }
							}
						
}
}
