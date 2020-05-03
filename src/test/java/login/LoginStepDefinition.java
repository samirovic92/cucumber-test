package login;

import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

import static org.junit.Assert.*;

public class LoginStepDefinition {

    AuthenticationsService authenticationsService;

    @Before
    public void init() {
        authenticationsService = new AuthenticationsServiceImpl();
    }


    @Given("^user navigates to Login Page$")
    public void naviage_to_home_page() {
        System.out.println("go to home page");
    }

    @When("^I enter the Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$" )
    public void I_enter_Username(String username, String password ) {
        boolean isConnected = authenticationsService.isLoggedIn(username,password);
        assertTrue(isConnected);
    }


    @Then("^login should be successful$")
    public void validateRelogin() {
        System.out.println("Test Suces");
    }
}
