
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Us_410Page extends ReusableMethods{
    public Us_410Page(){
        PageFactory.initElements(ReusableMethods.driver,this);
    }

    @FindBy(xpath = "//a[@id='appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension']")
    public WebElement appointmentSchedulingButton;
    @FindBy(xpath = "//a[@id='appointmentschedulingui-manageAppointments-app']")
    public WebElement manageAppointmentsButton;
    @FindBy(xpath = "//input[@id='patient-search']")
    public WebElement searchById;
    @FindBy(xpath = "(//tr[@class='odd'])[1]")
    public WebElement nameOfPatient;
    @FindBy(xpath = "//p[contains(text(),'Your computer is not set to the right time zone. P')]")
    public WebElement errorMessage;

}
