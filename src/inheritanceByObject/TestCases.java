package inheritanceByObject;

import org.junit.Test;
          //    Child               Parent
public class TestCases // extends ReusableComponents 
{
	 //Modifier ClassName objName = new Constructor();
    //public ReusableComponents rcObj = new ReusableComponents();
	public ReusableComponents rcObj = new ReusableComponents("FireFox");
  @Test
	public void composeAndSend ()//default works with same package
	{
	    		  
		//Step 1.1 : launch, Step 1.2 : login, Step 1.3 : compose, Step 1.4 : Send, Step 1.5 : logout step, Step 1.6 : Close
		//Launch process Selenium code
		//Open browser
		//Call url
		//Maximize
		//Title validation
		//Check url
		System.out.println("Test case : ComposeAndSendAnEmail");
		rcObj.launchApplication();
		rcObj.loginToApplication();
		rcObj.compose();
		rcObj.send();
		rcObj.logoutFromApplication();
		rcObj.closeApplication();
	}
	@Test
	public void replytoAnEmail()
	{
		//launch, login, open, reply, logout, close
		System.out.println("Test case : ReplytoAnEmail");
		System.out.println("Test case : ComposeAndSendAnEmail");
		rcObj.launchApplication();
		rcObj.loginToApplication();
		rcObj.open();
		rcObj.reply();
		rcObj.logoutFromApplication();
		rcObj.closeApplication();
		//Launch process Selenium code
				//Open browser
				//Call url
				//Maximize
				//Title validation
				//Check url
			
	}
	@Test
	public void ForwardAnEmail()
	{
		//launch, login, open, reply, logout, close
		System.out.println("Test case : ForwardAnEmail");
		System.out.println("Test case : ComposeAndSendAnEmail");
		rcObj.launchApplication();
		rcObj.loginToApplication();
		rcObj.open();
		rcObj.forward();
		rcObj.logoutFromApplication();
		rcObj.closeApplication();
		//Launch process Selenium code
				//Open browser
				//Call url
				//Maximize
				//Title validation
				//Check url
			
	}
	@Test
	public void DeleteAnEmail()
	{
		//launch, login, open, delete, logout, close
		System.out.println("Test case : DeleteAnEmail");
		System.out.println("Test case : ComposeAndSendAnEmail");
		rcObj.launchApplication();
		rcObj.loginToApplication();
		rcObj.open();
		rcObj.delete();
		rcObj.logoutFromApplication();
		rcObj.closeApplication();
		//Launch process Selenium code
				//Open browser
				//Call url
				//Maximize
				//Title validation
				//Check url
		
			
	}
	

}
