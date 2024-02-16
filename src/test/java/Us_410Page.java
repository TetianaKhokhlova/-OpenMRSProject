
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Us_410Page{
    public Us_410Page(){
        PageFactory.initElements(DriverClass.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userNameInput;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passWordInput;
    @FindBy(xpath = "//li[@id='Pharmacy']")
    public WebElement pharmacyLocation;
    @FindBy(xpath = "//input[@id='loginButton']")
    public WebElement logInButton;
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
