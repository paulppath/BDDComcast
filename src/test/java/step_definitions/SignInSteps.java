package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignInPage;
import utils.BrowserUtil;

public class SignInSteps
{
    SignInPage page;
    public SignInSteps()
    {
        page = new SignInPage();
    }
    @Then("validate {string} Btn is enable")
    public void validate_btn_is_enable(String btn) {
        switch (btn.toLowerCase())
        {
            case "continue":
                BrowserUtil.assertTrue(BrowserUtil.isEnable(page.continueBtn));
                break;
            default:
                System.out.println("Invalid input!!!");
        }
    }

    @When("User enter {string} text")
    public void userEnterText(String text)
    {
        switch (text.toLowerCase())
        {
            case "email":
                BrowserUtil.sendKeys(page.emailBox,text);
                break;
            default:
                System.out.println("Invalid Input!!!");
        }
    }
}
