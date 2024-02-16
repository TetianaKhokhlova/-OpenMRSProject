import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ReusableMethods {
    public static void waitInSeconds(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }

    public static void loginAccount() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
        userName.sendKeys("Admin");
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        passwordField.sendKeys("Admin123");
        WebElement locationForSession = driver.findElement(By.xpath("//li[@id='Inpatient Ward']"));
        locationForSession.click();
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='loginButton']"));
        loginButton.click();
    }
}
