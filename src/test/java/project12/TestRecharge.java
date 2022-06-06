package project12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomClasses.Rechargemodule;

public class TestRecharge {

	public static void main (String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.navigate().to("https://paytm.com/recharge");
	
		Thread.sleep(1222);
		Rechargemodule rechargemodule=new Rechargemodule(driver);
		
		rechargemodule.sendmobile();
		rechargemodule.sendamount();
		rechargemodule.clickrechargeamountclick();
		rechargemodule.clickproceedtorechage();
		
	}
}
