package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.BrowserUtil;

public class HomeSteps
{
    @Given("User navigate to homepage")
    public void user_navigate_to_homepage() {
        // Write code here that turns the phrase above into concrete actions
        BrowserUtil.getDriver().get("https://business.comcast.com/");
    }
    @Then("User should see header as Comcast Business - Official Site")
    public void user_should_see_header_as_comcast_business_official_site() {
        // Write code here that turns the phrase above into concrete actions
        String title = BrowserUtil.getDriver().getTitle();
        String expectedTitle = "Comcast Business - Official Site";
        BrowserUtil.assertEquals(title, expectedTitle);
        BrowserUtil.closeDriver();
    }
}
