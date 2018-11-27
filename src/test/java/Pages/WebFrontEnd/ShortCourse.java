package Pages.WebFrontEnd;

import BaseFramework.Hooks.DataConnector;
import BaseFramework.Plumbing.Driver_Init;
import BaseFramework.Utils.Constants;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

import static BaseFramework.Plumbing.Driver_Init.driver;
import static org.junit.Assert.assertEquals;

public class ShortCourse extends Driver_Init {
    File httpsPath = new File(System.getProperty("user.dir"));
    DataConnector dataConnector;
    LoginLogout loginLogout;

    public ShortCourse(WebDriver driver) {
        PageFactory.initElements(driver, this);
        dataConnector = new DataConnector();
        loginLogout = new LoginLogout(driver);
        dataConnector.setDataFile(Constants.EXCEL_FILE_PATH, Constants.EXCEL_CREATE_DATA_SHEET_NAME);

    }

    //*********************************************************************************************************************************************
    //**************************************************CREATE ACCOUNT*****************************************************************************
    //*********************************************************************************************************************************************

    public void selectValueFromDropDowns(WebElement element, String value) {
        Select selectValue = new Select(element);
        selectValue.selectByVisibleText(value);
    }

    @FindBy(xpath = ".//a[@aria-label='Create Account']")
    public static WebElement createAccount;

    @FindBy(xpath = ".//*[contains(@name,'privacypolicy')]")
    public static WebElement selectPrivacyPolicy;

    @FindBy(xpath = ".//*[contains(@id, 'prospectprefixid')]")
    public static WebElement title;

    @FindBy(xpath = ".//*[contains(@id, 'firstname')]")
    public static WebElement fName;

    @FindBy(xpath = ".//*[contains(@id, 'lastname')]")
    public static WebElement lName;

    @FindBy(xpath = ".//*[contains(@id, 'birthdate')]")
    public static WebElement dateOfBirth;

    @FindBy(xpath = ".//*[contains(@id, 'gender')]")
    public static WebElement genderDropDown;

    @FindBy(xpath = ".//*[@id='emailaddress1']")
    public static WebElement emailAddress;

    @FindBy(xpath = ".//*[contains(@id,'emailaddress1_confirm')]")
    public static WebElement confirmEmailAddress;

    @FindBy(xpath = ".//*[contains(@id,'coursetype')]")
    public static WebElement selectCourseType;

    @FindBy(xpath = ".//*[contains(@id,'academicprogramofinterest')]")
    public static WebElement academicProgrammeField;

    @FindBy(xpath = ".//*[contains(@id,'entryterm')]")
    public static WebElement entryTermField;

    @FindBy(xpath = ".//input[@id='membership_password']")
    public static WebElement password;

    @FindBy(xpath = ".//input[@id='membership_confirmpassword']")
    public static WebElement confirmPassword;

    @FindBy(xpath = ".//input[@id='membership_passwordquestion']")
    public static WebElement passwordQuestion;

    @FindBy(xpath = ".//input[@id='membership_passwordanswer']")
    public static WebElement passwordAnswer;

    @FindBy(xpath = ".//input[@id='submitCreateAccount']")
    public static WebElement createAccountButton;

    //====================================CREATE NEW ACCOUNT METHODS===============================================
    public void loginByPass() throws Exception {
        driver.findElement(By.xpath(".//a[@aria-label='Log In']")).click();
        driver.findElement(By.xpath(".//input[@id='Username']")).sendKeys(dataConnector.getData(5, 1));
        driver.findElement(By.xpath(".//input[@id='Password']")).sendKeys(dataConnector.getData(9, 1));
        driver.findElement(By.xpath(".//input[@id='submitLogin']")).click();
        driver.findElement(By.xpath("(.//a[@class='elcn-application-link'])[1]")).click();
//        submission_Tab.click();

    }

    public void clickOnCreateAccountLink() {
        createAccount.click();
    }

    public void select_YES_AS_PrivacyPolicy() {
        String privacyPolicyValue = "Yes";
        selectValueFromDropDowns(selectPrivacyPolicy, privacyPolicyValue);
    }

    public void completeCreateAccount_RequiredFields() throws Exception {
        select_YES_AS_PrivacyPolicy();
        String titleValue = dataConnector.getData(0, 1);
        String firstN = dataConnector.getData(1, 1);
        String lastN = dataConnector.getData(2, 1);
        String dateOfBirthValue = dataConnector.getData(3, 1);
        String gender = dataConnector.getData(4, 1);
        String email = dataConnector.getData(5, 1);
        String courseType = dataConnector.getData(6, 1);
        String academicProgramme = dataConnector.getData(7, 1);
        String entryTerm = dataConnector.getData(8, 1);
        String pass = dataConnector.getData(9, 1);
        String passQ = dataConnector.getData(10, 1);
        String passA = dataConnector.getData(11, 1);

        selectValueFromDropDowns(title, titleValue);
        fName.sendKeys(firstN);
        lName.sendKeys(lastN);
        dateOfBirth.sendKeys(dateOfBirthValue, Keys.RETURN);
        selectValueFromDropDowns(genderDropDown, gender);
        emailAddress.sendKeys(email);
        confirmEmailAddress.sendKeys(email);
        selectCourseType.sendKeys(courseType);
        academicProgrammeField.sendKeys(academicProgramme);
        entryTermField.sendKeys(entryTerm);
        password.sendKeys(pass);
        confirmPassword.sendKeys(pass);
        passwordQuestion.sendKeys(passQ);
        passwordAnswer.sendKeys(passA);
    }

    public void clickOnCreateAccountButton() {
        createAccountButton.click();
    }

    //====================================END OF CREATE NEW ACCOUNT METHODS========================================

    //*************************************************************************************************************
    //**********************END OF CREATE NEW ACCOUNT LOCATORS AND METHODS*****************************************
    //*************************************************************************************************************

    //*************************************************************************************************************
    //*****************************CONTINUE APPLICATION AFTER CREATING*********************************************
    //*************************************************************************************************************
    // After Creating account, student clicks on the following
    @FindBy(xpath = ".//*[contains(@value,'Create a New Application')]")
    public static WebElement createANewApplicationButton;

    // Method to click on create new application
    public void clickOnCreateANewApplicationButton() throws Exception {
        createANewApplicationButton.click();
        Thread.sleep(3000);
    }

    // Student clicks on Postgraduate Taught - the second option
    @FindBy(xpath = ".//*[contains(text(),'Short Courses and Visiting Student (Non Degree)') and @class='startApp']")
    public static WebElement shortCourseAndVisitingStudentNonDegree_Button;


    public void clickOnShortCourseAndVisitingStudentNonDegreeButton() throws Exception {
        shortCourseAndVisitingStudentNonDegree_Button.click();
    }

    // Student Continues with the original application
    @FindBy(xpath = ".//input[@value='Continue this application']")
    public static WebElement continueThisApplicationButton;

    public void clickOnContinueThisApplication() {
        continueThisApplicationButton.click();
    }
    //*************************************************************************************************************
    //*****************************END OF CONTINUE APPLICATION AFTER CREATING***************************************
    //*************************************************************************************************************


    //===============================START=====PROPOSED STUDIES AND PERSONAL INFORMATION TAB=============================
    @FindBy(xpath = ".//select[@id='iczz_applicationcatagory']")
    public static WebElement applicationCategoryDropDown;

    @FindBy(xpath = ".//select[contains(@id,'datatel_anticipatedentrytermid')]")
    public static WebElement anticipatedEntryTerm_DropDown;

    @FindBy(xpath = ".//select[contains(@id,'datatel_academicprogramid')]")
    public static WebElement academicProgramme_DropDown;


    @FindBy(xpath = ".//select[@id='iczz_modeofstudy']")
    public static WebElement modeOfStudyDropDown;

    @FindBy(xpath = ".//select[@id='iczz_visitingtype']")
    public static WebElement pleaseSelectTheFrameworkUnderWhichYouAreApplying_DropDown;

    @FindBy(xpath = ".//select[@id='iczz_vststudyplans']")
    public static WebElement pleaseIndicateYourIntendedStudyPlansForThisPeriodOfShortTermStudy_DropDown;

    @FindBy(xpath = ".//input[@id='iczz_vststartdate']")
    public static WebElement proposedStartDate_DatePicker;

    @FindBy(xpath = ".//input[@id='iczz_vstenddate']")
    public static WebElement proposedEndDate_DatePicker;


    //end of date picker elements
    @FindBy(xpath = ".//input[@id='datatel_nickname']")
    public static WebElement preferredFirstName;

    @FindBy(xpath = ".//input[@id='datatel_address1_cellphone']")
    public static WebElement mobilePhone;

    @FindBy(xpath = ".//input[@id='datatel_address1_line1']")
    public static WebElement permanentAddress_Line1_InputBox;

    @FindBy(xpath = ".//input[@id='datatel_address1_city']")
    public static WebElement permanentAddress_City_InputBox;

    @FindBy(xpath = ".//input[@id='datatel_address1_county']")
    public static WebElement permanentAddress_County_InputBox;

    @FindBy(xpath = ".//input[@id='datatel_address1_postalcode']")
    public static WebElement permanentAddress_ZIP_PostalCode_InputBox;

    @FindBy(xpath = ".//select[@id='datatel_address1_countryid']")
    public static WebElement permanentAddress_Country_DropDown;

    @FindBy(xpath = ".//select[@id='datatel_othercitizenship1']")
    public static WebElement primary_Nationality;

    @FindBy(xpath = ".//select[@id='datatel_birth_countryid']")
    public static WebElement countryOfBirth;


    @FindBy(xpath = ".//select[@id='iczz_countryofresidency']")
    public static WebElement countryOfPermanentResidence_DropDown;

    @FindBy(xpath = ".//select[@id='iczz_doyouneedvisa']")
    public static WebElement doYouNeedVisaToStudyInTheUK_DropDown;

    @FindBy(xpath = ".//select[@id='iczz_haveyoustudiedinuk']")
    public static WebElement haveYouPreviouslyStudiedInTheUKOntyATierFourStudentVisa_DropDown;

    @FindBy(xpath = ".//input[@value='Save & Continue']")
    public static WebElement saveAndContinue_Button;


    public void completeProposedStudiesAndPersonalInformation() throws Exception {

        String applicationCategory_Value = dataConnector.getData(15, 1);

        String anticipatedEntryYear_Value = dataConnector.getData(16, 1);
        String academicProgramme_Value = dataConnector.getData(17, 1);


        String modeOfStudyValue = dataConnector.getData(18, 1);
        String pleaseSelectTheFrameworkUnderWhichYouAreApplying_Value = (dataConnector.getData(19, 1));
        String pleaseIndicateYourIntendedStudyPlansForThisPeriodOfShortTermStudy_Value = (dataConnector.getData(20, 1));
        String proposedStartDate_Value = (dataConnector.getData(21, 1));
        String proposedEndDate_Value = (dataConnector.getData(22, 1));

        String preferredFirstNameValue = dataConnector.getData(1, 1);
        String mobilePhoneValue = dataConnector.getData(23, 1);
        String permanentAddress_Line1_Value = (dataConnector.getData(24, 1));
        String permanentAddress_City_Value = (dataConnector.getData(25, 1));
        String permanentAddress_County_Value = (dataConnector.getData(26, 1));
        String permanentAddress_ZIP_PostalCode_Value = (dataConnector.getData(27, 1));
        String permanentAddress_Country_Value = (dataConnector.getData(28, 1));
        String primary_Nationality_Value = (dataConnector.getData(29, 1));
        String countryOfBirth_Value = (dataConnector.getData(30, 1));
        String countryOfPermanentResidence_Value = (dataConnector.getData(31, 1));
        String doYouNeedAStudyVisaToStudyIntheUK_Value = (dataConnector.getData(35, 1));
        String haveYouPreviouslyStudiedInTheUKOnATierFourStudentVidsa_Value = (dataConnector.getData(36, 1));

        //========================Programme Selection data====================
        selectValueFromDropDowns(applicationCategoryDropDown, applicationCategory_Value);
        System.out.println("************* : - " + applicationCategory_Value);
        selectValueFromDropDowns(anticipatedEntryTerm_DropDown,anticipatedEntryYear_Value);
        selectValueFromDropDowns(academicProgramme_DropDown,academicProgramme_Value);
        selectValueFromDropDowns(modeOfStudyDropDown, modeOfStudyValue);
        System.out.println("************* : - " + modeOfStudyValue);
        selectValueFromDropDowns(pleaseSelectTheFrameworkUnderWhichYouAreApplying_DropDown,pleaseSelectTheFrameworkUnderWhichYouAreApplying_Value);
        System.out.println("************* : - " + pleaseSelectTheFrameworkUnderWhichYouAreApplying_Value);
        selectValueFromDropDowns(pleaseIndicateYourIntendedStudyPlansForThisPeriodOfShortTermStudy_DropDown,pleaseIndicateYourIntendedStudyPlansForThisPeriodOfShortTermStudy_Value);
        System.out.println("************* : - " + pleaseIndicateYourIntendedStudyPlansForThisPeriodOfShortTermStudy_Value);
        proposedStartDate_DatePicker.sendKeys(proposedStartDate_Value);
        System.out.println("************* : - " + proposedStartDate_Value);
        proposedEndDate_DatePicker.sendKeys(proposedEndDate_Value);

        preferredFirstName.sendKeys(preferredFirstNameValue);
//        proposedStartDate_DatePicker.click();
//        selectValueFromDropDowns(datePickerMonth_DropDown, "Jan");
//        selectValueFromDropDowns(datePickerYear_DropDown, "2019");
//        datePickerDay_Select.click();

        //==========================Proposed Studies and Personal Information===About You***START========================================//
        mobilePhone.sendKeys(mobilePhoneValue);
        System.out.println("************* : - " + mobilePhoneValue);
        permanentAddress_Line1_InputBox.sendKeys(permanentAddress_Line1_Value);
        System.out.println("************* : - " + permanentAddress_Line1_Value);
        permanentAddress_City_InputBox.sendKeys(permanentAddress_City_Value);
        System.out.println("************* : - " + permanentAddress_City_Value);
        permanentAddress_County_InputBox.sendKeys(permanentAddress_County_Value);
        System.out.println("************* : - " + permanentAddress_County_Value);
        permanentAddress_ZIP_PostalCode_InputBox.sendKeys(permanentAddress_ZIP_PostalCode_Value);
        System.out.println("************* : - " + permanentAddress_ZIP_PostalCode_Value);
        selectValueFromDropDowns(permanentAddress_Country_DropDown, permanentAddress_Country_Value);
        System.out.println("************* : - " + permanentAddress_Country_Value);
        selectValueFromDropDowns(primary_Nationality, primary_Nationality_Value);
        System.out.println("************* : - " + primary_Nationality_Value);
        selectValueFromDropDowns(countryOfBirth, countryOfBirth_Value);
        System.out.println("************* : - " + countryOfBirth_Value);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", saveAndContinue_Button);

        selectValueFromDropDowns(countryOfPermanentResidence_DropDown, countryOfPermanentResidence_Value);
        System.out.println("************* : - " + countryOfPermanentResidence_Value);
        selectValueFromDropDowns(doYouNeedVisaToStudyInTheUK_DropDown, doYouNeedAStudyVisaToStudyIntheUK_Value);
        System.out.println("************* : - " + doYouNeedAStudyVisaToStudyIntheUK_Value);
        selectValueFromDropDowns(haveYouPreviouslyStudiedInTheUKOntyATierFourStudentVisa_DropDown, haveYouPreviouslyStudiedInTheUKOnATierFourStudentVidsa_Value);
        System.out.println("************* : - " + haveYouPreviouslyStudiedInTheUKOnATierFourStudentVidsa_Value);

        saveAndContinue_Button.click();
    }
    //========================END=====PROPOSED STUDIES AND PERSONAL INFORMATION TAB=============================


    //---------------Additional Information - START-----------------------------------------------------------------------
    public void additionalInformation(){
        saveAndContinue_Button.click();
    }
    //---------------Additional Information -END -------------------------------------------------------------------------



    //============================START===ENGLISH LANGUAGE=========TAB==========================================
    //************************Navigation to Tab English Language***********************************************
    @FindBy(xpath = ".//div[contains(text(),'English Language')]")
    public static WebElement englishLanguage_Tab;

    //Do you hold an English Language qualification?
    @FindBy(xpath = ".//select[contains(@id,'iczz_englishqualitystatus')]")
    public static WebElement doYouHoldAnEnglishLanguageQualification_DropDown;

    //English Qualification Type
    @FindBy(xpath = ".//select[contains(@id,'iczz_englishqualificationtype')]")
    public static WebElement englishQualificationType_DropDown;

    //    IELTS Exam Date Taken
    @FindBy(xpath = ".//div[label[contains(text(),'IELTS Exam Date Taken')]]/input")
    public static WebElement ieltsExamDateTaken_DatePicker;

    //    IELTS Test Report Form Number
    @FindBy(xpath = ".//div[label[contains(text(),'IELTS Test Report Form Number')]]/input")
    public static WebElement ieltsTestReportFormNumber_TextBox;

    @FindBy(xpath = ".//div[label[contains(text(),'IELTS Listening')]]/input")
    public static WebElement ieltsListening_Textbox;

    @FindBy(xpath = ".//div[label[contains(text(),'IELTS Reading')]]/input")
    public static WebElement ieltsReading_Textbox;

    @FindBy(xpath = ".//div[label[contains(text(),'IELTS Speaking')]]/input")
    public static WebElement ieltsSpeaking_Textbox;

    @FindBy(xpath = ".//div[label[contains(text(),'IELTS Writing')]]/input")
    public static WebElement ieltsWriting_Textbox;

    @FindBy(xpath = ".//div[label[contains(text(),'IELTS Overall Band Score')]]/input")
    public static WebElement ieltsOverallBandScore_Textbox;

    public void completeEnglishLanguageTabDetails() throws Exception {
        String doYouHoldAnEnglishLanguageQualification_Value = (dataConnector.getData(42, 1));
        String englishQualificationType_Value = (dataConnector.getData(43, 1));
        String ieltsExamDateTaken_Value = (dataConnector.getData(44, 1));
        String ieltsTestReportFormNumber_Value = (dataConnector.getData(45, 1));
        String ieltsListening_Value = (dataConnector.getData(46, 1));
        String ieltsReading_Value = (dataConnector.getData(46, 1));
        String ieltsSpeaking_Value = (dataConnector.getData(46, 1));
        String ieltsWriting_Value = (dataConnector.getData(46, 1));
        String ieltsOverallBandScore_Value = (dataConnector.getData(46, 1));

        selectValueFromDropDowns(doYouHoldAnEnglishLanguageQualification_DropDown, doYouHoldAnEnglishLanguageQualification_Value);
        System.out.println("****************** : - " + doYouHoldAnEnglishLanguageQualification_Value);
        selectValueFromDropDowns(englishQualificationType_DropDown, englishQualificationType_Value);
        System.out.println("****************** : - " + englishQualificationType_Value);

        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");


//        ieltsExamDateTaken_DatePicker.clear();
        ieltsExamDateTaken_DatePicker.sendKeys(ieltsExamDateTaken_Value, Keys.RETURN);
        System.out.println("****************** : - " + ieltsExamDateTaken_Value);
        ieltsTestReportFormNumber_TextBox.sendKeys(ieltsTestReportFormNumber_Value);
        System.out.println("****************** : - " + ieltsTestReportFormNumber_Value);
        ieltsListening_Textbox.sendKeys(ieltsListening_Value);
        ieltsReading_Textbox.sendKeys(ieltsReading_Value);
        ieltsSpeaking_Textbox.sendKeys(ieltsSpeaking_Value);
        ieltsWriting_Textbox.sendKeys(ieltsWriting_Value);
        ieltsOverallBandScore_Textbox.sendKeys(ieltsOverallBandScore_Value);
        saveAndContinue_Button.click();
    }

    //=============ENGLISH LANGUAGE===TAB========END=========================================


    //=================START======CONFIDENTIAL INFORMATION==============================================================
    // Navigation to Tab
    @FindBy(xpath = ".//input[contains(@value,'Confidential Information')]")
    public static WebElement confidentialInformation_Tab;

    @FindBy(xpath = ".//select[contains(@id,'iczz_ucasethnicity')]")
    public static WebElement ethnicity_DropDown;

    @FindBy(xpath = ".//select[contains(@id,'datatel_disabilitytypeid')]")
    public static WebElement doYouHaveADisablityYouWishToDeclare_DropDown;

    @FindBy(xpath = ".//label[@for='datatel_convicted_true']")
    public static WebElement doYouHaveCriminalConvictions_YES_RadioButton;


    public void confidentialInformationTabDetails() throws Exception {
        String ethnicity_Value = (dataConnector.getData(51, 1));
        String doYouHaveADisablityYouWishToDeclare_Value = (dataConnector.getData(52, 1));
        String doYouHaveAnyCriminalConvictions_Value = (dataConnector.getData(53, 1));

//        confidentialInformation_Tab.click();
        selectValueFromDropDowns(ethnicity_DropDown, ethnicity_Value);
        selectValueFromDropDowns(doYouHaveADisablityYouWishToDeclare_DropDown, doYouHaveADisablityYouWishToDeclare_Value);
        doYouHaveCriminalConvictions_YES_RadioButton.click();
        saveAndContinue_Button.click();
    }
    //==============END===========CONFIDENTIAL INFORMATION==============================================================


    //===============START=========SUBMISSION===========================================================================
    // Navigation to Tab
    @FindBy(xpath = ".//input[contains(@value,'Submission')]")
    public static WebElement submission_Tab;

    @FindBy(xpath = ".//label[contains(@for,'datatel_certify1_true')]")
    public static WebElement doYouDeclaretheAbove_YES_RadioButton;

    @FindBy(xpath = ".//input[contains(@id,'datatel_signature')]")
    public static WebElement signature_TextBox;

    @FindBy(xpath = ".//input[contains(@id,'submitApplication')]")
    public static WebElement submitApplication_Button;

    public void submissionTabDetails() throws Exception {
        //By Pass directly to Submission tab
//        submission_Tab.click();

        String signature_Value = (dataConnector.getData(1, 1));
//        submission_Tab.click();
        doYouDeclaretheAbove_YES_RadioButton.click();
        signature_TextBox.clear();
        signature_TextBox.sendKeys(signature_Value);
        submitApplication_Button.click();
    }
    //=============END======SUBMISSION==================================================================================



    //=============Upload Supporting Documents ***START***========================================//

    @FindBy(xpath = ".//li/a[contains(@href,'tab-supplemental')]")
    public static WebElement supportingDocumentsAndReferences_Link;

    @FindBy(xpath = ".//td/input[@data-rowname='English Language Certificate']")
    public static WebElement englishLanguageCertificate_ChooseFileButton;

    @FindBy(xpath = ".//td/input[@data-rowname='Non-confidential letter of support/reference']")
    public static WebElement noc_ChooseFileButton;

    @FindBy(xpath = ".//td/input[@data-rowname='Proposed Study Plan']")
    public static WebElement proposedStudyPlan_ChooseFileButton;

    @FindBy(xpath = ".//td/input[@data-rowname='Letter of Nomination']")
    public static WebElement letterOfNomination_ChooseFile_Button;


    @FindBy(xpath = ".//td/input[@data-rowname='Sponsorship Letter']")
    public static WebElement sponsorShipLetter_ChooseFileButton;

    @FindBy(xpath = ".//td/input[@class='btn btn-secondary upload-all']")
    public static WebElement uploadAll_Button;


    @FindBy(xpath = "(.//a[@class='elcn-application-link'])[1]")
    public static WebElement firstApplication_ViewLink;

    @FindBy (xpath = ".//a[contains(text(),'My Account')]")
    public static WebElement clickOnMyAccount_Text;


    @FindBy(xpath = ".//input[@id='Username']")
    public static WebElement userNameInputBox;

    @FindBy(xpath = ".//input[@id='Password']")
    public static WebElement passwordInputBox;

    @FindBy(xpath = ".//input[@id='submitLogin']")
    public static WebElement loginButton;



    public void logout()throws Exception {
        loginLogout.logoutAsStudent();
    }



    public void login() throws Exception {
        userNameInputBox.sendKeys(dataConnector.getData(5, 1));
        passwordInputBox.sendKeys(dataConnector.getData(9, 1));
        loginButton.click();
    }

    public void uploadSupportingDocuments() throws Exception {
        logout();
        login();

        clickOnMyAccount_Text.click();
        firstApplication_ViewLink.click();
        supportingDocumentsAndReferences_Link.click();
//        Thread.sleep(1000);
//        driver.navigate().refresh();
//        driver.navigate().refresh();
//        driver.navigate().refresh();
//        Thread.sleep(3000);
        driver.navigate().refresh();
//        englishLanguageCertificate_ChooseFileButton.sendKeys(httpsPath + "\\src\\test\\java\\BaseFramework\\Data\\Reference Documents\\English_Langauge.docx");
        noc_ChooseFileButton.sendKeys(httpsPath + "\\src\\test\\java\\BaseFramework\\Data\\Reference Documents\\Non-confidential letter of supportreference.docx");
        proposedStudyPlan_ChooseFileButton.sendKeys(httpsPath + "\\src\\test\\java\\BaseFramework\\Data\\Reference Documents\\Proposed Study Plan.docx");
        letterOfNomination_ChooseFile_Button.sendKeys(httpsPath + "\\src\\test\\java\\BaseFramework\\Data\\Reference Documents\\Letter of Nomination.docx");

        uploadAll_Button.click();
    }

    @FindBy(xpath = ".//span[@class='appStatusSubmitted']")
    public static WebElement verifyApplicationStatus_Text;

    public void verifyApplicationStatusOnMyAccountsPage(String status) {
        clickOnMyAccount_Text.click();
        String bodyText = verifyApplicationStatus_Text.getText();
        assertEquals(status,bodyText);
    }
    //=============Upload Supporting Documents ***END***========================================//

}
