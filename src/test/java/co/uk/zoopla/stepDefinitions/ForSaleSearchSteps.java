package co.uk.zoopla.stepDefinitions;

import co.uk.zoopla.pages.BasePage;
import co.uk.zoopla.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class ForSaleSearchSteps extends BasePage {

    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    @Given("I navigate to Zoopla.co.uk")
    public void i_navigate_to_Zoopla_co_uk()
    {homePage.launchURL();
    }

    @Given("the To Buy tab is highlighted")
    public void the_To_Buy_tab_is_highlighted() {

    }

    @When("I enter a {string} in the search bar")
    public void i_enter_a_in_the_search_bar(String location) {
    homePage.enterLocation(location);
    }

    @When("I select a {string} from minimum price drop button")
    public void i_select_a_from_minimum_price_drop_button(String minimumPrice) {
     homePage.selectMinimumPrice(minimumPrice);
    }

    @When("I select a {string} from the maximum price drop button")
    public void i_select_a_from_the_maximum_price_drop_button(String maximumPrice) {
    homePage.selectMaximumPrice(maximumPrice);
    }

    @When("I select a {string} from the property type drop button")
    public void i_select_a_from_the_property_type_drop_button(String string) {

    }

    @When("I select {string} from the drop button")
    public void i_select_from_the_drop_button(String string) {

    }

    @When("I click on the Search button")
    public void i_click_on_the_Search_button() {

    }

    @Then("all the property within the selected location and price range are displayed")
    public void all_the_property_within_the_selected_location_and_price_range_are_displayed() {

    }

    @Then("I click on the result link")
    public void i_click_on_the_result_link() {

    }

}
