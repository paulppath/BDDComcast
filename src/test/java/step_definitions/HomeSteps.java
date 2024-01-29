package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
        switch (btn.toLowerCase())
        {
            case "sing in":
                BrowserUtil.assertTrue(page.signInBtn.isDisplayed());
                break;
            case "shop":
                BrowserUtil.isDisplayed(page.shopNavBtn);
                break;
            case "enterprise solutions":
                BrowserUtil.isDisplayed(page.enterpriseSolutionsNavBtn);
                break;
            case "support":
                BrowserUtil.isDisplayed(page.supportNavBtn);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
    @Then("User should see header as {string}")
    public void userShouldSeeHeaderAs(String title)
    {
        // Write code here that turns the phrase above into concrete actions
        String actualTitle = BrowserUtil.getDriver().getTitle();
        BrowserUtil.assertEquals(actualTitle, title);
    }

    @When("User click on {string} button")
    public void userClickOnButton(String btn)
    {
        switch (btn.toLowerCase())
        {
            case "sign in":
                BrowserUtil.click(page.signInBtn);
                break;
            default:
                System.out.println("Invalid input!!!");
        }
    }
    // test for confclt
}
