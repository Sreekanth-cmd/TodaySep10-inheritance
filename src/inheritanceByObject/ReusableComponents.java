package inheritanceByObject;

public class ReusableComponents 
{
	public ReusableComponents()//default
	{
		System.out.println("clean the database");
		System.out.println("Open default browser: CHROME");
	}
	    public ReusableComponents(String browser)//Overloading
	    {
	    	System.out.println("clean the Data Base");
	    	if(browser.equalsIgnoreCase("CHROME"))
	    	{
	    		System.out.println("Open Chrome Browser");
	    	}
	    	else if(browser.equalsIgnoreCase("FIREFOX"))
	    	{
	    		System.out.println("Open Firefox Browser");
	    		
	    	}
	    	else if(browser.equalsIgnoreCase("IE"))
	    	{
	    		System.out.println("Open Ie Browser");
	    		
	    	}
	    }
	
	
	
	//****************Reusable Component**************
		public void launchApplication()//private within the class works
		{
			//launch, login, open, delete, logout, close
			System.out.println("RC : launchApplication");
			//Launch process Selenium code
					//Open browser
					//Call url
					//Maximize
					//Title validation
					//Check url
		}

	        
	     public void loginToApplication()
	     {
	    	 System.out.println("RC : Login To Application");
	     }
	     public void logoutFromApplication()
	     {
	    	 System.out.println("RC : Logout From Application");
	     }
	     public void closeApplication()
	     {
	    	 System.out.println("RC : Close Application");
	     }
	     public void compose()
	     {
	    	 System.out.println("RC : Compose Mail");
	     }
	     public void send()
	     {
	    	 System.out.println("RC : Send Mail");
	     }
	     public void open()
	     {
	    	 System.out.println("RC : Open Mail");
	     }
	     public void reply()
	     {
	    	 System.out.println("RC : Reply Mail");
	     }
	     public void forward()
	     {
	    	 System.out.println("RC : Forward Mail");
	     }
	     public void delete()
	     {
	    	 System.out.println("RC : Delete Mail");
	     }
	}



