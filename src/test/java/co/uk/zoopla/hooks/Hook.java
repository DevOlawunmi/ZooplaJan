//For Page Object Model, Cucumber is programmed to look for hook. Hence the before and after commands

package co.uk.zoopla.hooks;

import co.uk.zoopla.common.Browsers;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends Browsers {


    @Before
    public void setUp()
    {
       launchBrowser("Chrome"); //a method that we've parameterized in the browser class
    }
    @After
    public void tearDown()
    {
        closeBrowser();
    }
}
