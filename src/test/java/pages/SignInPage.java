package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtil;

public class SignInPage
{
    public SignInPage()
    {
        PageFactory.initElements(BrowserUtil.getDriver(),this);
    }
    @FindBy (xpath = "//button[@id='sign_in']")
    public WebElement continueBtn;
}
