package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;
import untilities.DriverManager;

public class LoginPageStepDefs{
	
	public LoginPage loginPage;
	public DriverManager driverManager;
	
	public LoginPageStepDefs() {
		this.loginPage = new LoginPage();
		this.driverManager = new DriverManager();
	}

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		DriverManager.getDriver();
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		DriverManager.getUrl(url);
	}

	@When("user enters Email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String emailId, String Password) {
		loginPage.enterEmail(emailId);
		loginPage.enterPassword(Password);
	}

	@When("clicks on Login")
	public void clicks_on_login() {
		loginPage.clickOnLoginButton();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		loginPage.verifyPageTitle(expectedTitle);
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() {
		loginPage.clickOnLogoutButton();
		}

	@Then("Page title should be {string}")
	public void page_title_should_be1(String expectedTitle) {
		loginPage.verifyPageTitle(expectedTitle);
	}

	@Then("close Browser")
	public void close_browser() {
		driverManager.quitDriver();
	}

}
