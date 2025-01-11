package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.runner;

public class Utils extends runner{

    public void waitElement(By element, int tempo){
        WebDriverWait wait = new WebDriverWait(driver,tempo);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
    }

}
