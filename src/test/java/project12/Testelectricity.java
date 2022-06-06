package project12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomClasses.Paytmheaderclas;

public class Testelectricity {

	public static void main(String[] args)
	{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://paytm.com/recharge");
	Paytmheaderclas paytmheaderclas=new Paytmheaderclas(driver);
	
	paytmheaderclas.clickonelectricity();
}
}