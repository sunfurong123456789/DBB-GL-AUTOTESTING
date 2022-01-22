package com.hsbc.cmb.hk.dbb.glue.supplyChains.tubeByInputting;

import com.hsbc.cmb.hk.dbb.steps.supplyChains.systemManager.logon_step;
import com.hsbc.cmb.hk.dbb.steps.supplyChains.tubeByInputting.creatCustomers_step;
import com.hsbc.cmb.hk.dbb.utils.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.openqa.selenium.JavascriptExecutor;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class creatCustomers_glue {
    @ManagedPages
    public Pages pages;
    IdCardGenerator g = new IdCardGenerator();
    public static String code;

    @Steps
    private creatCustomers_step customers_step;
    public static String envTag;
    private BDDUtil bddUtil;
    private logon_step logon_step;
    public String mailName = JRandomNameTool.getStringRandom(8);
    public String mailName1 = JRandomNameTool.getStringRandom(8);

    @When("^login successfully and click the SCF link$")
    public void loginSuccessfullyAndClickTheSCFLink() {
        customers_step.disPlayedSCFTitle();

    }

    @When("^I click Customers and select Onboarding List$")
    public void iClickCustomersAndSelectOnboardingList() {
        customers_step.getClickCustomersMenu();
        customers_step.getClickOnboardingListMenu();
    }

    @And("^I click Create Customer and fill in the buyer information in the pop-up window$")
    public void iClickCreateCustomerAndFillInTheBuyerInformationInThePopUpWindow() {
        customers_step.getClickCreateCustomerBtn();
        customers_step.getSelectCustomerType();
        customers_step.getCustomerTypeValue();
        customers_step.getCompanyName(JRandomNameTool.getStringRandom(4));
        customers_step.getCompanyID(RandomPhoneNumber.randomPhoneNum());
        customers_step.getSelectCountryOfRegistration();
        customers_step.getCountryOfRegistrationValue();
        customers_step.getCompanyNameLeft(JRandomNameTool.getStringRandom(10));
        customers_step.getCLickNextBtn();
    }

    @And("^I click Create Customer and fill in the supplier information in the pop-up window$")
    public void iClickCreateCustomerAndFillInTheSupplierInformationInThePopUpWindow() {
        customers_step.getClickCreateCustomerBtn();
        customers_step.getSelectCustomerType();
        customers_step.getCustomerTypeSupplier();
        customers_step.getCompanyName(JRandomNameTool.getRandomJianHan(4));
        customers_step.getCompanyID(RandomPhoneNumber.randomPhoneNum());
        customers_step.getSelectCountryOfRegistration();
        customers_step.getCountryOfRegistrationValue();
        customers_step.getCompanyNameLeft(JRandomNameTool.getStringRandom(10));
        customers_step.getCLickNextBtn();
    }

    @Then("^I Check to see if you jump to the Authorized Person page$")
    public void checkToSeeIfYouJumpToTheAuthorizedPersonPage() {
        customers_step.getCheckNextPage();
    }

    @When("^Fill in email 1 and email 2 supplier information on the Authorized Person page$")
    public void fillInAdministratorAndAdministratorSupplierInformationOnTheAuthorizedPersonPage() {
        customers_step.getFirstNameInput(JRandomNameTool.getStringRandom(6));
        bddUtil.switchToNewWindow();
        customers_step.emailOperation(mailName);
        bddUtil.switchToWindows();
        customers_step.getEmailInput(mailName + "@MailTemp.top");
        System.out.println("---------------第一个邮箱地址："+ mailName + "@MailTemp.top"+"----------------------");
        customers_step.getLastName(JRandomNameTool.getRandomJianHan(4));
        customers_step.getMobileInput(RandomPhoneNumber.randomPhoneNum());
        customers_step.getFirstNameSecondInput(JRandomNameTool.getStringRandom(4));
        customers_step.getEmailSecondInput(mailName1  + "@MailTemp.top");
        System.out.println("---------------第二个邮箱地址："+ mailName1 + "@MailTemp.top"+"----------------------");
        customers_step.getLastNameSecondInput(JRandomNameTool.getStringRandom(4));
        customers_step.getMobileSecondInput(RandomPhoneNumber.randomPhoneNum());
        customers_step.clickInputBySelectBox();
        customers_step.clickSubmitBtn();
        bddUtil.sleep(3);
    }

    @When("^Fill in email 1 and email 2 buyer information on the Authorized Person page$")
    public void fillInAdministratorAndAdministratorBuyerInformationOnTheAuthorizedPersonPage() {
        customers_step.getFirstNameInput(JRandomNameTool.getStringRandom(6));
        bddUtil.switchToNewWindow();
        customers_step.emailOperation(mailName);
        bddUtil.switchToWindows();
        customers_step.getEmailInput(mailName + "@@MailTemp.top");
        System.out.println("---------------第一个邮箱地址："+ mailName + "@MailTemp.top"+"----------------------");
        customers_step.getLastName(JRandomNameTool.getRandomJianHan(4));
        customers_step.getMobileInput(RandomPhoneNumber.randomPhoneNum());
        customers_step.getFirstNameSecondInput(JRandomNameTool.getStringRandom(4));
        customers_step.getEmailSecondInput(mailName1  + "@MailTemp.top");
        System.out.println("---------------第二个邮箱地址："+ mailName1 + "@MailTemp.top"+"----------------------");
        customers_step.getLastNameSecondInput(JRandomNameTool.getStringRandom(4));
        customers_step.getMobileSecondInput(RandomPhoneNumber.randomPhoneNum());
        customers_step.clickSubmitBtn();
    }

    @Then("^Successfully create buyer customer information$")
    public void successfullyCreateBuyerCustomerInformation() {
        customers_step.checkSuccessPageTitle();
    }

    @And("^I switch to the SCF page$")
    public void iSwitchToTheSCFPage() {
        bddUtil.switchToSecondWindows();
    }

    @When("^open the email browser page$")
    public void openThreePage() {
       customers_step.openEmailUrl();
    }

    @And("^I received an email from Green Union Bank on the email page$")
    public void iReceivedAnEmailFromGreenUnionBankOnTheEmailPage() {
        customers_step.viewEmail();
    }

    @And("^I click the email icon to send the email$")
    public void clickTheEmailIconToSendTheEmail() {
        customers_step.clickSendEmailBtn();
    }

    @Then("^I check that the email has been sent successfully$")
    public void iCheckThatTheEmailHasBeenSentSuccessfully() {
        customers_step.checkSendEmailSuccess();
    }

    @When("^I get the verification code in the email and click to jump to the GLDB page to fill in the information and generate the verification code$")
    public void iGetTheVerificationCodeInTheEmailAndClickToJumpToTheGLDBPageToFillInTheInformationAndGenerateTheVerificationCode() {
        customers_step.selectFirstEmailAndTakeVCode(mailName);
    }

    @And("^I went back to the email page to get the verification code$")
    public void iWentBackToTheEmailPageToGetTheVerificationCode() {
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://mailtemp.top/mailbox?name="+mailName+"\");");
        bddUtil.switchToNewWindow();
        customers_step.thirdEmail();
    }

    @And("^I enter Company ID and click Login button$")
    public void iEnterCompanyIDAndClikLoginButton() {
        customers_step.enterCompanyIdAndClickLoginBtn();
    }

    @Then("^Click login to jump to the Set New Password page$")
    public void clickLoginToJumpToTheSetNewPasswordPage() {
        customers_step.setNewPasswordPage();
    }

    @When("^After login Set a New Password on the Set New Password page$")
    public void afterLoginSetANewPasswordOnTheSetNewPasswordPage() {
        customers_step.enterNewPassword();
    }

    @Then("^I jump to the login page$")
    public void iJumpToTheLoginPage() {
        customers_step.jumpLoginPage();
    }

    @When("^I fill in the content on the login page and click operation$")
    public void iFillInTheContentOnTheLoginPageAndClickOperation() {
        customers_step.enterLoginInformationAgain(mailName);
    }


    @When("^I click agree Service Agreement$")
    public void iClickAgreeServiceAgreement() {
        customers_step.getClickCheckBox();
    }

    @Then("^I jump to the Tell Us About Your Company page$")
    public void iJumpToTheTellUsAboutYourCompanyPage() {
        customers_step.checkJumpPageTellUsTitle();
    }

    @When("^I entered information on the Tell Us About Your Company page$")
    public void iEnteredInformationOnTheTellUsAboutYourCompanyPage() {
        customers_step.companyPageInformation(mailName);

    }

    @When("^I login service agreement window$")
    public void iLoginServiceAgreementWindow() {
        customers_step.openEmailUrl();
        customers_step.iLoginServiceAgreementWindow();
    }

    @Given("^logon \"([^\"]*)\" test code$")
    public void logonTestCode(String envName) {
        envTag = envName;
        if (!envName.isEmpty()) {
            customers_step.open_the_first_dbb_logon_page(envName);
        }
    }

    @Then("^Check whether to jump to the next page after filling in the content of Company page$")
    public void checkWhetherToJumpToTheNextPageAfterFillingInTheContentOfCompanyPage() {
        customers_step.jumpSetUpPrimaryAdminTitle();
    }

    @When("^Fill in the administrator information on the People page and click Next to go to the Next page$")
    public void fillInTheAdministratorInformationOnThePeoplePageAndClickNextToGoToTheNextPage() {
        customers_step.enterInformationOnPeoplePage();
    }

    @Then("^Verify whether the director page is displayed$")
    public void clickNextToGoToThePageForFillingInDirectorInformation() {
        customers_step.jumpToDirectorInformation();
    }

    @When("^Fill in the board information on the current page and click the Next button$")
    public void fillInTheBoardInformationOnTheCurrentPageAndClickTheNextButton() {
        customers_step.fillInTheInformationOnTheDirectorPage(mailName);
    }

    @Then("^Verify whether the Shareholder page is displayed$")
    public void clickNextButtonToJumpToThePageOfShareholderInformationFilling() {
        customers_step.jumpToTheShareholderInformation();
    }

    @When("^Fill in the user information on the Shareholder page$")
    public void fillInTheUserInformationOnTheShareholderPage() {
        customers_step.fillInTheInformationOnTheShareholderPage(mailName);
    }

    @Then("^Verify whether the Beneficial page is displayed$")
    public void verifyWhetherTheBeneficialPageIsDisplayed() {
        customers_step.verifyWhetherTheBeneficialPageIsDisplayed();
    }

    @When("^Fill in the information on the Beneficial page$")
    public void fillInTheInformationOnTheBeneficialPage() {
        customers_step.fillInTheInformationOnTheBeneficialPage(mailName);
    }

    @Then("^Verify whether the Account page is displayed$")
    public void verifyWhetherTheAccountPageIsDisplayed() {
        customers_step.verifyWhetherTheAccountPageIsDisplayed();
    }

    @When("^Enter the Account information$")
    public void enterTheAccountInformation() {
        customers_step.enterTheAccountInformation();
    }

//    @After
//    public void testCase(){
//        System.out.println("--------------------testcase--------------------");
//    }
}
