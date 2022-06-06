package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rentpaymentmodule {

	@FindBy(xpath="(//input[@autocomplete='new-password'])[1]")
	private WebElement accountholdernumber;
	
	@FindBy(xpath="(//input[@autocomplete='new-password'])[2]")
	private WebElement confirmaccno;
	
	@FindBy(xpath="(//input[@autocomplete='new-password'])[3]")
	private WebElement ifsccode;
	
	@FindBy(xpath="(//input[@autocomplete='new-password'])[4]")
	private WebElement accountholdername;
	
	@FindBy(xpath="(//input[@autocomplete='new-password'])[5]")
	private WebElement mobilenumber;
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement proceed;
	
	
	public Rentpaymentmodule(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendaccountholdernumber()
	{
		accountholdernumber.sendKeys("664512354411");
	}
	
	public void sendconfirmaccno()
	{
		confirmaccno.sendKeys("664512354411");
	}
	
	public void sendifsccode()
	{
		ifsccode.sendKeys("MAHB0001038");
	}
	
	
	public void sendaccountholdername()
	{
		accountholdername.sendKeys("varade sachin");
	}
	
	
	public void sendmobilenumber()
	{
		mobilenumber.sendKeys("9763644084");
	}
	
	public void clickproceed()
	{
		proceed.click();
	}
	


	
	
	//label[text()='Confirm Bank Account Number']
}
