package stepDefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinations {
	
	@Given("get we driver instance")
	public void get_we_driver_instance() {
	    System.out.println("got web driver");
	}

	@When("launch browser")
	public void launch_browser() {
	    System.out.println("browser launched");
	}

	@Then("hit URL")
	public void hit_url() {
	    System.out.println("opened url");
	}
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("on login page");
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String string) {
		System.out.println("entered username " + string);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String string) {
		System.out.println("entered password " + string);
	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
		System.out.println("Clicked login button");
	}

	@Then("User should navigate to Home page")
	public void user_should_navigate_to_home_page() {
		System.out.println("viewed home page");
	}

	@Then("User shuld see his details")
	public void user_shuld_see_his_details() {
		System.out.println("viewed his details");
	}

	@Then("User shuld not see his details")
	public void user_shuld_not_see_his_details() {
		System.out.println("user did not view his details");
	}

	@When("User clicks sign up button")
	public void user_clicks_sign_up_button() {
		System.out.println("clicked sign up button");
	}

	@When("user enters following details")
	public void user_enters_following_details(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();

		System.out.println(data.get(0).get(0));
		System.out.println(data.get(0).get(1));
		System.out.println(data.get(0).get(2));
		System.out.println(data.get(0).get(3));
		System.out.println(data.get(0).get(4));
		System.out.println(data.get(0).get(5));

		/*
		 * System.out.println(data.get(1).get(0));
		 * System.out.println(data.get(1).get(1));
		 * System.out.println(data.get(1).get(2));
		 * System.out.println(data.get(1).get(3));
		 * System.out.println(data.get(1).get(4));
		 * System.out.println(data.get(1).get(5));
		 */

		/*
		 * for (int i=0; i<data.size(); i++) { for (int j=0; j<data.get(i).size();j++) {
		 * System.out.println(data.get(i).get(j)); } }
		 */
	}

	@When("User clicks submit button")
	public void user_clicks_submit_button() {
		System.out.println("submit clicked");
	}

	@Then("sign up is successfully done.")
	public void sign_up_is_successfully_done() {
		System.out.println("signed up successfully");
		System.out.println("signed up successfully");
		System.out.println("signed up successfully");
	}

	@When("^User enters username (.+) and (.+)$")
	public void user_enters_username_user1_and_pass1(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}
	
	@When("User clicks submit button")
	public void user_clicks_submit_button1() {
		System.out.println("submit clicked");
	}
}
