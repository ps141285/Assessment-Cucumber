package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage
{
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath=("//span[@class=\"base\"]"))
	WebElement text_heading;
	
	@FindBy(xpath=("//div[@class=\"panel header\"]//button[@type=\"button\"]"))
	WebElement lnk_logout;

}
