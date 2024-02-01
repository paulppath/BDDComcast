package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utils.BrowserUtil;

import java.util.List;
import java.util.Map;
import java.util.Set;

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
//                BrowserUtil.assertTrue(page.signInBtn.isDisplayed());
                BrowserUtil.isDisplayed(page.signInBtn);
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
            case "get my free quote":
                BrowserUtil.isDisplayed(page.getMyFreeQuoteBtn);
                break;
            default:
                Assert.fail("Invalid Input!!!");
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
            case "get started":
//                BrowserUtil.click(page.getStartBtn);
                page.getStartBtn.click();
                break;
            case "top screen banner close":
                BrowserUtil.click(page.topScreenBannerCloseBtn);
                break;
            default:
                Assert.fail("Invalid Input!!!");
        }
    }
    @When("User enter {string} in {string} box")
    public void user_enter_in_box(String text, String inputBox) {
        switch (inputBox.toLowerCase()){
            case "first name":
                BrowserUtil.sendKeys(page.firstNameInputField,text);
                break;
            case "last name":
                BrowserUtil.sendKeys(page.lastNameInputField, text);
                break;
            case "email":
                BrowserUtil.sendKeys(page.emailInputField, text);
                break;
            case "zip code":
                BrowserUtil.sendKeys(page.zipCodeInputField, text);
                break;
            default:
                Assert.fail("Invalid Input!!!");
        }
    }

    @Given("User scroll down to {string} text")
    public void userScrollDownToText(String text)
    {
        BrowserUtil.scrollIntoView(page.helpfulResourceHeader);
        BrowserUtil.scrollIntoView(page.qetAQuoteHeader);
    }
    // test for confclt
    @When("User enter information in the following input fields")
    public void user_enter_information_in_the_following_input_fields(Map<String, String> input)
    {
        Set<String> field = input.keySet();
        for (String info : field)
        {
            switch(info.toLowerCase())
            {
                case "first name":
                    BrowserUtil.sendKeys(page.firstNameInputField, input.get(info));
                    break;
                case "last name":
                    BrowserUtil.sendKeys(page.lastNameInputField, input.get(info));
                    break;
                case "email":
                    BrowserUtil.sendKeys(page.emailInputField, input.get(info));
                    break;
                case "zip code":
                    BrowserUtil.sendKeys(page.zipCodeInputField, input.get(info));
                    break;
                default:
                    Assert.fail("Invalid Input!!!");
            }
        }
    }

    @Then("User should see following button is displayed")
    public void userShouldSeeFollowingButtonIsDisplayed(List<String> navBtns)
    {
        for (String btn : navBtns)
        {
            switch (btn.toLowerCase())
            {
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
                    Assert.fail("Invalid Input!!!");
            }
        }
    }
}
