
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



public class Us_408Page {
    public Us_408Page(){
        PageFactory.initElements(ReusableMethods.driver, this);
    }

    @FindBy(xpath = "//a[@id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']")
    public WebElement findPatientRecordButton;

    @FindBy(xpath ="// tbody" )
    public WebElement patientRecordList;

}
