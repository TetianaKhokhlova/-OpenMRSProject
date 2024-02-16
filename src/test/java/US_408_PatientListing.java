import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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

    int patientCount  = patientsList.size()-1;
    System.out.println("Number of Patients: " + patientCount);

    // entries
    WebElement totalNumberOfPatient = DriverClass_US406_407.getDriver().findElement(By.xpath("//div[@id='patient-search-results-table_info']"));
    String totalNumberOfPatientText = totalNumberOfPatient.getText();
    int totalNumberEntries = Integer.parseInt(totalNumberOfPatientText.split(" ")[3]);
    System.out.println("total number: "+totalNumberEntries);

    //verify number of patients in the record list is same as number (Z)
    Assert.assertEquals(totalNumberEntries,patientCount);

   DriverClass_US406_407.quitDriver();


    }
}

