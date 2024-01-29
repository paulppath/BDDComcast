package step_definitions;

import io.cucumber.java.en.Then;
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
}
