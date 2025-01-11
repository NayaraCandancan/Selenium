package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.Utils;

public class HomePage extends Utils {

    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void AcessTheApplication() {
        driver.get("https://www.saucedemo.com/");

        Assert.assertTrue(isLoginLogoDisplayed());
    }

    private boolean isLoginLogoDisplayed() {
        return driver.findElement(By.className("login_logo")).isDisplayed();
    }

    public void Login(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(By.id("login-button")).click();
    }
    public void productsList(){
        String text_products = driver.findElement(By.xpath("//span[contains(@class,\"title\")]")).getText();
        Assert.assertEquals("Products", text_products);

    }
    public void messageError(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, 1);
            WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3")));
            boolean isDisplayed = errorMessage.isDisplayed();
            Assert.assertTrue("Epic sadface", isDisplayed);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
