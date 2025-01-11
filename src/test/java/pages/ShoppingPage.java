package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class ShoppingPage extends Utils {

    WebDriver driver;
    public ShoppingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void AddItem(){
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }
    public void Cart(){
        driver.findElement(By.id("shopping_cart_container")).click();
        String text_cart = driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > span")).getText();
        Assert.assertEquals("Your Cart", text_cart);
    }
    public void Checkout(){
        driver.findElement(By.name("checkout")).click();
    }
    public void PersonalInformation(String name, String lastname, String postalcode){
        driver.findElement(By.id("first-name")).sendKeys(name);
        driver.findElement(By.id("last-name")).sendKeys(lastname);
        driver.findElement(By.id("postal-code")).sendKeys(postalcode);
        driver.findElement(By.id("continue")).click();
        String text_checkout = driver.findElement(By.className("title")).getText();
        Assert.assertEquals("Checkout: Overview", text_checkout);
    }
    public void scrollDown() throws InterruptedException{
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1000)");
        waitElement(By.id("finish"), 10);
    }
    public void FinishButton(){
        driver.findElement(By.id("finish")).click();
    }
    public void CheckoutSuccess(){
        String text_checkout = driver.findElement(By.className("complete-header")).getText();
        Assert.assertEquals("Thank you for your order!", text_checkout);
        String text_checkout2 = driver.findElement(By.className("complete-text")).getText();
        Assert.assertEquals("Your order has been dispatched, and will arrive just as fast as the pony can get there!", text_checkout2);
    }
}
