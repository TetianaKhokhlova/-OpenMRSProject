import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_PageAll extends MethodForUS_All {
    public US_PageAll() {
        PageFactory.initElements(DriverClass_US406_407.getDriver(),this);}
    @FindBy(xpath ="//input[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//li[@id='Inpatient Ward']")
    public WebElement locationForSession;

    @FindBy(xpath = "//input[@id='loginButton']")
    public  WebElement loginButton;

    @FindBy(xpath = "//a[@id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']")
    public WebElement patientSearch;

    @FindBy(xpath = " //input[@id='patient-search']")
    public WebElement patientTextBox;

    @FindBy(xpath = "//td[@class='dataTables_empty']")
    public WebElement warningMessage;

    @FindBy(xpath = " //td[1]")
    public WebElement existingPatient;

    @FindBy(xpath = "//div[contains(text(),'Delete Patient')]")
    public WebElement deletingPatient;

    @FindBy(xpath ="//input[@id='delete-reason']")
    public WebElement reasonForDeleting;

    @FindBy(xpath = "//div[@id='delete-patient-creation-dialog']//button[@class='confirm right'][normalize-space()='Confirm']")
    public  WebElement confirmationButtonForDeleting;

    @FindBy(xpath = "//a[@id='referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension']")
    public WebElement registerPatient;

    @FindBy(name = "givenName")
    public WebElement givenName;

    @FindBy(name = "familyName")
    public  WebElement familyName;

    @FindBy(xpath = "//button[@id='next-button']")
    public  WebElement nextButton;

    @FindBy(xpath = "//option[@value='F']")
    public  WebElement femaleGender;

    @FindBy(xpath = " //option[@value='M']")
    public WebElement maleGender;

    @FindBy(xpath = "//input[@id='birthdateDay-field']")
    public WebElement birthdayField;

    @FindBy(xpath = "//select[@id='birthdateMonth-field']")
    public WebElement birthdayMonthField;

    @FindBy(name ="birthdateYear")
    public WebElement birthdayYearField;

    @FindBy(xpath = "(//input[@id='address1'])[1]")
    public WebElement address;

    @FindBy(xpath ="//input[@id='cityVillage']" )
    public WebElement cityVillage;

    @FindBy(xpath ="//input[@id='stateProvince']" )
    public WebElement stateProvince;

    @FindBy(xpath ="//input[@id='country']" )
    public WebElement country;

    @FindBy(xpath ="//input[@id='postalCode']" )
    public WebElement postalCode;

    @FindBy(name ="phoneNumber" )
    public WebElement phoneNumber;

    @FindBy(xpath = " //select[@id='relationship_type']")
    public  WebElement relationshipType;

    @FindBy(xpath = "//input[@placeholder='Person Name'] ")
    public  WebElement personName;

    @FindBy(xpath = "//form[@id='registration']")
    public WebElement medicalCard;

    @FindBy(xpath = "//input[@id='submit']")
    public  WebElement confirmButton;

    @FindBy(xpath = "//div[@class='row align-items-center'] ")
     public WebElement patientInformation;

    @FindBy(xpath = "//li[@class='nav-item identifier']")
    public WebElement hoverOver;

    @FindBy(xpath = "//a[normalize-space()='My Account'] ")
    public WebElement subElementHoverOver;

    @FindBy(xpath = "//a[@href='/openmrs/adminui/myaccount/changePassword.page']")
    public WebElement changePassword;

    @FindBy(xpath = "//form[@name='changePasswordForm']")
    public WebElement changePasswordForm;

    @FindBy(xpath = "//a[@href='/openmrs/adminui/myaccount/changeDefaults.page']")
    public WebElement myLanguage;

    @FindBy(xpath = " //div[@class='ng-scope']//div[1]")
    public  WebElement choosingLanguage;

    @FindBy(xpath = "//ul[@id='breadcrumbs']//a[normalize-space()='My Account'] ")
    public WebElement myAccount;













}
