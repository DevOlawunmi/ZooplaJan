package co.uk.zoopla.pages;
/*Base page to write our common libraries:
Navigate (to URL), Click, Sendkeys, Select
These are all put in basepage and used everywhere in the class
*/
import co.uk.zoopla.common.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends Driver
{
public String BASE_URL = "https://www.zoopla.co.uk/";
public Select select;

public void launchURL()
{
    driver.navigate().to(BASE_URL);
}
public void selectByText(WebElement element,String text)/* for Se to select by Text, I need to specify the web element
and the text
        */
{
    select = new Select(element);
    select.selectByVisibleText(text);

}
    public void selectByValue(WebElement element,String value)/* for Se to select by Value, I need to specify the web element
and the text
        */
    {
        select = new Select(element);
        select.selectByValue(value);

    }
    public void selectByIndex(WebElement element,int index)
    {
        select = new Select(element);
        select.selectByIndex(index);

    }
}
