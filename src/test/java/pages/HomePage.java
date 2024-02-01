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
    @FindBy(xpath = "//button[@id='bsd-nav-meganav-toggle-Shop']")
    public WebElement shopNavBtn;
    @FindBy(xpath = "//button[@id='bsd-nav-meganav-toggle-Enterprise Solutions']")
    public WebElement enterpriseSolutionsNavBtn;
    @FindBy(xpath = "//span[text()='Support']")
    public WebElement supportNavBtn;
    @FindBy(id = "FirstName")
    public WebElement firstNameInputField;
    @FindBy(id = "LastName")
    public WebElement lastNameInputField;
    @FindBy(id = "EmailAddress")
    public WebElement emailInputField;
    @FindBy(id = "ZipCode")
    public WebElement zipCodeInputField;
    @FindBy(xpath = "//button[@class='button button-primary button-text'][text()='Get Started']")
    public WebElement getStartBtn;
    @FindBy(xpath = "//button[@class='button button-primary button-text'][text()='Get My Free Quote']")
    public WebElement getMyFreeQuoteBtn;
    @FindBy(xpath = "//legend[@class='headline-4']")
    public WebElement qetAQuoteHeader;
    @FindBy(xpath = "//h2[@class='headline-2']")
    public WebElement helpfulResourceHeader;
    @FindBy(xpath = "//a[@id='bx-close-inside-2449058']")
    public WebElement topScreenBannerCloseBtn;
}
