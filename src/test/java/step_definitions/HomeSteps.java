package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomeSteps
{
    @Given("User navigate to homepage")
    public void user_navigate_to_homepage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Nav to homepage");
    }
    @Then("User should see header as Comcast Business - Official Site")
    public void user_should_see_header_as_comcast_business_official_site() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user see header");
    }
}
