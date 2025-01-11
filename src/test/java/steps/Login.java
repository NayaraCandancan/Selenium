package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import runner.runner;

public class Login extends runner{
    HomePage homePage = new HomePage(driver);

    @Given("I access the Swag Lab website")
    public void AcessSite() {
        homePage.AcessTheApplication();
    }
    @When("I login with valid credentials")
    public void Login() {
        homePage.Login("standard_user", "secret_sauce");
        homePage.clickLogin();
    }

    @Then("I should be able to see the products list")
    public void ProductsList() {
        homePage.productsList();
    }
    @When("I click on the login button")
    public void clickLogin() {
        homePage.clickLogin();
    }
    @Then("It displays an error message")
    public void error_message() {
       homePage.messageError();
    }

    @When("I enter a blocked credential")
    public void enterBlockedCredential() {
        homePage.Login("locked_out_user","secret_sauce");
        homePage.clickLogin();
    }
}

