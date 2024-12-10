package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	//constructor
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	//Find BY Locator
	
	@FindBy(xpath=("//div[@class='panel header']//a[normalize-space()='Create an Account']"))
	WebElement lnk_signup;
	
	//Action Method 
	
	public void clickOnLink()
	{
		lnk_signup.click();
	}

}
