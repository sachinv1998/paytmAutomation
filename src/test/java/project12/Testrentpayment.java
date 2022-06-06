package project12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomClasses.Paytmheaderclas;
import PomClasses.Rentpaymentmodule;

public class Testrentpayment {

	
	public static void main (String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.navigate().to("https://paytm.com/recharge");
		
		
		Paytmheaderclas paytmheaderclas=new Paytmheaderclas(driver);
		paytmheaderclas.clickonrentpayment();
		
		Rentpaymentmodule rentpaymentmodule=new Rentpaymentmodule(driver);
		
		rentpaymentmodule.sendaccountholdernumber();
		Thread.sleep(3000);
		rentpaymentmodule.sendconfirmaccno();
		rentpaymentmodule.sendifsccode();
		rentpaymentmodule.sendaccountholdername();
		rentpaymentmodule.sendmobilenumber();
		rentpaymentmodule.clickproceed();
		
		
		
		
}
}