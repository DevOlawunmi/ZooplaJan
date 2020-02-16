//The actions take place in the pages


package co.uk.zoopla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage //we want to access basepage and therfore the driver class (Selenium)
{
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "search-input-location")
    private WebElement searchBox;

    public void enterLocation(String location)
    {
        searchBox.sendKeys();


    }
}

