package stepdefinitions;

import java.util.Collections;
import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {
	
	//private static final Exception Throwable = null;
	@Given("user is on netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("navigating to the url");
	}

	@When("user login into application page with username and password")
	public void user_login_into_application_page_with_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("enter the user name and password");
	}

	@Then("homepage is populated")
	public void homepage_is_populated() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("validating the homepage");
	}

	
	
	@When("user login into application page with {string} and passwword {string}")
	public void user_login_into_application_page_with_and_passwword(String Strarg1, String Strarg2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(Strarg1);
		System.out.println(Strarg2);
	}
	
	
	@And("cards displayed are {string}")
	public void cards_displayed_are(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
	}
	@When("user login into application page with following details")
	public void user_sign_up_with_following_details(io.cucumber.datatable.DataTable dataTable) {

		List<List<String>> datas = dataTable.asLists();

		System.out.println(datas.get(0).get(0));

		System.out.println(datas.get(0).get(1));

		System.out.println(datas.get(0).get(2));

		System.out.println(datas.get(0).get(3));

		System.out.println(datas.get(0).get(4));
	
		
	}
	
	@Given("validate the browser")
	public void validate_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("validate the browser");
	}

	@When("Browser is triggered")
	public void browser_is_triggered() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Browser is triggered");
	}

	@Then("check if browser is started")
	public void check_if_browser_is_started() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("browser is started");
	}

}
