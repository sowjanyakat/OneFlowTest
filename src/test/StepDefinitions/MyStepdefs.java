package StepDefinitions;

import PageObjects.SearchPage;
import Selectors.WebElements;
import Support.Driver;
import Support.Waits;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class MyStepdefs extends Driver {
    @Given("^User enters URL$")
    public void UserentersURL()
    {
        //Driver.initialiseDriver();
        Waits.implicitWait();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

    }

    @When("^User is search for the product$")
    public void userIsSearchForTheProduct() throws InterruptedException {
             SearchPage.searchProduct();

    }

    @Then("^The Products should be displayed or display Message$")
    public void theProductsShouldBeDisplayedOrDisplayMessage() throws InterruptedException {

        SearchPage.displayMessage();
    }

    @Given("^User on the products page$")
    public void userOnTheProductsPage()  {
       SearchPage.getCurrentUrl();
    }

    @When("^User add product or multiple products to the cart$")
    public void userAddProductToTheCart()  {
              SearchPage.addproductToCart();
    }
    @Then("^Display message$")
    public void displayMessage() {
        SearchPage.displayMessagewhenadditemtocart();

    }


    @When("^User remove item from the cart$")
    public void userRemoveItemFromTheCart()  {
        SearchPage.removeItem();
    }

    @Then("^Item removed from the cart and display message$")
    public void itemRemovedFromTheCartAndDisplayMessage(){
        SearchPage.removeitemDisplayMessage();
    }

    @When("^user update quantity of product$")
    public void userUpdateQuantityOfProduct() throws InterruptedException {
        SearchPage.updateItem();

    }

    @Then("^Price get updated and display message$")
    public void priceGetUpdatedAndDisplayMessage() {
        SearchPage.checkPrice();

    }


}
