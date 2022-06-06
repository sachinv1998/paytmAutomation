package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rechargemodule {

	@FindBy(xpath="(//input[@autocomplete='new-password'])[1]")
	private WebElement mobile;
	
	@FindBy(xpath="(//input[@autocomplete='new-password'])[2]")
	private WebElement amount;
	
	@FindBy(xpath="//button[text()='Rs. 239']")
	private WebElement rechargeamountclick;
	
	
	@FindBy(xpath="//button[text()='Proceed to Recharge']")
	private WebElement proceedtorechage;
	
	
	public Rechargemodule(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendmobile()
	{
		mobile.sendKeys("8767877059");
	}
	
	public void sendamount()
	{
		amount.sendKeys("239");
	}
	
	public void clickrechargeamountclick()
	{
		rechargeamountclick.click();
	}
	
	public void clickproceedtorechage()
	{
		proceedtorechage.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
