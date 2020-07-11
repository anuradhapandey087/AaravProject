package stepdef;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagelayer.PageTest;

public class StepdefTest extends BaseTest {

    PageTest pt=new PageTest();


    @Given("^User is on home page$")
    public void user_is_on_home_page() throws Throwable {
        initialization();

    }

    @When("^User entered email and password$")
    public void user_search_for_sandals() throws Throwable {
          pt.RegistrationPage();
    }

    @And("^Click on enter$")
    public void click_on_enter() throws Throwable {
          pt.HomePage();
    }

    @Then("^User will get response$")
    public void user_will_get_response() throws Throwable {

    }

}
