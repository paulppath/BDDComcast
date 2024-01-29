package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.BrowserUtil;

public class Hooks
{
    @Before
    public void setUp()
    {
        BrowserUtil.getDriver();
    }
    @After
    public void tearDown()
    {
        BrowserUtil.quitDriver();
    }
}
