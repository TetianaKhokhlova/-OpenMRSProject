import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class US_405_My_Account {

    @Test
    public void myAccount() {
        US_PageAll pages = new US_PageAll();
        DriverClass_US406_407.getDriver().get("https://demo.openmrs.org/openmrs/login.htm");
        pages.sendKeysMethod(pages.userName, "admin");
        pages.sendKeysMethod(pages.password, "Admin123");

        List<WebElement> locationButtons = DriverClass_US406_407.getDriver().findElements(By.xpath("//ul[@id='sessionLocation']"));
        int randomIndex = new Random().nextInt(locationButtons.size());
        locationButtons.get(randomIndex).click();
        pages.clickMethod(pages.loginButton);

        Actions actions =new Actions(DriverClass_US406_407.getDriver());
        actions.moveToElement(pages.hoverOver).build().perform();
        pages.myWait(2);
        pages.subElementHoverOver.click();
        pages.clickMethod(pages.changePassword);
        Assert.assertTrue(pages.changePasswordForm.isDisplayed());
        pages.myWait(2);

        pages.clickMethod(pages.myAccount);

        pages.clickMethod(pages.myLanguage);

        Assert.assertTrue(pages.choosingLanguage.isDisplayed());
        pages.myWait(2);
        pages.clickMethod(pages.myAccount);

        DriverClass_US406_407.quitDriver();


    }
}