package Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import Base.Base;
import Pages.Dashboard;
import Pages.LoginPage;

public class LoginTest extends Base{
	
	LoginPage loginpage;  //need to create object for loginpage(or) to use those elements
	Dashboard dashboard;   // for return hoempage for login method.
	
	public LoginTest()
	
	{
		super();
	//calling super call constructore(TestBase constructior
	
	}
	
	
	@BeforeMethod
	
	public void setup()
	{
		initialization();
		 loginpage = new LoginPage();
		 
	}
	
	
	@Test(priority= 1)
	
	public void pagetitle()
	{
	String pagetitle = loginpage.gettitle();	
	System.out.println(pagetitle);
	Assert.assertEquals(pagetitle, "CitiBusiness Online");
	}
	
	
	
	@Test(priority= 2)
	
	public void sigonbutton()
	{
		loginpage.signonButton();
	}
	
	
	@Test(priority= 3)
	
	public void login() throws Exception

	{
		loginpage.login(prop.getProperty("biz"),prop.getProperty("user"), prop.getProperty("password"));
		Thread.sleep(3000);
		loginpage.signonButton();
		Thread.sleep(5000);
	}
	
	@Test(priority= 4)
	
	public void bizName()
	{
		loginpage.getbizname();
	}
	
	
	@AfterMethod 
	
		public void teardown()
		{
			driver.close();
		}
		
	}



