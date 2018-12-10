package Pages.WebFrontEnd;

import BaseFramework.Hooks.DataConnector;
import BaseFramework.Utils.Constants;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

import static BaseFramework.Plumbing.Driver_Init.driver;
import static org.junit.Assert.assertEquals;

public class PGT_Management_MBA {
    DataConnector dataConnector;
    LoginLogout loginLogout;
    File httpsPath = new File(System.getProperty("user.dir"));

    public PGT_Management_MBA(WebDriver driver) {
        PageFactory.initElements(driver, this);
        dataConnector = new DataConnector();
        loginLogout = new LoginLogout(driver);
        dataConnector.setDataFile(Constants.EXCEL_FILE_PATH, Constants.EXCEL_CREATE_AND_APPLY_PGT_MANAGEMENT_MBA_PROGRAMME_SHEET_NAME);
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
    public void clickOnCreateAccountLink() {
        createAccount.click();
    }

    public void loginByPass() throws Exception {
        driver.findElement(By.xpath(".//a[@aria-label='Log In']")).click();
        driver.findElement(By.xpath(".//input[@id='Username']")).sendKeys(dataConnector.getData(5, 1));
        driver.findElement(By.xpath(".//input[@id='Password']")).sendKeys(dataConnector.getData(9, 1));
        driver.findElement(By.xpath(".//input[@id='submitLogin']")).click();
        driver.findElement(By.xpath("(.//a[@class='elcn-application-link'])[1]")).click();
//        submission_Tab.click();

    }

    public void select_YES_AS_PrivacyPolicy() {
        String privacyPolicyValue = "Yes";
        selectValueFromDropDowns(selectPrivacyPolicy, privacyPolicyValue);
    }

    public void completeAllRequiredFields() throws Exception {
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
    @FindBy(xpath = ".//*[contains(text(),'Postgraduate Taught') and @class='startApp']")
    public static WebElement postgraduateTaughtButton;


    public void clickOnPostgraduateResearchButton() throws Exception {
        postgraduateTaughtButton.click();
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

    // propsed date picker elements
    @FindBy(xpath = ".//input[@name='iczz_proposedstartdate']")
    public static WebElement proposedStartDate_DatePicker;

    @FindBy(xpath = ".//select[@class='ui-datepicker-month']")
    public static WebElement datePickerMonth_DropDown;

    @FindBy(xpath = ".//select[@class='ui-datepicker-year']")
    public static WebElement datePickerYear_DropDown;

    @FindBy(xpath = ".//td/a[contains(text(),'10')]")
    public static WebElement datePickerDay_Select;


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
        String modeOfStudyValue = dataConnector.getData(18, 1);
        String preferredFirstNameValue = dataConnector.getData(1, 1);
        String mobilePhoneValue = dataConnector.getData(19, 1);
        String permanentAddress_Line1_Value = (dataConnector.getData(20, 1));
        String permanentAddress_City_Value = (dataConnector.getData(21, 1));
        String permanentAddress_County_Value = (dataConnector.getData(22, 1));
        String permanentAddress_ZIP_PostalCode_Value = (dataConnector.getData(23, 1));
        String permanentAddress_Country_Value = (dataConnector.getData(24, 1));
        String primary_Nationality_Value = (dataConnector.getData(25, 1));
        String countryOfBirth_Value = (dataConnector.getData(26, 1));
        String countryOfPermanentResidence_Value = (dataConnector.getData(27, 1));
        String doYouNeedAStudyVisaToStudyIntheUK_Value = (dataConnector.getData(31, 1));
        String haveYouPreviouslyStudiedInTheUKOnATierFourStudentVidsa_Value = (dataConnector.getData(32, 1));

        //========================Programme Selection data====================
        selectValueFromDropDowns(applicationCategoryDropDown, applicationCategory_Value);
        System.out.println("************* : - " + applicationCategory_Value);
        selectValueFromDropDowns(modeOfStudyDropDown, modeOfStudyValue);
        System.out.println("************* : - " + modeOfStudyValue);
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

    //================START=======ACADEMIC EXPERIENCE TAB===============================================================

    @FindBy(xpath = ".//input[contains(@value,'Academic Experience')]")
    public static WebElement academicExperience_Tab;

    @FindBy(xpath = ".//input[contains(@id,'iczz_cannotfindinstitution')]")
    public static WebElement iCannotFindMyInstitution_CheckBox;

    @FindBy(xpath = ".//textarea[contains(@id,'datatel_unlistedschoolinfo')]")
    public static WebElement unlistedInstitutionNameAndAddress_TextArea;

    @FindBy(xpath = ".//select[contains(@id,'degreetype')]")
    public static WebElement degreeType_DropDown;

    @FindBy(xpath = ".//input[contains(@id,'degreeearnedorexpected')]")
    public static WebElement subjectProgrammeTitle_InputBox;

    @FindBy(xpath = ".//select[contains(@id,'attendedfrommonth')]")
    public static WebElement degreeTypeStartMonth_DropDown;

    @FindBy(xpath = ".//input[contains(@id,'attendedfromyeartext')]")
    public static WebElement degreeTypeStartYear_InputBox;

    @FindBy(xpath = ".//select[contains(@id,'attendedtomonth')]")
    public static WebElement degreeTypeEndMonth_DropDown;

    @FindBy(xpath = ".//input[contains(@id,'attendedtoyeartext')]")
    public static WebElement degreeTypeEndYear_InputBox;

    @FindBy(xpath = ".//select[contains(@id,'iczz_statusofdegreeresult')]")
    public static WebElement statusOfTheDegree_DropDown;

    @FindBy(xpath = ".//input[contains(@id,'elcn_previousdegreeclass')]")
    public static WebElement finalGradeClass_InputBox;

    @FindBy(xpath = ".//input[contains(@id,'datatel_degreedate')]")
    public static WebElement awardedDate_DatePicker;

    public void completeAcademicExperienceTabDetails() throws Exception {
        String unlistedInstitutionNameAndAddress_Value = (dataConnector.getData(41, 1));
        String degreeType_Value = (dataConnector.getData(42, 1));
        String subjectProgrammeTitle_Value = (dataConnector.getData(43, 1));
        String degreeTypeStartMonth_Value = (dataConnector.getData(44, 1));
        String degreeTypeStartYear_Value = (dataConnector.getData(45, 1));
        String degreeTypeEndMonth_Value = (dataConnector.getData(46, 1));
        String degreeTypeEndYear_Value = (dataConnector.getData(47, 1));
        String statusOfTheDegree_value = (dataConnector.getData(48, 1));
        String finalGradeClass_Value = (dataConnector.getData(49, 1));
        String awardedDate_Value = (dataConnector.getData(50, 1));


//        academicExperience_Tab.click();
        iCannotFindMyInstitution_CheckBox.click();
        unlistedInstitutionNameAndAddress_TextArea.sendKeys(unlistedInstitutionNameAndAddress_Value);
        System.out.println("&*********** - :     - " + unlistedInstitutionNameAndAddress_Value);
        System.out.println("&*********** - " + degreeType_Value);
        selectValueFromDropDowns(degreeType_DropDown, degreeType_Value);
        System.out.println("**********************" + degreeType_Value);
        subjectProgrammeTitle_InputBox.sendKeys(subjectProgrammeTitle_Value);
        System.out.println("**********************" + subjectProgrammeTitle_Value);
        selectValueFromDropDowns(degreeTypeStartMonth_DropDown, degreeTypeStartMonth_Value);
        System.out.println("**********************" + degreeTypeStartMonth_Value);
        degreeTypeStartYear_InputBox.sendKeys(degreeTypeStartYear_Value);
        System.out.println("**********************" + degreeTypeStartYear_Value);
        selectValueFromDropDowns(degreeTypeEndMonth_DropDown, degreeTypeEndMonth_Value);
        System.out.println("**********************" + degreeTypeEndMonth_Value);
        degreeTypeEndYear_InputBox.sendKeys(degreeTypeEndYear_Value);
        System.out.println("**********************" + degreeTypeEndYear_Value);
        selectValueFromDropDowns(statusOfTheDegree_DropDown, statusOfTheDegree_value);
        System.out.println("**********************" + statusOfTheDegree_value);
        finalGradeClass_InputBox.sendKeys(finalGradeClass_Value);
        System.out.println("**********************" + finalGradeClass_Value);
        awardedDate_DatePicker.sendKeys(awardedDate_Value);
        System.out.println("**********************" + awardedDate_Value);


        saveAndContinue_Button.click();
    }
    //=======================================END======ACADEMIC EXPERIENCE===TAB========================================


    //============================START===ADDITIONAL QUAILIFICATION====================================================
    //************************Navigation to Tab Additional Qualification***********************************************
    @FindBy(xpath = ".//input[contains(@value,'Additional Qualification')]")
    public static WebElement additionalQualifications_Tab;

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


    public void completeAdditionalQualificationTabDetails() throws Exception {
        String doYouHoldAnEnglishLanguageQualification_Value = (dataConnector.getData(57, 1));
        String englishQualificationType_Value = (dataConnector.getData(58, 1));
        String ieltsExamDateTaken_Value = (dataConnector.getData(59, 1));
        String ieltsTestReportFormNumber_Value = (dataConnector.getData(60, 1));
        String ieltsListening_Value = (dataConnector.getData(61, 1));
        String ieltsReading_Value = (dataConnector.getData(61, 1));
        String ieltsSpeaking_Value = (dataConnector.getData(61, 1));
        String ieltsWriting_Value = (dataConnector.getData(61, 1));
        String ieltsOverallBandScore_Value = (dataConnector.getData(61, 1));

//        additionalQualifications_Tab.click();
        selectValueFromDropDowns(doYouHoldAnEnglishLanguageQualification_DropDown, doYouHoldAnEnglishLanguageQualification_Value);
        System.out.println("****************** : - " + doYouHoldAnEnglishLanguageQualification_Value);
        selectValueFromDropDowns(englishQualificationType_DropDown, englishQualificationType_Value);
        System.out.println("****************** : - " + englishQualificationType_Value);

        JavascriptExecutor ps = (JavascriptExecutor) driver;
        ps.executeScript("arguments[0].scrollIntoView();", saveAndContinue_Button);


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


//        ps.executeScript("arguments[0].scrollIntoView();",saveAndContinue_Button);
//        ieltsOverallBandScore_Textbox.sendKeys(ieltsOverallBandScore_Value);


        saveAndContinue_Button.click();
    }
    //=============END==============ADDITIONAL QUALIFICATION=====TAB====================================================


    //================START=====ADDITIONAL INFORMATION==================================================================
    // Navigation to Tab
    @FindBy(xpath = ".//input[contains(@value,'Additional Information')]")
    public static WebElement additionalInformation_Tab;

    //---------------Total work experience to date - ELEMENTS - Start --------------------------------------------------
    @FindBy(xpath = ".//input[@id='iczz_icbsworkexperienceyears']")
    public static WebElement totalWorkExperienceToDate_Years_TextField;

    @FindBy(xpath = ".//input[@id='iczz_icbsworkexperiencemonths']")
    public static WebElement totalWorkExperienceToDate_Months_TextField;

    @FindBy(xpath = ".//input[@id='iczz_icbscurrentsalary']")
    public static WebElement totalWorkExperienceToDate_CurrentAnnualSalary_TextField;

    @FindBy(xpath = ".//select[@id='iczz_icbssalarycurrency']")
    public static WebElement totalWorkExperienceToDate_CurrencyOfCurrentAnnualSalary_Dropdown;

    @FindBy(xpath = ".//input[@id='iczz_icbsannualsalaryingbp']")
    public static WebElement totalWorkExperienceToDate_CurrentAnnualSalaryConvertedIntoGBP_TextField;

    @FindBy(xpath = ".//input[@id='iczz_icbsmanagementyears']")
    public static WebElement managementExperience_Years_TextField;

    @FindBy(xpath = ".//input[@id='iczz_icbsmanagementmonths']")
    public static WebElement managementExperience_Months_TextField;

    @FindBy(xpath = ".//select[@id='iczz_icbscurrentsector']")
    public static WebElement totalWorkExperienceToDate_CurrentIndustrySector_Dropdown;

    @FindBy(xpath = ".//select[@id='iczz_icbscurrentemployertype']")
    public static WebElement totalWorkExperienceToDate_CurrentEmployer_Dropdown;

    //---------------Total work experience to date - ELEMENTS - End ----------------------------------------------------

    //---------------Career Planning - ELEMENTS Start ------------------------------------------------------------------
    @FindBy(xpath = ".//select[@id='iczz_icbsmbagain']")
    public static WebElement whatIsTheMainAimForCompletingAnMBA_Dropdown;

    @FindBy(xpath = ".//select[@id='iczz_icbsemployertype']")
    public static WebElement whichTypeOfEmployerAreYouAimingToWorkFor_DropDown;

    @FindBy(xpath = ".//select[@id='iczz_icbssector1']")
    public static WebElement whichSector_Dropdown;

    @FindBy(xpath = ".//select[@id='iczz_icbsemployercountry1']")
    public static WebElement whichCountry_Dropdown;

    @FindBy(xpath = ".//textarea[@id='iczz_icbstargetorganisationrole']")
    public static WebElement listYourTargetOrganisationAndRole_TextArea;

    @FindBy(xpath = ".//textarea[@id='iczz_icbscriterion1']")
    public static WebElement criterion_1_TextArea;

    @FindBy(xpath = ".//textarea[@id='iczz_icbscriterion2']")
    public static WebElement criterion_2_TextArea;

    @FindBy(xpath = ".//textarea[@id='iczz_icbscriterion3']")
    public static WebElement criterion_3_TextArea;

    @FindBy(xpath = ".//textarea[@id='iczz_icbsskillsetgaps']")
    public static WebElement whatGapsInYourSkillsetWillYouNeedToDevelopToPrepareForThisCareer_TextArea;

    @FindBy(xpath = ".//select[@id='iczz_icbssector2']")
    public static WebElement secondChoiceSectorToWorkInAfterGraduate_Dropdown;

    @FindBy(xpath = ".//select[@id='iczz_icbsemployercountry2']")
    public static WebElement secondChoiceCountry_Dropdown;

    @FindBy(xpath = ".//textarea[@id='iczz_icbsorganisationrole2']")
    public static WebElement listYourSecondChoiceOrganisationAndRole_TextArea;

    //---------------Career Planning - ELEMENTS End --------------------------------------------------------------------

    //------------Additional Information - Financial Support Section - Elements- START----------------------------------
    @FindBy(xpath = ".//select[contains(@id,'iczz_scholarshiplist')]")
    public static WebElement howAreYouIntendingToFundYourStudies_DropDown;

    @FindBy(xpath = ".//select[@id='iczz_scholarship']")
    public static WebElement scholarship_DropDown;

    @FindBy(xpath = ".//input[@id='iczz_nameofscholarship']")
    public static WebElement nameOfScholarship_TextField;

    @FindBy(xpath = ".//input[@id='iczz_awardamount']")
    public static WebElement awardAmount_TextField;

    @FindBy(xpath = ".//select[@id='iczz_scholarshiptype']")
    public static WebElement feesMaintenanceOrBoth_DropDown;

    @FindBy(xpath = ".//select[@id='iczz_awardstatus']")
    public static WebElement awardStatus_DropDown;

    @FindBy(xpath = ".//select[@id='iczz_icstudysupport']")
    public static WebElement ifYouDoNotHaveScholarshipSupport_DropDown;

    //------------Additional Information - Total Work Experience, Career Planning and Financial Support Section - END----------------------------------------------
    public void completeAdditionalInformationTabDetails() throws Exception {

        //By pass to the tab directly.
//        additionalInformation_Tab.click();

        //---------------Additional Information  - Total work experience to date -Values -  Start ---------------------------------------------------------
        String totalWorkExperienceToDate_Years_Value = (dataConnector.getData(67, 1));
        String totalWorkExperienceToDate_Months_Value = (dataConnector.getData(68, 1));
        String totalWorkExperienceToDate_CurrentAnnualSalary_Value = (dataConnector.getData(69, 1));
        String totalWorkExperienceToDate_CurrencyOfCurrentAnnualSalary_Value = (dataConnector.getData(70, 1));
        String totalWorkExperienceToDate_CurrentAnnualSalaryConvertedIntoGBP_Value = (dataConnector.getData(71, 1));
        String managementExperience_Years_Value = (dataConnector.getData(73, 1));
        String managementExperience_Months_Value = (dataConnector.getData(74, 1));
        String totalWorkExperienceToDate_CurrentIndustrySector_Value = (dataConnector.getData(75, 1));
        String totalWorkExperienceToDate_CurrentEmployer_Value = (dataConnector.getData(76, 1));


        totalWorkExperienceToDate_Years_TextField.sendKeys(totalWorkExperienceToDate_Years_Value);
        totalWorkExperienceToDate_Months_TextField.sendKeys(totalWorkExperienceToDate_Months_Value);
        totalWorkExperienceToDate_CurrentAnnualSalary_TextField.sendKeys(totalWorkExperienceToDate_CurrentAnnualSalary_Value);

        selectValueFromDropDowns(totalWorkExperienceToDate_CurrencyOfCurrentAnnualSalary_Dropdown, totalWorkExperienceToDate_CurrencyOfCurrentAnnualSalary_Value);
        totalWorkExperienceToDate_CurrentAnnualSalaryConvertedIntoGBP_TextField.sendKeys(totalWorkExperienceToDate_CurrentAnnualSalaryConvertedIntoGBP_Value);
        managementExperience_Years_TextField.sendKeys(managementExperience_Years_Value);
        managementExperience_Months_TextField.sendKeys(managementExperience_Months_Value);
        selectValueFromDropDowns(totalWorkExperienceToDate_CurrentIndustrySector_Dropdown, totalWorkExperienceToDate_CurrentIndustrySector_Value);
        selectValueFromDropDowns(totalWorkExperienceToDate_CurrentEmployer_Dropdown, totalWorkExperienceToDate_CurrentEmployer_Value);

        //---------Additional Information  - Total work experience to date - Values End------------------------------------

        //---------------Additional Information - Career Planning - Start -----------------------------------------------------------------------
        String whatIsTheMainAimForCompletingAnMBA_Value = (dataConnector.getData(78, 1));
        String whichTypeOfEmployerAreYouAimingToWorkFor_Value = (dataConnector.getData(79, 1));
        String whichSector_Value = (dataConnector.getData(80, 1));
        String whichCountry_Value = (dataConnector.getData(81, 1));
        String listYourTargetOrganisationAndRole_Value = (dataConnector.getData(82, 1));
        String criterion_1_Value = (dataConnector.getData(83, 1));
        String criterion_2_Value = (dataConnector.getData(84, 1));
        String criterion_3_Value = (dataConnector.getData(85, 1));
        String whatGapsInYourSkillSetWillYouNeedToDevelopToPrepareForThisCareer_Value = (dataConnector.getData(86, 1));
        String secondChoiceSectorToWorkInAfterGraduate_Value = (dataConnector.getData(87, 1));
        String secondChoiceCountry_Value = (dataConnector.getData(88, 1));
        String listYourSecondChoiceOrganisationAndRole_Value = (dataConnector.getData(89, 1));

        selectValueFromDropDowns(whatIsTheMainAimForCompletingAnMBA_Dropdown, whatIsTheMainAimForCompletingAnMBA_Value);
        selectValueFromDropDowns(whichTypeOfEmployerAreYouAimingToWorkFor_DropDown, whichTypeOfEmployerAreYouAimingToWorkFor_Value);
        selectValueFromDropDowns(whichSector_Dropdown, whichSector_Value);
        selectValueFromDropDowns(whichCountry_Dropdown, whichCountry_Value);
        listYourTargetOrganisationAndRole_TextArea.sendKeys(listYourTargetOrganisationAndRole_Value);
        criterion_1_TextArea.sendKeys(criterion_1_Value);
        criterion_2_TextArea.sendKeys(criterion_2_Value);
        criterion_3_TextArea.sendKeys(criterion_3_Value);
        whatGapsInYourSkillsetWillYouNeedToDevelopToPrepareForThisCareer_TextArea.sendKeys(whatGapsInYourSkillSetWillYouNeedToDevelopToPrepareForThisCareer_Value);
        selectValueFromDropDowns(secondChoiceSectorToWorkInAfterGraduate_Dropdown, secondChoiceSectorToWorkInAfterGraduate_Value);
        selectValueFromDropDowns(secondChoiceCountry_Dropdown, secondChoiceCountry_Value);
        listYourSecondChoiceOrganisationAndRole_TextArea.sendKeys(listYourSecondChoiceOrganisationAndRole_Value);
        //---------------Additional Information - Career Planning - End -------------------------------------------------------------------------


        //------------Additional Information - Financial Support Section - Enter Values - Start----------------------------------------
        String howAreYouIntendingToFundYourStudies_Value = (dataConnector.getData(91, 1));
        String scholarship_Value = (dataConnector.getData(92, 1));
        String nameOfScholarship_Value = (dataConnector.getData(93, 1));
        String awardAmount_Value = (dataConnector.getData(94, 1));
        String feesMaintenanceOrBoth_Value = (dataConnector.getData(95, 1));
        String awardStatus_Value = (dataConnector.getData(96, 1));
        String ifYouDoNotHaveScholarship_Value = (dataConnector.getData(97, 1));

        //additionalInformation_Tab.click();
        selectValueFromDropDowns(howAreYouIntendingToFundYourStudies_DropDown, howAreYouIntendingToFundYourStudies_Value);
        selectValueFromDropDowns(scholarship_DropDown, scholarship_Value);
        nameOfScholarship_TextField.sendKeys(nameOfScholarship_Value);
        awardAmount_TextField.sendKeys(awardAmount_Value);
        selectValueFromDropDowns(feesMaintenanceOrBoth_DropDown, feesMaintenanceOrBoth_Value);
        selectValueFromDropDowns(awardStatus_DropDown, awardStatus_Value);
        selectValueFromDropDowns(ifYouDoNotHaveScholarshipSupport_DropDown, ifYouDoNotHaveScholarship_Value);
        //------------Additional Information - Financial Support Section - Start----------------------------------------

        saveAndContinue_Button.click();
    }
    //================END=====ADDITIONAL INFORMATION====================================================================

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
        String ethnicity_Value = (dataConnector.getData(101, 1));
        String doYouHaveADisablityYouWishToDeclare_Value = (dataConnector.getData(102, 1));
        String doYouHaveAnyCriminalConvictions_Value = (dataConnector.getData(103, 1));


//        confidentialInformation_Tab.click();
        selectValueFromDropDowns(ethnicity_DropDown, ethnicity_Value);
        selectValueFromDropDowns(doYouHaveADisablityYouWishToDeclare_DropDown, doYouHaveADisablityYouWishToDeclare_Value);
        doYouHaveCriminalConvictions_YES_RadioButton.click();

        //To Refactor to avoid confusion
//        if (doYouHaveAnyCriminalConvictions_Value.equals("Yes")) {
//            doYouHaveCriminalConvictions_YES_RadioButton.click();
//        } else {
//            System.out.println("Application has No Criminal Conviction.....");
//        }
        saveAndContinue_Button.click();
    }
    //==============END===========CONFIDENTIAL INFORMATION==============================================================

    //================START==========MARKETING INFORMATION==============================================================
    // Navigation to Tab
    @FindBy(xpath = ".//input[contains(@value,'Marketing Information')]")
    public static WebElement marketingInformation_Tab;

    @FindBy(xpath = ".//select[contains(@id,'datatel_decisionfactor1')]")
    public static WebElement howDidYouFindOutAboutImperialCollegeLondon_DropDown;

    public void marketingInformationTabDetails() throws Exception {
        String howDidYouFindOutAboutImperialCollegeLondon_Value = (dataConnector.getData(107, 1));

//        marketingInformation_Tab.click();
        selectValueFromDropDowns(howDidYouFindOutAboutImperialCollegeLondon_DropDown, howDidYouFindOutAboutImperialCollegeLondon_Value);
        saveAndContinue_Button.click();
    }
    //=============START===========MARKETING INFORMATION================================================================


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

    //===============START=========MBA Application Fee  Start ==========================================================
    @FindBy(xpath = ".//input[@id='DiscountCode']")
    public static WebElement enterPromoCode_TextField;

    @FindBy(xpath = ".//input[@type='submit']")
    public static WebElement promoCodeApply_Button;

    @FindBy(xpath = ".//input[@id='pay']")
    public static WebElement makeOnlinePayment_Button;

    @FindBy(xpath = ".//span[@id='test-mode-stamp']")
    public static WebElement verifyText_TestMode;

    @FindBy(xpath = ".//button[@id='form-submit']")
    public static WebElement continue_Button;

    @FindBy(xpath = ".//label[contains(@title,'Visa Debit')]")
    public static WebElement selectPaymentTypeCard_VisaDebit_RadioButton;

    @FindBy(xpath = ".//label[contains(@title,'MasterCard')]")
    public static WebElement selectPaymentTypeCard_MasterCard_RadioButton;


    @FindBy(xpath = ".//input[@id='oCard-sCardHolderName']")
    public static WebElement cardHolderName_TextField;

    @FindBy(xpath = ".//input[@id='oCard-sCardNumber']")
    public static WebElement cardNumber_TextField;

    @FindBy(xpath = ".//input[@id='oCard-sCVV']")
    public static WebElement cardCVV_TextField;

    @FindBy(xpath = ".//select[@id='oCard-sCardEndDateMonth']")
    public static WebElement cardExpiryDateMonth_DropDown;

    @FindBy(xpath = ".//select[@id='oCard-sCardEndDateYear']")
    public static WebElement cardExpiryDateYear_DropDown;

    // Use when Card holder is from the UK
    @FindBy(xpath = ".//select[@id='paf-country']")
    public static WebElement cardHolderCountry_DropDown;

    @FindBy(xpath = ".//input[@id='paf-postcode']")
    public static WebElement cardHolderPostCode_TextField;
    //------End-------------------------------------------

    //-- Billing Address Start -----
    @FindBy(xpath = ".//a[contains(text(),'Enter your address manually')]")
    public static WebElement enterYourAddressManually_Link;

    @FindBy(xpath = ".//select[@id='oCustomer-sCountryCode']")
    public static WebElement selectBillingCountry_Dropdown;
//
    @FindBy(xpath = ".//select[@id='paf-country']")
    public static WebElement selectBillingAddressCountry_DropDown;

    @FindBy(xpath = ".//button[@id='form-submit']")
    public static WebElement confirmPayment_Button;

    @FindBy(xpath = ".//input[@id='dcc-1']")
    public static WebElement payInMyHomeCurrency_RadioButton;

    @FindBy(xpath = ".//input[@id='dcc-0']")
    public static WebElement payInPoundSterling_RadioButton;


    @FindBy(xpath = ".//button[@id='form-get']")
    public static WebElement paymentSuccessfuPageContinue_Button;
    //---Billing Address End -----


    public void mabApplicationFees() throws Exception {

        String cardHolderName_Value = (dataConnector.getData(1, 1)) + " " + dataConnector.getData(2, 1);
        String promoCode_Value = (dataConnector.getData(117,1));
        String cardNumber_Value = (dataConnector.getData(113, 1));
        String cardNumberCVV_Value = (dataConnector.getData(114, 1));
        String cardExpiryDateMonth_Value = (dataConnector.getData(115, 1));
        String cardExpiryDateYear_Value = (dataConnector.getData(116, 1));
        String billingAddressCountry_Value = (dataConnector.getData(27, 1));

        enterPromoCode_TextField.sendKeys(promoCode_Value);
        promoCodeApply_Button.click();
        makeOnlinePayment_Button.click();



        //---------------When using Payment method as Card----------------------

//        String getText_TestModeFromTheSite = verifyText_TestMode.getText();
//        assertEquals(getText_TestModeFromTheSite, "Test Mode");
//        //Payment Summary Page
//        continue_Button.click();
//        // Payment Method(s) Available Page
//        continue_Button.click();
//
//        // Enter Payment Details
//        // 1. Enter Credit/Debit Card Details
//        selectPaymentTypeCard_MasterCard_RadioButton.click();
//        cardHolderName_TextField.sendKeys(cardHolderName_Value);
//        cardNumber_TextField.sendKeys(cardNumber_Value);
//        cardCVV_TextField.sendKeys(cardNumberCVV_Value);
//        selectValueFromDropDowns(cardExpiryDateMonth_DropDown, cardExpiryDateMonth_Value);
//        selectValueFromDropDowns(cardExpiryDateYear_DropDown, cardExpiryDateYear_Value);
//
//        //Scroll at the end of the Page
//        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
//        selectValueFromDropDowns(selectBillingAddressCountry_DropDown, billingAddressCountry_Value);
//        continue_Button.click();
//        confirmPayment_Button.click();
//        payInMyHomeCurrency_RadioButton.click();
//        continue_Button.click();
//        paymentSuccessfuPageContinue_Button.click();

      //--------------------Payment Type Card --- END----------------------------------------
    }
    //===============START=========MBA Application Fee End==============================================================

    @FindBy(xpath =".//a[contains(text(),'Click to check your application status')]" )
    public static WebElement applicationStatus_Link;

    //=============Return to Application Home Page
    public void clickToCheckYourApplicationStatus(){
        applicationStatus_Link.click();
    }

    //=============Upload Supporting Documents ***START***========================================//

    @FindBy(xpath = ".//li/a[contains(@href,'tab-supplemental')]")
    public static WebElement supportingDocumentsAndReferences_Link;

    @FindBy(xpath = ".//td/input[@data-rowname='Personal Statement']")
    public static WebElement personalStatement_ChooseFileButton;

    @FindBy(xpath = ".//td/input[@data-rowname='Transcript']")
    public static WebElement transcript_ChooseFile_Button;

    @FindBy(xpath = ".//td/input[@data-rowname='English Language Certificate']")
    public static WebElement englishLanguageCertificate_ChooseFileButton;

    @FindBy(xpath = ".//td/input[@data-rowname='CV']")
    public static WebElement cv_ChooseFileButton;


    @FindBy(xpath = ".//td/input[@data-rowname='Sponsorship Letter']")
    public static WebElement sponsorShipLetter_ChooseFileButton;

    @FindBy(xpath = ".//td/input[@class='btn btn-secondary upload-all']")
    public static WebElement uploadAll_Button;


    @FindBy(xpath = ".//a[@class='elcn-application-link' and contains(text(),'View')]")
    public static WebElement firstApplication_ViewLink;



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
        firstApplication_ViewLink.click();
        supportingDocumentsAndReferences_Link.click();
//        Thread.sleep(1000);
        driver.navigate().refresh();
        driver.navigate().refresh();
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.navigate().refresh();
        personalStatement_ChooseFileButton.sendKeys(httpsPath + "\\src\\test\\java\\BaseFramework\\Data\\Reference Documents\\Personal_Statement.docx");
        transcript_ChooseFile_Button.sendKeys(httpsPath + "\\src\\test\\java\\BaseFramework\\Data\\Reference Documents\\Transcript.docx");
        englishLanguageCertificate_ChooseFileButton.sendKeys(httpsPath + "\\src\\test\\java\\BaseFramework\\Data\\Reference Documents\\English_Langauge.docx");
        cv_ChooseFileButton.sendKeys(httpsPath + "\\src\\test\\java\\BaseFramework\\Data\\Reference Documents\\CV.docx");
        sponsorShipLetter_ChooseFileButton.sendKeys(httpsPath+"\\src\\test\\java\\BaseFramework\\Data\\Reference Documents\\Sponsorship Letter.docx");

        uploadAll_Button.click();
    }
    //=============Upload Supporting Documents ***END***========================================//

    //=============Reference Requests***START***========================================//

    @FindBy(xpath = ".//tr/td[text()='First reference']//following-sibling::td[4]/a")
    public static WebElement firstReference_StartButton;

    @FindBy(xpath = ".//input[@id='iczz_title']")
    public static WebElement refereeTitle_TextBox;

    @FindBy(xpath = ".//input[@id='datatel_recommendername']")
    public static WebElement recommenderName_TextBox;

    @FindBy(xpath = ".//input[@id='datatel_recommenderemail']")
    public static WebElement recommenderEmail_TextBox;

    @FindBy(xpath = ".//input[@id='iczz_jobtitle']")
    public static WebElement recommenderJobTitle_TextBox;

    @FindBy(xpath = ".//input[@id='iczz_organisation']")
    public static WebElement recommenderOrganisation_TextBox;

    @FindBy(xpath = ".//textarea[@id='datatel_yearsknowapplicantandcapacity']")
    public static WebElement notesToReferee_TextArea;

    @FindBy(xpath = ".//textarea[@id='datatel_prospectnote']")
    public static WebElement relationshipToReferee_TextArea;

    @FindBy(xpath = ".//select[@id='iczz_gdprapplicantacknowledgement']")
    public static WebElement iAcknowledgeIHaveReadThePrivacyPolicy_DropDown;

    @FindBy(xpath = ".//input[@value='Submit Request']")
    public static WebElement submitRequest_Button;

    @FindBy(xpath = ".//tr/td[text()='Second reference']//following-sibling::td[4]/a")
    public static WebElement secondReference_StartButton;

    @FindBy(xpath = ".//li/a[@aria-label='My Account']")
    public static WebElement clickOnMyAccount_Link;

    public void completeMBAApplicationReferenceInformation() throws Exception {
        String firstRefereeTitle_Value = (dataConnector.getData(123, 1));
        String firstRecommendersName_Value = (dataConnector.getData(124, 1));
        String firstRecommendersEmail_Value = (dataConnector.getData(125, 1));
        String firstRecommendersJobTitle_Value = (dataConnector.getData(126, 1));
        String firstRecommendersOrganisation_Value = (dataConnector.getData(127, 1));
        String firstRelationshipToReferee_Value = (dataConnector.getData(128, 1));
        String firstMessageToReferee_Value = (dataConnector.getData(129, 1));


        String secondRefereeTitle_Value = (dataConnector.getData(133, 1));
        String secondRecommendersName_Value = (dataConnector.getData(134, 1));
        String secondRecommendersEmail_Value = (dataConnector.getData(135, 1));
        String secondRecommendersJobTitle_Value = (dataConnector.getData(136, 1));
        String secondRecommendersOrganisation_Value = (dataConnector.getData(137, 1));
        String secondRelationshipToReferee_Value = (dataConnector.getData(138, 1));
        String secondMessageToReferee_Value = (dataConnector.getData(139, 1));

        String iAcknowledgeIHaveReadThePrivacyPolicy_Value = "Yes";

        firstReference_StartButton.click();
        refereeTitle_TextBox.sendKeys(firstRefereeTitle_Value);
        recommenderName_TextBox.sendKeys(firstRecommendersName_Value);
        recommenderEmail_TextBox.sendKeys(firstRecommendersEmail_Value);
        recommenderJobTitle_TextBox.sendKeys(firstRecommendersJobTitle_Value);
        recommenderOrganisation_TextBox.sendKeys(firstRecommendersOrganisation_Value);
        notesToReferee_TextArea.sendKeys(firstRelationshipToReferee_Value);
        relationshipToReferee_TextArea.sendKeys(firstMessageToReferee_Value);
        selectValueFromDropDowns(iAcknowledgeIHaveReadThePrivacyPolicy_DropDown, iAcknowledgeIHaveReadThePrivacyPolicy_Value);
        submitRequest_Button.click();

        secondReference_StartButton.click();

        refereeTitle_TextBox.sendKeys(secondRefereeTitle_Value);
        recommenderName_TextBox.sendKeys(secondRecommendersName_Value);
        recommenderEmail_TextBox.sendKeys(secondRecommendersEmail_Value);
        recommenderJobTitle_TextBox.sendKeys(secondRecommendersJobTitle_Value);
        recommenderOrganisation_TextBox.sendKeys(secondRecommendersOrganisation_Value);
        notesToReferee_TextArea.sendKeys(secondRelationshipToReferee_Value);
        relationshipToReferee_TextArea.sendKeys(secondMessageToReferee_Value);
        selectValueFromDropDowns(iAcknowledgeIHaveReadThePrivacyPolicy_DropDown, iAcknowledgeIHaveReadThePrivacyPolicy_Value);
        submitRequest_Button.click();
        clickOnMyAccount_Link.click();
    }

    //--------------END OF REFERENCE SUBMISSION---------------------------------------------

    @FindBy(xpath = ".//div[@class='col-md-12  elcn-content elcn-container']/div")
    public static WebElement successfulPaymentMessage_Text;

    public void mbaSuccessfulPayment(String successfulPaymentMessage) {
        String getBodyMessage_Text = successfulPaymentMessage_Text.getText();
        assertEquals(successfulPaymentMessage,getBodyMessage_Text);
        System.out.println("***************************"+successfulPaymentMessage);

    }

    @FindBy(xpath = ".//a[contains(text(),'My Account')]")
    public static WebElement myAccount_Link;

    @FindBy(xpath = "(.//td/a[@class='elcn-application-link'])[1]")
    public static WebElement applicationLink_MyAccountView;

    public void goBackToTheApplication() {
        myAccount_Link.click();
        applicationLink_MyAccountView.click();
    }

    @FindBy(xpath = "(.//div/a[contains(text(),'Request Programme Change')])[1]")
    public static WebElement requestProgrammeChange_LinkText;

    public void verifyApplicationNumberText(String applicationNumber) {

        String getBodyText = requestProgrammeChange_LinkText.getText();
        assertEquals(applicationNumber,getBodyText);

        System.out.println("**************************" + getBodyText);
    }
}
