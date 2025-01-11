package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.ShoppingPage;
import runner.runner;

public class Shopping extends runner {
    HomePage homePage = new HomePage(driver);
    ShoppingPage shoppingPage = new ShoppingPage(driver);

    @Given("I access the Swag Lab website and I make sucessful Login")
    public void AcessLogin() {
        homePage.AcessTheApplication();
        homePage.Login("standard_user", "secret_sauce");
        homePage.clickLogin();
    }

    @When("I add an item to the cart")
    public void AddItem(){
       shoppingPage.AddItem();
       shoppingPage.Cart();
       shoppingPage.Checkout();
    }
    @And("Enter my personal information to make the purchase")
    public void PersonalInformation(){
        shoppingPage.PersonalInformation("Teste", "de Morais", "12345678");
    }
    @And("I click on the finish button")
    public  void Finish() throws InterruptedException {
        shoppingPage.scrollDown();
        shoppingPage.FinishButton();
    }
    @Then("I make a purchase successfully")
    public void SucessFeedback(){
        shoppingPage.CheckoutSuccess();
    }

}
