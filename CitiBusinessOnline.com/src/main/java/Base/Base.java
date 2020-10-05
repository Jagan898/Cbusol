package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utils.Utils;




public class Base {
	
public static	WebDriver driver;
public static	ChromeOptions options;
public static	Properties  prop;
	
	public Base() {
		try {
			
			prop = new Properties();
			FileInputStream ip = new FileInputStream("E:\\Java Workspace\\CitiBusinessOnline.com\\src\\main\\java\\Config\\config.properties");
			prop.load(ip);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
		}
		
	
	public static void initialization()
	{
		String browsername= prop.getProperty("browser");
		if (browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
			driver= new ChromeDriver();
		}else if (browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\selenium\\geckodriver.exe");
			driver= new FirefoxDriver();
			
		}
			
		
		driver.manage().window().maximize();
		
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(Utils.pagetimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Utils.implicitwait, TimeUnit.SECONDS);
		
		
}


	
}
