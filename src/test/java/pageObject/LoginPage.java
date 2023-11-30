package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefination.BaseClass;

public class LoginPage extends BaseClass {
	
	
	// constructor
	public LoginPage() {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="Email")
	WebElement emailField;
	
	@FindBy(id = "Password")
	WebElement passwordField;
	
	@FindBy(xpath = "//button[@class='button-1 login-button']")
	WebElement LoginButton;
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement logoutbutton;
	
	public void enterEmail(String email) {
		emailField.clear();
		emailField.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		passwordField.clear();
		passwordField.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		LoginButton.click();
	}
	
	public void clickOnLogoutButton() {
		logoutbutton.click();
	}
	public void verifyPageTitle(String expectedTitle) {
		String actual_title = driver.getTitle();
		if(actual_title.equals(expectedTitle)) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
	}

}
