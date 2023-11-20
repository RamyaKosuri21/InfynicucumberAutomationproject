package Infynicucumberautomation.stepdefinitions;

import java.io.IOException;
import org.testng.Assert;
import Infynicucumberautomation.pageobjects.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions extends LoginPage {
	
	
	@Given("User is in login page")
	public void user_is_in_login_page() throws IOException {
		launchApp();
	}

	@When("User enters email id")
	public void user_enters_email_id() {
		enterEmailid("ramya.kos@gmail.com");
	}

	@When("User enters password")
	public void user_enters_password() {
		enterPassword("Test@123"); 
	}
	
	@When("User enters email id {string}")
	public void user_enters_email_id(String emailid) {
		enterEmailid(emailid);  
	}
	@When("User enters password {string}")
	public void user_enters_password(String password) {
		enterPassword(password);    
	}

	@When("User clicks signin button")
	public void user_clicks_signin_button() {
		signIn();
	}

	@Then("User should see All projects page")
	public void user_should_see_all_projects_page() {
		String actualText = allProjectsText();
		String expectedText = "All projects";

		Assert.assertEquals(actualText, expectedText);
	}

	@Then("User should not see All projects page")
	public void user_should_not_see_all_projects_page() {
		boolean actualresult = errorMessagePresence();
		boolean expectedresult = true;

		Assert.assertEquals(actualresult, expectedresult);
	
}
	@After
	public static void closeApp() {
		driver.close();
	}
	/*
	 * @Before public void launchBrowser() { launchBrowser("Chrome"); }
	 */
}