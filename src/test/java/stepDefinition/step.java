package stepDefinition;

import PageObject.HomePage;
import PageObject.MyAccountPage;
import PageObject.SignUpPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class step
{
    WebDriver driver;
    SignUpPage signupPage;
    HomePage homePage;
    MyAccountPage myAccountPage;
    @Given("I am on the signup page")
    public void i_am_on_the_signup_page()
    {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user")+"//Driver//chromedriver.exe");
        driver = new ChromeDriver();

        // Navigate to the signup page
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
        homePage=new HomePage(driver);
        signupPage=new SignUpPage(driver);
        myAccountPage=new MyAccountPage(driver);
        homePage.clickOnLink();
    }

    @When("I fill in the {string} field with {string}")
    public void i_fill_in_the_field_with(String fieldName, String value)
    {
        switch (fieldName) {
            case "First Name":
                signupPage.enterFirstName(value);
                break;
            case "Last Name":
                signupPage.enterLastName(value);
                break;
            case "Email ID":
                signupPage.enterEmail(value);
                break;
            case "Password":
                signupPage.enterPassword(value);
                break;
            case "Confirm Password":
                signupPage.enterConfirmPassword(value);
                break;
            default:
                throw new IllegalArgumentException("Invalid field name: " + fieldName);
        }
    }
    @When("I leave the {string} field empty")
    public void i_leave_the_field_empty(String fieldName) {
        i_fill_in_the_field_with(fieldName, "");

    }

    @When("I click the {string} button")
    public void i_click_the_button(String buttonName)
    {
        if (buttonName.equals("Create Account")) {
            signupPage.clickCreateAccount();
        } else {
            throw new IllegalArgumentException("Invalid button name: " + buttonName);
        }
    }

    @Then("I should see a confirmation message {string}")
    public void i_should_see_a_confirmation_message(String expectedMessage)
    {


            String actualMessage = signupPage.getEmailErrorMessage();
            assertEquals("Error message mismatch", expectedMessage, actualMessage);

        driver.quit();

    }


}
