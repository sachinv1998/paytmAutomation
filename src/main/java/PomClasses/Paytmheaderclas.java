package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paytmheaderclas {

	@FindBy(xpath="//span[text()='Prepaid/Postpaid']")
	private WebElement prepaid;
	
	@FindBy(xpath="//span[text()='Electricity']")
	private WebElement electricity;
	
	@FindBy(xpath="//span[text()='Rent Payment']")
	private WebElement rentpayment;
	
	@FindBy(xpath="//span[text()='DTH']")
	private WebElement dth;
	
	@FindBy(xpath="//span[text()='Metro']")
	private WebElement metro;
	
	
	@FindBy(xpath="//span[text()='Broadband/Landline")
	private WebElement Broadband;
	
	@FindBy(xpath="//span[text()='Buy FASTag']")
	private WebElement Fastag;
	
	
	@FindBy(xpath="//span[text()='Education']")
	private WebElement Education;
	
	@FindBy(xpath="//span[text()='Pay Loan']")
	private WebElement Payloan;
	
	@FindBy(xpath="//span[text()='Book a Cylinder']")
	private WebElement Cylinder;
	
	@FindBy(xpath="//span[text()='More']")
	private WebElement More;
	
	public Paytmheaderclas(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickonprepaid()
	{
		prepaid.click();
	}
	
	public void clickonelectricity()
	{
		electricity.click();
	}
	
	public void clickonrentpayment()
	{
		rentpayment.click();
	}
	
	public void clickondth()
	{
		dth.click();
	}
	
	public void clickonmetro()
	{
		metro.click();
	}
	public void clickonBroadband()
	{
		 Broadband.click();
	}
	public void clickonFastag()
	{
		Fastag.click();
	}
	public void clickonEducation()
	{
		Education.click();
	}
	public void clickonPayloan()
	{
		Payloan.click();
	}
	public void clickonCylinder()
	{
		Cylinder.click();
	}
	public void clickonMore()
	{
		 More.click();
	}
	
	
	
	
}
