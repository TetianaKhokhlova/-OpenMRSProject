
import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.interactions.Actions;


public  class Us_410Test {
    Us_410Page page = new Us_410Page();

    @Test
    public void test410(){
        ReusableMethods.loginAccount();

        Actions actions = new Actions(ReusableMethods.driver);

        page.appointmentSchedulingButton.click();
        ReusableMethods.waitInSeconds(1);
        page.manageAppointmentsButton.click();
        page.searchById.sendKeys("100a");
        ReusableMethods.waitInSeconds(3);
        page.nameOfPatient.click();

        Assert.assertTrue(page.errorMessage.isDisplayed());

        ReusableMethods.waitInSeconds(2);
        ReusableMethods.driver.quit();

    }





}
