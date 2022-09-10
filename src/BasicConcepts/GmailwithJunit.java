package BasicConcepts;

import org.junit.Test;

public class GmailwithJunit {
	@Test 
	// Junit will treat it as a test method
	public void composeAndSend ()
	{
		//Step 1.1 : launch, Step 1.2 : login, Step 1.3 : compose, Step 1.4 : Send, Step 1.5 : logout step, Step 1.6 : Close
		//Launch process Selenium code
		//Open browser
		//Call url
		//Maximize
		//Title validation
		//Check url
		System.out.println("Test case : ComposeAndSendAnEmail");
	}

	public void replytoAnEmail()
	{
		//launch, login, open, reply, logout, close
		System.out.println("Test case : ReplytoAnEmail");
		System.out.println("Test case : ComposeAndSendAnEmail");
	}
	public void ForwardAnEmail()
	{
		//launch, login, open, reply, logout, close
		System.out.println("Test case : ForwardAnEmail");
		System.out.println("Test case : ComposeAndSendAnEmail");
	
	}
	public void DeleteAnEmail()
	{
		//launch, login, open, delete, logout, close
		System.out.println("Test case : DeleteAnEmail");
		System.out.println("Test case : ComposeAndSendAnEmail");
	}
}
	