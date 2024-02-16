import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class US_408_PatientListing {


@Test
    public void patientList(){
    US_PageAll pages = new US_PageAll();
    DriverClass_US406_407.getDriver().get("https://demo.openmrs.org/openmrs/login.htm");
    pages.sendKeysMethod(pages.userName,"admin");
    pages.sendKeysMethod(pages.password,"Admin123");
    pages.clickMethod(pages.locationForSession);
    pages.clickMethod(pages.loginButton);
    pages.clickMethod(pages.patientSearch);

    List <WebElement> patientsList = DriverClass_US406_407.getDriver().findElements(By.tagName("tr"));

    int patientCount  = patientsList.size();
    System.out.println("Number of Patients: " + patientCount);


    }
}

