import org.testng.Assert;
import org.testng.annotations.Test;

public class US_406PatientSearchList_407DeletePatient {

    @Test
   public  void loginTC(){
        US_PageAll pages = new US_PageAll();
        DriverClass_US406_407.getDriver().get("https://demo.openmrs.org/openmrs/login.htm");
        pages.sendKeysMethod(pages.userName,"admin");
        pages.sendKeysMethod(pages.password,"Admin123");
        pages.clickMethod(pages.locationForSession);
        pages.clickMethod(pages.loginButton);
        pages.clickMethod(pages.patientSearch);
        pages.sendKeysMethod(pages.patientTextBox,"Emma Hostert");
        pages.myWait(1);
        Assert.assertTrue(pages.warningMessage.isDisplayed());
        DriverClass_US406_407.getDriver().navigate().refresh();
        pages.sendKeysMethod(pages.patientTextBox, "100 HTR");
        pages.myWait(2);
        Assert.assertTrue(pages.existingPatient.isDisplayed());
        pages.clickMethod(pages.existingPatient);
        pages.navigateToPreviousPage();

        // US_407_Patient Deletion

        pages.sendKeysMethod(pages.patientTextBox, "100P22");
        Assert.assertTrue(pages.existingPatient.isDisplayed());
        pages.clickMethod(pages.existingPatient);
        pages.clickMethod(pages.deletingPatient);
        pages.sendKeysMethod(pages.reasonForDeleting, "Death");
       // pages.clickMethod(pages.confirmationButtonForDeleting);




        }
    }


