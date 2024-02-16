import org.testng.Assert;
import org.testng.annotations.Test;

public class US_410Test  {
    public void waitMethod(int sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
   // Us_410Page page = new Us_410Page();

    @Test
    public void test410(){
        US_410Page page = new US_410Page();
       DriverClass_US406_407.getDriver().get("https://demo.openmrs.org/openmrs/login.htm");
        page.userNameInput.sendKeys("Admin");
        page.passWordInput.sendKeys("Admin123");
        page.pharmacyLocation.click();
        page.logInButton.click();
        waitMethod(1);
        page.appointmentSchedulingButton.click();

        page.manageAppointmentsButton.click();
        page.searchById.sendKeys("100a");
        waitMethod(3);


        page.nameOfPatient.click();
        waitMethod(1);
        System.out.println(page.errorMessage.getText());
        Assert.assertTrue(page.errorMessage.isDisplayed());

      DriverClass_US406_407.quitDriver();

    }

}
