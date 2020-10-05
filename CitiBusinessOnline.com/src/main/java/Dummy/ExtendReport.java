package Dummy;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class ExtendReport {
	
WebDriver d;
//public static ExtendReportListner e;
//public static  ExtentReports report;
//public static ExtentTest parenttest;
//String file = "E:\\Java Workspace\\CitiBusinessOnline.com\\test-output\\Extent.html";


		
		@BeforeMethod
		
		public void setup() 
		{
			//report = new ExtentReports(file);
			
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
			d= new ChromeDriver();
		d.get("https://businessaccessuat.citibank.citigroup.com/cbusol/ang/");
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(5, TimeUnit.MINUTES);
		d.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES );
		
		}
		
		
		@Test
		
		public void test1()
		{
			//parenttest.assignCategory("sprint 1");
			String title = d.getTitle();
			System.out.println(title);
		}
		
		@Test
		
		public void test2()
		{
			//parenttest.assignCategory("sprint 2");
			String name = d.findElement(By.className("title")).getText();
			System.out.println(name);
			
		}
		
		
		@AfterMethod
		 
		public void teardown()
		{
			d.quit();
		}
		
		
		
		
		
		
	}


