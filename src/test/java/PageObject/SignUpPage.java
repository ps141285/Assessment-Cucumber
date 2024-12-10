package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage 
{
   //constructor
	public SignUpPage(WebDriver driver)
	{
		super (driver);
	}


//Find Xpath

@FindBy(xpath=("//input[@id=\"firstname\"]"))
WebElement firstNameField;

@FindBy(xpath=("//input[@id=\"lastname\"]"))
WebElement lastNameField;

@FindBy(xpath=("//input[@id=\"email_address\"]"))
WebElement emailField;

@FindBy(xpath=("//input[@id=\"password\"]"))
WebElement passwordField;

@FindBy(xpath=("//input[@id=\"password-confirmation\"]"))
WebElement confirmPasswordField;

@FindBy(xpath=("//button[@title=\"Create an Account\"]//span[contains(text(),\"Create an Account\")]"))
WebElement createAccountButton;

@FindBy(xpath=("//div[@id=\"email_address-error\"]"))
WebElement emailerrorMessage;

@FindBy(xpath=("//div[@id='password-confirmation-error\']"))
WebElement pwdErrorMsg;

@FindBy(xpath = ("//div[@data-bind=\"html: $parent.prepareMessageForHtml(message.text)\"]"))
WebElement accConfirmationmsg;


//Action Method 

	public void enterFirstName(String firstName)
	{
		firstNameField.clear();
		firstNameField.sendKeys(firstName);
	}
	public void enterLastName(String lastName)
	{
		lastNameField.clear();
		lastNameField.sendKeys(lastName);
	}
	public void enterEmail(String email)
	{
		emailField.clear();
		emailField.sendKeys(email);
	}
	public void enterPassword(String password)
	{
		passwordField.clear();
		passwordField.sendKeys(password);
	}
	public void enterConfirmPassword(String confirmPassword)
	{
		confirmPasswordField.clear();
		confirmPasswordField.sendKeys(confirmPassword);
	}
	public void clickCreateAccount()
	{
		createAccountButton.click();
	}
	public String getConfirmationMessage()
	{
		return (accConfirmationmsg.getText());
	}
	public String getEmailErrorMessage()
	{
		return ( emailerrorMessage.getText());
	}
	public String getPwdErrorMessage()
	{
		return ( pwdErrorMsg.getText());
	}





}