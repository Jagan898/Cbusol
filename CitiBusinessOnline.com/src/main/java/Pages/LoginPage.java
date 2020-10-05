package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base;

public class LoginPage extends Base {
	
	String bizName;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement SignonButton;
	
	
	@FindBy(id = "code")
	
	WebElement bizcode;
	
	@FindBy(id="username")
	
	WebElement userid;
	
	
	@FindBy(id = "password")
	
	WebElement password;
	
	@FindBy(id ="businessName")
	
	WebElement businessname;
	
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public String gettitle()
	{
		String title = driver.getTitle();
		return title;
		
	}
	
	public  boolean signonButton()
	{
		return SignonButton.isDisplayed();
		 
	}
	
	public void getbizname()
	{
		bizName = businessname.getText();
		System.out.println(bizName);
	}
	
public Dashboard login(String biz, String id , String pass) throws Exception
{
	Thread.sleep(5000);
	businessname.sendKeys("business1");
	Thread.sleep(5000);
	bizcode.sendKeys(biz);
	Thread.sleep(2000);
	userid.sendKeys(id);
	Thread.sleep(5000);
	password.sendKeys(pass);
	Thread.sleep(1000);
	SignonButton.click();
return new Dashboard();
	
}
	
	

}
