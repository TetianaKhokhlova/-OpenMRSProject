
import org.junit.Assert;
import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;
import java.util.List;



public class Us_408Test {
    Us_408Page page = new Us_408Page();


    @Test
    public void test408(){

        ReusableMethods.loginAccount();
        page.findPatientRecordButton.click();

        // names form the patient list
        System.out.println(page.patientRecordList.getText());

        // number of patients in the list
        List <WebElement> patientsInTheList = ReusableMethods.driver.findElements(By.xpath("//tbody/tr"));
        int actualPatientCount  = patientsInTheList.size();
        System.out.println("Number of Patients: " + actualPatientCount);
        ReusableMethods.waitInSeconds(1);

        // entries
        WebElement totalNumberOfPatient = ReusableMethods.driver.findElement(By.xpath("//div[@id='patient-search-results-table_info']"));
        String totalNumberOfPatientText = totalNumberOfPatient.getText();
        int totalNumberEntries = Integer.parseInt(totalNumberOfPatientText.split(" ")[3]);
        System.out.println("total number: "+totalNumberEntries);

        //verify number of patients in the record list is same as number (Z)
        Assert.assertEquals(totalNumberEntries,actualPatientCount);

        ReusableMethods.driver.quit();


    }
}
