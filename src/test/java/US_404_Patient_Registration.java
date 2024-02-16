import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class US_404_Patient_Registration {

    @Test
    public void registration(){
        US_PageAll pages = new US_PageAll();
        DriverClass_US406_407.getDriver().get("https://demo.openmrs.org/openmrs/login.htm");
        pages.sendKeysMethod(pages.userName,"admin");
        pages.sendKeysMethod(pages.password,"Admin123");

        List<WebElement> locationButtons = DriverClass_US406_407.getDriver().findElements(By.xpath("//ul[@id='sessionLocation']"));
        int randomIndex = new Random().nextInt(locationButtons.size());
        locationButtons.get(randomIndex).click();
        pages.clickMethod(pages.loginButton);
        pages.clickMethod(pages.registerPatient);

        pages.sendKeysMethod(pages.givenName,"Doroti");
        pages.sendKeysMethod(pages.familyName, "Stone");
        pages.clickMethod(pages.nextButton);
        pages.clickMethod(pages.femaleGender);
        pages.clickMethod(pages.nextButton);
        pages.sendKeysMethod(pages.birthdayField,"15");

        Select select = new Select(pages.birthdayMonthField);
        select.selectByVisibleText("November");
        pages.sendKeysMethod(pages.birthdayYearField, "1999");

        pages.clickMethod(pages.nextButton);

       pages.sendKeysMethod(pages.address,"Peach ave 225");
       pages.sendKeysMethod(pages.cityVillage,"Emerald city");
       pages.sendKeysMethod(pages.stateProvince,"Purple");
       pages.sendKeysMethod(pages.country,"OZ");
       pages.sendKeysMethod(pages.postalCode,"32568");

       pages.clickMethod(pages.nextButton);

       pages.sendKeysMethod(pages.phoneNumber,"+17562654525");
       pages.clickMethod(pages.nextButton);


       Select select1 = new Select(pages.relationshipType);
       select1.selectByVisibleText("Parent");
       pages.sendKeysMethod(pages.personName,"Anna");

       pages.clickMethod(pages.nextButton);

       Assert.assertTrue(pages.medicalCard.isDisplayed());

       pages.clickMethod(pages.confirmButton);

       Assert.assertTrue(pages.patientInformation.isDisplayed());












        



    }
}
