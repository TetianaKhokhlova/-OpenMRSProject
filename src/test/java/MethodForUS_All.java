import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MethodForUS_All {

    public WebDriverWait wait = new WebDriverWait(DriverClass_US406_407.getDriver(), Duration.ofSeconds(3));

    public  void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickMethod(WebElement element) {
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }
    public void sendKeysMethod(WebElement element, String text) {
   waitUntilVisible(element);
   scrollToElement(element);
   element.sendKeys(text);
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) DriverClass_US406_407.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void navigateToPreviousPage(){
        DriverClass_US406_407.getDriver().navigate().back();
    }

    public  void myWait(int sec){
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }


}



