import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class US_402_LoginTest {
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
                {null, null, false},
                {"invalidUser", "invalidPass", false},
                {"Admin", "Admin123", true}
        };
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password, boolean expectedResult) {

        if (username != null) {
            driver.findElement(By.id("username")).sendKeys(username);
        }
        if (password != null) {
            driver.findElement(By.id("password")).sendKeys(password);
        }
        driver.findElement(By.xpath("//li[contains(text(), 'Inpatient Ward')]")).click();


        driver.findElement(By.id("loginButton")).click();


        boolean loginSuccess = driver.findElements(By.xpath("//*[contains(text(), 'Logged in as')]")).size() > 0;
        Assert.assertEquals(loginSuccess, expectedResult, "Expected login success to be " + expectedResult + " but was " + loginSuccess);
    }

    @AfterMethod
    public void tearDown() {
if (driver != null) {
            driver.quit();
        }
    }
}

