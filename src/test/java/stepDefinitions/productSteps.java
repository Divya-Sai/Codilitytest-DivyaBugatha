package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;
import java.time.Duration;

public class productSteps {

    WebDriver driver;

    @Given("Login to test Script Demo Website {string}")
    public void login_to_test_script_demo_website(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @When("I add four different products to my wishlist")
    public void i_add_four_different_products_to_my_wishlist() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I view my wishlist table")
    public void i_view_my_wishlist_table() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I find total four selected items in my wishlist")
    public void i_find_total_four_selected_items_in_my_wishlist() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I search for lowest price product")
    public void i_search_for_lowest_price_product() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I able to add the lowest price item to my cart")
    public void i_able_to_add_the_lowest_price_item_to_my_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I able to verify the item in my cart")
    public void i_able_to_verify_the_item_in_my_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
