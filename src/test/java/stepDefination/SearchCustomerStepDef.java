package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.SearchCustomerPage;
import untilities.DriverManager;

public class SearchCustomerStepDef {

    public SearchCustomerPage searchCustomerPage;


    @When("Enter customer Email")
    public void enter_customer_email() {
        searchCustomerPage.enterEmailAdd("victoria_victoria@nopCommerce.com");
    }
    @When("Click on search button")
    public void click_on_search_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User should found Email in the Search table")
    public void user_should_found_email_in_the_search_table() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
