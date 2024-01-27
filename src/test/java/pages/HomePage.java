package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtil;

public class HomePage
{
    public HomePage()
    {
        PageFactory.initElements(BrowserUtil.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Sign In']")
    public WebElement signInBtn;
}
