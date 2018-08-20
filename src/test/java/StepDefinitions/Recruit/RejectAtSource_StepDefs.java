package StepDefinitions.Recruit;

import BaseFramework.Utils.Constants;
import Pages.CRM_Recruit.RecruitLogin;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

import static BaseFramework.Plumbing.Driver_Init.driver;

public class RejectAtSource_StepDefs {

    RecruitLogin recruitLogin;

    public RejectAtSource_StepDefs(){
        recruitLogin = new RecruitLogin(driver);
    }

}
