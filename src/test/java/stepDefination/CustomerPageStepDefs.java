package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObject.AddNewCustomerPage;
import untilities.DriverManager;

public class CustomerPageStepDefs {


	public AddNewCustomerPage addNewCustomerPage;
	public DriverManager driverManager;
	// add new customer feature

	@Then("User can view Dashboard")
	public void user_can_view_dashboard() {
		this.addNewCustomerPage = new AddNewCustomerPage();
		String actualTitle = addNewCustomerPage.getPageTitle();
		String expectedTitle = "Dashboard / nopCommerce administration";

		if (actualTitle.equals(expectedTitle)) {
			// log.info("user can view dashboard test passed.");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			// log.warn("user can view dashboard test failed.");
		}
	}

	@When("User click on Customer menu")
	public void user_click_on_customer_menu() {
		addNewCustomerPage.clickOnCustomersMenu();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("User click on customer Menu item")
	public void user_click_on_customer_menu_item() {
		addNewCustomerPage.clickOnCustomersMenuItem();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("click on Add new button")
	public void click_on_add_new_button() {
		addNewCustomerPage.clickOnAddnew();
	}

	@Then("User can view Add new customer page")
	public void user_can_view_add_new_customer_page() {
		String actualTitle = addNewCustomerPage.getPageTitle();
		String expectedTitle = "Add a new customer / nopCommerce administration";

		if (actualTitle.equals(expectedTitle)) {
			// log.info("User can view Add new customer page- passed");

			Assert.assertTrue(true);// pass
		} else {
			// log.info("User can view Add new customer page- failed");

			Assert.assertTrue(false);// fail
		}
	}

	@When("User enter customer info")
	public void user_enter_customer_info() {
		addNewCustomerPage.enterEmail("cs123@gmail.com");
		addNewCustomerPage.enterPassword("test1");
		addNewCustomerPage.enterFirstName("Prachi");
		addNewCustomerPage.enterLastName("Gupta");
		addNewCustomerPage.enterGender("Female");
		addNewCustomerPage.enterDob("6/13/1988");
		addNewCustomerPage.enterCompanyName("CodeStudio");
		addNewCustomerPage.enterAdminContent("Admin content");
		addNewCustomerPage.enterManagerOfVendor("Vendor 1");
	}

	@When("click on Save button")
	public void click_on_save_button() {
		addNewCustomerPage.clickOnSave();
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String exptectedConfirmationMsg) {
		String bodyTagText = addNewCustomerPage.getConfirmationMessage();
		if (bodyTagText.contains(exptectedConfirmationMsg)) {
			Assert.assertTrue(true);// pass
			//log.info("User can view confirmation message - passed");

		} else {
			//log.warn("User can view confirmation message - failed");
			Assert.assertTrue(false);// fail

		}
	}

}
