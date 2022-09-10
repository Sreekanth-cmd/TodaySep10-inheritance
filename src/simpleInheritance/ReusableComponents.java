package simpleInheritance;

public class ReusableComponents 
{
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



