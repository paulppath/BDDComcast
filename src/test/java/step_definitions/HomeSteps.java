package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import utils.BrowserUtil;

public class HomeSteps
{
    HomePage page;
    public HomeSteps()
    {
        page = new HomePage();
    }
    @Given("User navigate to homepage")
    public void user_navigate_to_homepage() {
        // Write code here that turns the phrase above into concrete actions
        BrowserUtil.getDriver().get("https://business.comcast.com/");
    }
    @Then("User should see {string} Btn is displayed")
    public void userShouldSeeBtnIsDisplayed(String btn)
    {
        BrowserUtil.assertTrue(page.signInBtn.isDisplayed());
        BrowserUtil.closeDriver();
    }
    @Then("User should see header as {string}")
    public void userShouldSeeHeaderAs(String title)
    {
        // Write code here that turns the phrase above into concrete actions
        String actualTitle = BrowserUtil.getDriver().getTitle();
        BrowserUtil.assertEquals(actualTitle, title);
        BrowserUtil.closeDriver();
    }
    // test for confclt
}
