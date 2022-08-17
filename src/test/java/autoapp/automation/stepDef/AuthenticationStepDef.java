package autoapp.automation.stepDef;

import static org.junit.Assert.assertEquals;

import autoapp.automation.pages.AuthenticationPage;
import autoapp.automation.pages.RegisterPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthenticationStepDef {

	@Given("^Automation practice authentication page is opened$")
	public void automation_practice_authentication_page_is_opened() throws Throwable {
		AuthenticationPage.openApplicaiton();
	}

	@When("^I register account with email address \"([^\"]*)\"$")
	public void i_register_account_with_email_address(String emailId) throws Throwable {
		RegisterPage.createAccount(emailId);
		Thread.sleep(5000);
	}

	@Then("^\"([^\"]*)\" error is thrown$")
	public void error_is_thrown(String expectedError) throws Throwable {
		String actualError = AuthenticationPage.captureError();
		assertEquals(expectedError, actualError);
	}
}
