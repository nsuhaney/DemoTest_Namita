package autoapp.automation.stepDef;

import static org.junit.Assert.assertEquals;

import autoapp.automation.pages.RegisterPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MenuNavStepDef {

	 @When("^I navigate through menus (.+) and (.+)$")
	    public void i_navigate_through_menus_and(String mainmenu, String submenu) throws Throwable {
		RegisterPage.navigateToMenu();
	}

	@Then("^(.+) is displayed$")
	public void is_displayed(String productlisttitle) throws Throwable {
		String actualProductTitle = RegisterPage.getProductListTitle();
		assertEquals(productlisttitle, actualProductTitle);

	}

}
