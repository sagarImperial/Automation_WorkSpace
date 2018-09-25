package Pages.WFE;

import BaseFramework.Hooks.DataConnector;
import BaseFramework.Plumbing.Driver_Init;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class CreateNewApplication extends Driver_Init {

    DataConnector dataConnector;
    File httpsPath = new File(System.getProperty("user.dir"));

    public CreateNewApplication(WebDriver driver) {
        PageFactory.initElements(driver, this);
        dataConnector = new DataConnector();
        dataConnector.setDataFile("src\\test\\java\\BaseFramework\\Data\\DA.xlsx", "Program2");
    }

    public void selectValueFromDropDowns(WebElement element, String value) {
        Select selectValue = new Select(element);
        selectValue.selectByVisibleText(value);
    }

    @FindBy(xpath = ".//input[@id='Username']")
    public static WebElement userNameInputBox;

    @FindBy(xpath = ".//input[@id='Password']")
    public static WebElement passwordInputBox;

    @FindBy(xpath = ".//input[@id='submitLogin']")
    public static WebElement loginButton;

    //    Change when you run for a completely new application
    @FindBy(xpath = ".//*[contains(@value,'Create a New Application')]")
    public static WebElement createANewApplicationButton;

    @FindBy(xpath = "(.//a[@class='elcn-application-link'])[1]")
    public static WebElement firstApplicationLink;

    @FindBy(xpath = ".//*[contains(text(),'Postgraduate Taught') and @class='startApp']")
    public static WebElement postgraduateTaughtButton;

    @FindBy(xpath = ".//input[@value='Continue this application']")
    public static WebElement continueThisApplicationButton;

    public void login() throws Exception {
        userNameInputBox.sendKeys(dataConnector.getData(5, 1));
        passwordInputBox.sendKeys(dataConnector.getData(9, 1));
        loginButton.click();
    }

    public void clickOnCreateANewApplicationButton() {
        createANewApplicationButton.click();
    }

    public void clickOnPostgraduateTaughtButton() {
        postgraduateTaughtButton.click();
    }

    public void clickOnContinueThisApplication() {
        continueThisApplicationButton.click();
    }


    @FindBy(xpath = ".//select[@id='iczz_applicationcatagory']")
    public static WebElement applicationCategoryDropDown;

    @FindBy(xpath = ".//select[contains(@id,'datatel_anticipatedentrytermid')]")
    public static WebElement anticipatedEntryTerm_DropDown;

    @FindBy(xpath = ".//select[contains(@id,'datatel_academicprogramid')]")
    public static WebElement academicProgramme_DropDown;

    @FindBy(xpath = ".//select[@id='iczz_modeofstudy']")
    public static WebElement modeOfStudyDropDown;

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

    @FindBy(xpath = ".//select[@id='iczz_ucasukareasofresidence']")
    public static WebElement ukAreaOfResidence_DropDown;

    @FindBy(xpath = ".//input[@id='iczz_ukarrival']")
    public static WebElement dateOfArrivalInTheUK_DropDown;


    @FindBy(xpath = ".//select[@id='iczz_currentlyholdingukvisa']")
    public static WebElement areYouCurrentlyInTheUKOnAVisa;


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
        String ukAreaOfResidence_Value = (dataConnector.getData(28, 1));
        String dateOfArrivalInTheUK_Value = (dataConnector.getData(29, 1));
        String areYouCurrentlyInTheUKOnAVisa_Value = (dataConnector.getData(30, 1));

        String doYouNeedAStudyVisaToStudyIntheUK_Value = (dataConnector.getData(31, 1));
        String haveYouPreviouslyStudiedInTheUKOnATierFourStudentVidsa_Value = (dataConnector.getData(32, 1));

        selectValueFromDropDowns(applicationCategoryDropDown, applicationCategory_Value);
        System.out.println("************* : - " + applicationCategory_Value);
        selectValueFromDropDowns(anticipatedEntryTerm_DropDown, anticipatedEntryYear_Value);
        selectValueFromDropDowns(academicProgramme_DropDown, academicProgramme_Value);


        selectValueFromDropDowns(modeOfStudyDropDown, modeOfStudyValue);
        System.out.println("************* : - " + modeOfStudyValue);
        preferredFirstName.sendKeys(preferredFirstNameValue);


        //==========================Proposed Studies and Personal Information***START========================================//
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
        selectValueFromDropDowns(ukAreaOfResidence_DropDown, ukAreaOfResidence_Value);
        System.out.println("************* : - " + ukAreaOfResidence_Value);

        dateOfArrivalInTheUK_DropDown.sendKeys(dateOfArrivalInTheUK_Value);
        System.out.println("************* : - " + dateOfArrivalInTheUK_Value);

        selectValueFromDropDowns(areYouCurrentlyInTheUKOnAVisa, areYouCurrentlyInTheUKOnAVisa_Value);
        System.out.println("************* : - " + areYouCurrentlyInTheUKOnAVisa_Value);
        selectValueFromDropDowns(doYouNeedVisaToStudyInTheUK_DropDown, doYouNeedAStudyVisaToStudyIntheUK_Value);
        System.out.println("************* : - " + doYouNeedAStudyVisaToStudyIntheUK_Value);
        selectValueFromDropDowns(haveYouPreviouslyStudiedInTheUKOntyATierFourStudentVisa_DropDown, haveYouPreviouslyStudiedInTheUKOnATierFourStudentVidsa_Value);
        System.out.println("************* : - " + haveYouPreviouslyStudiedInTheUKOnATierFourStudentVidsa_Value);

        saveAndContinue_Button.click();
    }
//=============Proposed Studies and Personal Information***END***========================================//

    //=============Academic Experience***START***========================================//

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

    //=============Academic Experience***END***========================================//


    //=============Additional Qualification***START***========================================//

    // Navigation to Tab
    @FindBy(xpath = ".//input[contains(@value,'Additional Qualification')]")
    public static WebElement additionalQualifications_Tab;

    @FindBy(xpath = ".//select[contains(@id,'iczz_englishqualitystatus')]")
    public static WebElement doYouHoldAnEnglishLanguageQualification_DropDown;

    @FindBy(xpath = ".//select[contains(@id,'iczz_englishqualificationtype')]")
    public static WebElement englishQualificationType_DropDown;


    @FindBy(xpath = ".//input[contains(@id,'iczz_alevelenglishlanguagedatetaken')]")
    public static WebElement aLevelEnglishLanguageDateTake_DatePicker;

    @FindBy(xpath = ".//select[contains(@id,'czz_alevelenglishlanguage')]")
    public static WebElement aLevelEnglishLangaugeGrade_DropDown;

    public void completeAdditionalQualificationTabDetails() throws Exception {
        String doYouHoldAnEnglishLanguageQualification_Value = (dataConnector.getData(57, 1));
        String englishQualificationType_Value = (dataConnector.getData(58, 1));
        String aLevelEnglishLanguageDateTake_Value = (dataConnector.getData(59, 1));
        String aLevelEnglishLanguageGrade_DropDown = (dataConnector.getData(60, 1));

//        additionalQualifications_Tab.click();
        selectValueFromDropDowns(doYouHoldAnEnglishLanguageQualification_DropDown, doYouHoldAnEnglishLanguageQualification_Value);
        System.out.println("****************** : - " + doYouHoldAnEnglishLanguageQualification_Value);
        selectValueFromDropDowns(englishQualificationType_DropDown, englishQualificationType_Value);
        System.out.println("****************** : - " + englishQualificationType_Value);
        aLevelEnglishLanguageDateTake_DatePicker.sendKeys(aLevelEnglishLanguageDateTake_Value);
        System.out.println("****************** : - " + aLevelEnglishLanguageDateTake_Value);
        selectValueFromDropDowns(aLevelEnglishLangaugeGrade_DropDown, aLevelEnglishLanguageGrade_DropDown);
        System.out.println("****************** : - " + aLevelEnglishLanguageGrade_DropDown);

        saveAndContinue_Button.click();

    }

    //=============Additional Qualification***END***========================================//


    //=============Additional Information***START***========================================//
    // Navigation to Tab
    @FindBy(xpath = ".//input[contains(@value,'Additional Information')]")
    public static WebElement additionalInformation_Tab;

    @FindBy(xpath = ".//select[contains(@id,'iczz_scholarshiplist')]")
    public static WebElement howAreYouIntendingToFundYourStudies_DropDown;

    public void completeAdditionalInformationTabDetails() throws Exception {
        String howAreYouIntendingToFundYourStudies_Value = (dataConnector.getData(67, 1));

//        additionalInformation_Tab.click();
        selectValueFromDropDowns(howAreYouIntendingToFundYourStudies_DropDown, howAreYouIntendingToFundYourStudies_Value);
        saveAndContinue_Button.click();
    }
    //=============Additional Information***END***========================================//


    //=============Confidential Information***START***========================================//
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
        String ethnicity_Value = (dataConnector.getData(71, 1));
        String doYouHaveADisablityYouWishToDeclare_Value = (dataConnector.getData(72, 1));
        String doYouHaveAnyCriminalConvictions_Value = (dataConnector.getData(73, 1));

//        confidentialInformation_Tab.click();
        selectValueFromDropDowns(ethnicity_DropDown, ethnicity_Value);
        selectValueFromDropDowns(doYouHaveADisablityYouWishToDeclare_DropDown, doYouHaveADisablityYouWishToDeclare_Value);
//        doYouHaveCriminalConvictions_YES_RadioButton.click();
        saveAndContinue_Button.click();
    }

    //=============Confidential Information***END***========================================//


    //=============Marketing Information***START***========================================//
    // Navigation to Tab
    @FindBy(xpath = ".//input[contains(@value,'Marketing Information')]")
    public static WebElement marketingInformation_Tab;

    @FindBy(xpath = ".//select[contains(@id,'datatel_decisionfactor1')]")
    public static WebElement howDidYouFindOutAboutImperialCollegeLondon_DropDown;


    public void marketingInformationTabDetails() throws Exception {
        String howDidYouFindOutAboutImperialCollegeLondon_Value = (dataConnector.getData(77, 1));

//        marketingInformation_Tab.click();
        selectValueFromDropDowns(howDidYouFindOutAboutImperialCollegeLondon_DropDown, howDidYouFindOutAboutImperialCollegeLondon_Value);
        saveAndContinue_Button.click();
    }

    //=============Marketing Information***END***========================================//

    //=============Submission ***START***========================================//
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
        String signature_Value = (dataConnector.getData(1, 1));
//        submission_Tab.click();
        doYouDeclaretheAbove_YES_RadioButton.click();
        signature_TextBox.sendKeys(signature_Value);
        submitApplication_Button.click();
    }
    //=============Submission ***END***========================================//

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

    @FindBy(xpath = ".//td/input[@class='btn btn-secondary upload-all']")
    public static WebElement uploadAll_Button;

    public void uploadSupportingDocuments() throws Exception{

        firstApplicationLink.click();
        supportingDocumentsAndReferences_Link.click();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        personalStatement_ChooseFileButton.sendKeys(httpsPath + "\\src\\test\\java\\BaseFramework\\Data\\Reference Documents\\Personal_Statement.docx");
        transcript_ChooseFile_Button.sendKeys(httpsPath + "\\src\\test\\java\\BaseFramework\\Data\\Reference Documents\\Transcript.docx");
        englishLanguageCertificate_ChooseFileButton.sendKeys(httpsPath + "\\src\\test\\java\\BaseFramework\\Data\\Reference Documents\\English_Langauge.docx");
        cv_ChooseFileButton.sendKeys(httpsPath + "\\src\\test\\java\\BaseFramework\\Data\\Reference Documents\\CV.docx");
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

    public void completeReferenceInformation() throws Exception {
        String firstRefereeTitle_Value = (dataConnector.getData(84, 1));
        String firstRecommendersName_Value = (dataConnector.getData(85, 1));
        String firstRecommendersEmail_Value = (dataConnector.getData(86, 1));
        String firstRecommendersJobTitle_Value = (dataConnector.getData(87, 1));
        String firstRecommendersOrganisation_Value = (dataConnector.getData(88, 1));
        String firstRelationshipToReferee_Value = (dataConnector.getData(89, 1));
        String firstMessageToReferee_Value = (dataConnector.getData(90, 1));


        String secondRefereeTitle_Value = (dataConnector.getData(94, 1));
        String secondRecommendersName_Value = (dataConnector.getData(95, 1));
        String secondRecommendersEmail_Value = (dataConnector.getData(96, 1));
        String secondRecommendersJobTitle_Value = (dataConnector.getData(97, 1));
        String secondRecommendersOrganisation_Value = (dataConnector.getData(98, 1));
        String secondRelationshipToReferee_Value = (dataConnector.getData(99, 1));
        String secondMessageToReferee_Value = (dataConnector.getData(100, 1));

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

    public void clickOnyMyAccountLink(){
        clickOnMyAccount_Link.click();
    }
    //=============Reference Requests***END***========================================//

    public void createWholeANewApplicationInOneMethod()throws Exception{
//        login();
        clickOnCreateANewApplicationButton();
        clickOnPostgraduateTaughtButton();
        clickOnContinueThisApplication();
        completeProposedStudiesAndPersonalInformation();
        completeAcademicExperienceTabDetails();
        completeAdditionalQualificationTabDetails();
        completeAdditionalInformationTabDetails();
        confidentialInformationTabDetails();
        marketingInformationTabDetails();
        submissionTabDetails();
        uploadSupportingDocuments();
        completeReferenceInformation();
    }
}
