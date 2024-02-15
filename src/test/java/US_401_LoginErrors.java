

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;


public class US_401_LoginErrors {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }


    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
                {null, null, "You must choose a location!", false},
                {"invalidUser", "invalidPass", "Invalid username/password. Please try again.", false},
                {"admin", "Admin123", "Inpatient Ward", true}

        };

    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password, String expectedMessage, boolean isSuccess) {

        driver.findElement(By.id("username")).sendKeys(username == null ? "" : username);
        driver.findElement(By.id("password")).sendKeys(password == null ? "" : password);
        driver.findElement(By.id("loginButton")).click();

        if (!isSuccess) {
            boolean messageDisplayed = driver.findElement(By.xpath("//span[@id='sessionLocationError']" + expectedMessage + "')]")).isDisplayed();
            Assert.assertTrue(messageDisplayed, "Expected warning message not displayed.");
        } else {
            System.out.println("Failed login test completed");

        }
    }

    @AfterMethod
    public void tearDown() {
       if (driver != null) {
            driver.quit();
        }
    }
}



