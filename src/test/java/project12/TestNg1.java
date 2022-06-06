package project12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomClasses.Paytmheaderclas;

public class TestNg1 {
     WebDriver driver;
     Paytmheaderclas paytmheaderclas;
     
     
	@BeforeClass
	public void openthebrowser()
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
	}
	@BeforeMethod
	public void launchthebrowser()
	{
		driver.get("https://paytm.com/recharge");
		 paytmheaderclas=new Paytmheaderclas(driver);
		 
	}
	@Test
	public void verifyrentmodule()
	{
		paytmheaderclas.clickonrentpayment();
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		Assert.assertEquals("https://paytm.com/rent-payment", url);
		Assert.assertEquals("Rent Payment - Pay Rent using Credit Card | Rent Transfer", title);
		
	}
	
	
	@AfterMethod()
	public void closetheapplication()
	{
		
	}
	@AfterClass
	public void closethebrowser()
	{
		driver.close();
	}
	
	
}
