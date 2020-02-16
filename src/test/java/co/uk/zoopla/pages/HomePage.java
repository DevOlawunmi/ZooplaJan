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
    @FindBy(name = "price_min")
    private WebElement MinPrice;
    @FindBy (name = "price_max")
    private WebElement MaxPrice;

    public void enterLocation(String location)
    {
        searchBox.sendKeys(location);

    }
    public void selectMinimumPrice(String miniPrice)
    {
        selectByText(MinPrice,miniPrice);
    }
    public void selectMaximumPrice(String maxiPrice)
    {
        selectByText(MaxPrice, maxiPrice);
    }

}


