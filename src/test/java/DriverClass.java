import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverClass {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver==null){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }



    public static void quitDriver(){
        if (driver!=null) {
            driver.quit();
            driver = null;
        }
    }
}
