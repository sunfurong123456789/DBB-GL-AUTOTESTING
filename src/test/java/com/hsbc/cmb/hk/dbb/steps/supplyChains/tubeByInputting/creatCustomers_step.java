package com.hsbc.cmb.hk.dbb.steps.supplyChains.tubeByInputting;

import com.hsbc.cmb.hk.dbb.glue.supplyChains.tubeByInputting.creatCustomers_glue;
import com.hsbc.cmb.hk.dbb.pages.supplyChains.tubeByInputting.creatCustomers_page;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import com.hsbc.cmb.hk.dbb.utils.CommonUtil;
import com.hsbc.cmb.hk.dbb.utils.JRandomNameTool;
import com.hsbc.cmb.hk.dbb.utils.RandomPhoneNumber;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.mockito.internal.matchers.Find;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.io.IOException;
import java.util.List;

import static com.hsbc.cmb.hk.dbb.utils.AssertLocal.assertTrue;
import static org.junit.Assert.assertEquals;

public class creatCustomers_step extends ScenarioSteps {
    private creatCustomers_page customers_page;
    private BDDUtil bddUtil;
    public static String envTag;

    @Step
    public void getClickCustomersMenu(){
        customers_page.clickCustomersMenu.click();
    }

    public void getClickOnboardingListMenu(){
        customers_page.clickOnboardingListMenu.click();
    }

    public void getClickCreateCustomerBtn(){
        customers_page.clickCreateCustomerBtn.click();
    }

    @Step
    public void disPlayedSCFTitle(){
        if (customers_page.scfTitle.isVisible()){
            System.out.println("成功进入CSF页面");
        }
    }

    @Step
    public void getSelectCustomerType(){
        customers_page.selectCustomerType.click();
    }
    
    @Step
    public void getCustomerTypeValue(){
        customers_page.customerTypeBuyer.click();
    }

    @Step
    public void getCustomerTypeSupplier(){
        customers_page.customerTypeSupplier.click();
    }

    @Step
    public void checkSuccessPageTitle(){
        assertEquals("Customer Profiles",customers_page.checkSuccessPageTitle.getText());
    }

    @Step
    public void getCompanyName(String value){
        customers_page.companyName.sendKeys(value);
    }

    @Step
    public void getCompanyID(String value){
        customers_page.companyID.sendKeys(value);
    }

    @Step
    public void getSelectCountryOfRegistration(){
        customers_page.selectCountryOfRegistration.click();
    }

    @Step
    public void getCountryOfRegistrationValue(){
        bddUtil.scrollWindowToElement(customers_page.countryOfRegistrationValue);
        customers_page.countryOfRegistrationValue.click();
    }

    @Step
    public void getCompanyNameLeft(String value){
        customers_page.companyNameLeft.sendKeys(value);
    }

    @Step
    public void getCLickNextBtn(){
        customers_page.nextBtn.click();
    }

    @Step
    public void getCheckNextPage(){
        customers_page.checkNextPage.isVisible();
        assertEquals("Administrator 1",customers_page.checkNextPage.getText());
    }

    @Step
    public void getFirstNameInput(String value){
        customers_page.firstNameInput.sendKeys(value);
    }

    @Step
    public void getEmailInput(String value){
        customers_page.emailInput.sendKeys(value);
    }

    @Step
    public void getLastName(String value){
        customers_page.lastNameInput.sendKeys(value);
    }

    @Step
    public void getMobileInput(String value){
        customers_page.mobileInput.sendKeys(value);
    }

    @Step
    public void getFirstNameSecondInput(String value){
        customers_page.firstNameSecondInput.sendKeys(value);
    }

    @Step
    public void getEmailSecondInput(String value){
        customers_page.emailSecondInput.sendKeys(value);
    }

    @Step
    public void getLastNameSecondInput(String value){
        customers_page.lastNameSecondInput.sendKeys(value);
    }

    @Step
    public void getMobileSecondInput(String value){
        customers_page.mobileSecondInput.sendKeys(value);
    }

    @Step
    public void clickSubmitBtn(){
        customers_page.submitBtn.click();
    }

    @Step
    public void emailOperation(String value){
        customers_page.sendEmail.clear();
        customers_page.sendEmail.sendKeys(value);
        customers_page.createEmailButton.click();
    }

    @Step
    public void openEmailUrl(){
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://mailtemp.top/mailbox?name=6hZ2781L\");");
    }

    @Step
    public void clickInputBySelectBox(){
        customers_page.clickInputBySelectBox.click();
        customers_page.inputByTypeCustomer.click();
    }

    @Step
    public void clickSendEmailBtn(){
        bddUtil.sleep(5);
        customers_page.emailIcon.click();
        customers_page.confirmBtn.click();
    }

    @Step
    public void checkSendEmailSuccess(){
        assertEquals("Green Link Digital Bank - Invitation",customers_page.firstEmail.getText());
    }

    @Step
    public void viewEmail(){
        bddUtil.switchToNewWindow();
        bddUtil.sleep(3);
        customers_page.clickRefreshBtn.click();
        customers_page.firstEmail.click();
    }

    @Step
    public void selectFirstEmailAndTakeVCode(String value){
        customers_page.firstEmail.click();
        String password = customers_page.emailPassword.getText();
        customers_page.greenLinkSystem.isVisible();
        customers_page.greenLinkSystem.click();
        customers_page.GLDBEmailInput.sendKeys(value + "@MailTemp.top");
        customers_page.GLDBEmailPassword.sendKeys(password);
        customers_page.sendCodeBtn.click();
    }

    @Step
    public void thirdEmail(){
        customers_page.thirdEmail.click();
        String verificationCode = customers_page.emailVerificationCode.getText();
        bddUtil.switchToWindows();
        customers_page.inputSendCode.sendKeys(verificationCode);
    }
    @Step
    public void enterCompanyIdAndClickLoginBtn(){
        customers_page.enterCompanyId.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.GLDBEmailLoginBtn.click();
    }

    @Step
    public void setNewPasswordPage(){
        customers_page.setNewPasswordPage.isVisible();
    }

    @Step
    public void enterNewPassword(){
        customers_page.firstNewPassword.sendKeys("Gl123456");
        customers_page.secondNewPassword.sendKeys("Gl123456");
        customers_page.newPasswordPageConfirmBtn.click();
    }

    @Step
    public void enterLoginInformationAgain(String value){
        customers_page.GLDBEmailInput.sendKeys(value + "@MailTemp.top");
        customers_page.GLDBEmailPassword.sendKeys("Gl123456");
        customers_page.enterCompanyId.clear();
        customers_page.enterCompanyId.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.sendCodeBtn.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(5);
        customers_page.clickRefreshBtn.click();
        customers_page.thirdEmail.click();
        String Vcode = customers_page.emailVerificationCode.getText();
        bddUtil.switchToWindows();
        customers_page.inputSendCode.sendKeys(Vcode);
        customers_page.GLDBEmailLoginBtn.click();
    }

    @Step
    public void getClickCheckBox(){
        if (customers_page.serviceAgreementTitle.isVisible()){
            customers_page.clickCheckBox.click();
            customers_page.clickAgreeBtn.click();
        }
    }

    @Step
    public void jumpLoginPage(){
        customers_page.loginPageTitle.isVisible();
    }

    @Step
    public void checkJumpPageTellUsTitle(){
        customers_page.checkjumpPageTellUs.isVisible();
    }

    @Step
    public void companyPageInformation(String value){
        customers_page.dateInputBox.sendKeys(bddUtil.dateFormate());
        customers_page.annualReturnSizeClick.click();
        customers_page.annualReturnSizeSelect.click();
        customers_page.checkBoxPublicCompanyYes.click();
        customers_page.companyEmail.sendKeys(value+ "@MailTemp.top");
        customers_page.companyPhoneNumber.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.fileUpdate.click();
        bddUtil.sleep(2);
        bddUtil.fileUpload();
        bddUtil.sleep(5);
        bddUtil.scrollWindowToElement(customers_page.noExpiryDateTitle);
        customers_page.noExpiryDateInput.sendKeys("2024-9-10");
        customers_page.memorandumAndArticlesOfAssLink.click();
        bddUtil.sleep(2);
        bddUtil.fileUpload();
        bddUtil.sleep(5);
        customers_page.countryOfTaxation.click();
        bddUtil.scrollWindowToElement(customers_page.selectCountryOfTaxation).click();
        bddUtil.scrollWindowToElement(customers_page.registeredAddressTitle);
        customers_page.registeredAddress.sendKeys(JRandomNameTool.getStringRandom(11));
        bddUtil.scrollWindowToElement(customers_page.sectorTitle);
        customers_page.businessCountry.click();
        bddUtil.scrollWindowToElement(customers_page.selectBusinessCountry).click();
        customers_page.businessAddress.sendKeys(JRandomNameTool.getStringRandom(12));
        customers_page.industry.click();
        bddUtil.scrollWindowToElement(customers_page.selectIndustry).click();
        customers_page.legalStructure.click();
        bddUtil.scrollWindowToElement(customers_page.selectLegalStructure).click();
        customers_page.isNonProfitYes.click();
        customers_page.sectorInputBox.sendKeys(JRandomNameTool.getStringRandom(10));
        customers_page.SaveBtnIndustry.click();
        customers_page.nextBtnIndustry.click();
    }

    @Step
    public void open_the_first_dbb_logon_page(String envName) {
        String logonUrl = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".webdriver.base.url");
        customers_page.openUrl(logonUrl);
    }

    @Step
    public void iLoginServiceAgreementWindow(){
        customers_page.GLDBEmailInput.sendKeys("6hZ2781L@MailTemp.top");
        customers_page.GLDBEmailPassword.sendKeys("Gl123456");
        customers_page.enterCompanyId.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.sendCodeBtn.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(3);
        customers_page.clickRefreshBtn.click();
        customers_page.thirdEmail.click();
        String Vcode = customers_page.emailVerificationCode.getText();
        bddUtil.switchToWindows();
        customers_page.inputSendCode.sendKeys(Vcode);
        customers_page.GLDBEmailLoginBtn.click();

    }

    @Step
    public void jumpSetUpPrimaryAdminTitle(){
        customers_page.jumpSetUpPrimaryAdminTitle.isVisible();
    }

    @Step
    public void enterInformationOnPeoplePage(){
        customers_page.admin1DateOfBirth.sendKeys(bddUtil.dateFormate());
        customers_page.admin1LegalCountry.click();
        bddUtil.scrollWindowToElement(customers_page.admin1LegalCountrySelectChina).click();
        customers_page.admin1CountryOfResidence.click();
        bddUtil.scrollWindowToElement(customers_page.admin1CountryOfResidenceSelectChina).click();
        customers_page.admin1ResidentialAddress.sendKeys(JRandomNameTool.getStringRandom(10));
        customers_page.admin1LegalCertificationType.click();
        bddUtil.scrollWindowToElement(customers_page.admin1LegalCertificationTypeSelectPersonlId).click();
        customers_page.admin1LegalCertificationNo.sendKeys(RandomPhoneNumber.randomPhoneNum());
//        bddUtil.scrollWindowToElement(customers_page.admin2TimePermanent).click();
        bddUtil.scrolltoButtom();
        customers_page.admin2DateOfBirth.sendKeys(bddUtil.dateFormate());
        customers_page.admin2LegalCountry.click();
        bddUtil.scrollWindowToElement(customers_page.admin2LegalCountrySelectChina).click();
        customers_page.admin2CountryOfResidence.click();
        bddUtil.scrollWindowToElement(customers_page.admin2CountryOfResidenceSelectChina).click();
        customers_page.admin2ResidentialAddress.sendKeys(JRandomNameTool.getStringRandom(10));
        customers_page.admin2LegalCertificationType.click();
        bddUtil.scrollWindowToElement(customers_page.admin2LegalCertificationTypeSelectPassport).click();
        customers_page.admin2LegalCertificationNo.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.SaveBtnIndustry.click();
        customers_page.nextBtnIndustry.click();
    }

    @Step
    public void jumpToDirectorInformation(){
        customers_page.directorOfTheInformation.isVisible();
    }

    @Step
    public void jumpToTheShareholderInformation(){
        customers_page.shareholderOfTheInformation.isVisible();
    }

    @Step
    public void fillInTheInformationOnTheDirectorPage(String value){
        customers_page.director1CheckBox.click();
        customers_page.director1FirstName.sendKeys(JRandomNameTool.getRandomJianHan(3));
        customers_page.director1LastName.sendKeys(JRandomNameTool.getRandomJianHan(3));
        customers_page.director1CertificationType.click();
        bddUtil.scrollWindowToElement(customers_page.director1PersonalId).click();
        customers_page.director1CertificationNo.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.director1DateOfBirth.sendKeys(bddUtil.dateFormate());
        customers_page.director1Country.click();
        bddUtil.scrollWindowToElement(customers_page.director1CountrySelectChina).click();
        customers_page.director1ResidentialAddress.sendKeys(JRandomNameTool.getStringRandom(10));
        customers_page.director1Email.sendKeys(value);
        customers_page.director1CountryOfResidence.click();
        bddUtil.scrollWindowToElement(customers_page.director1CountryOfResidenceSelectChina).click();
        customers_page.director1Phone.sendKeys(RandomPhoneNumber.randomPhoneNum());
//        bddUtil.scrollWindowToElement(customers_page.director2TimePermanent).click();
        bddUtil.scrolltoButtom();
        customers_page.director2CheckBox.click();
        customers_page.director2FirstName.sendKeys(JRandomNameTool.getRandomJianHan(3));
        customers_page.director2LastName.sendKeys(JRandomNameTool.getRandomJianHan(3));
        customers_page.director2CertificationType.click();
        bddUtil.scrollWindowToElement(customers_page.director2Passport).click();
        customers_page.director2CertificationNo.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.director2TimePermanentCheckBox.click();
        customers_page.director2DateOfBirth.sendKeys(bddUtil.dateFormate());
        customers_page.director2Country.click();
        bddUtil.scrollWindowToElement(customers_page.director2CountrySelectChina).click();
        customers_page.director2ResidentialAddress.sendKeys(JRandomNameTool.getStringRandom(10));
        customers_page.director2Email.sendKeys(value);
        customers_page.director2CountryOfResidence.click();
        bddUtil.scrollWindowToElement(customers_page.director2CountryOfResidenceSelectChina).click();
        customers_page.director2Phone.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.SaveBtnIndustry.click();
        customers_page.nextBtnIndustry.click();
    }

    @Step
    public void fillInTheInformationOnTheShareholderPage(String value){
        customers_page.shareholder1FirstName.sendKeys(JRandomNameTool.getRandomJianHan(3));
        customers_page.shareholder1LastName.sendKeys(JRandomNameTool.getRandomJianHan(4));
        customers_page.shareholder1CertificationType.click();
        bddUtil.scrollWindowToElement(customers_page.shareholder1CertificationTypeSelectPersonalId).click();
        customers_page.shareholder1CertificationNo.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.shareholder1DateOfBirth.sendKeys(bddUtil.dateFormate());
        customers_page.shareholder1Country.click();
        bddUtil.scrollWindowToElement(customers_page.shareholder1CountrySelectChina).click();
        customers_page.shareholder1CountryOfResidence.click();
        bddUtil.scrollWindowToElement(customers_page.shareholder1CountryOfResidenceSelectChina).click();
        customers_page.shareholder1Email.sendKeys(value);
        customers_page.shareholder1Phone.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.shareholder1ResidentialAddress.sendKeys(JRandomNameTool.getStringRandom(10));
//        bddUtil.scrollWindowToElement(customers_page.shareholder2FundScale).click();
        bddUtil.scrolltoButtom();
        customers_page.shareholder1FundScale.sendKeys("25");
        customers_page.shareholder2FirstName.sendKeys(JRandomNameTool.getRandomJianHan(3));
        customers_page.shareholder2LastName.sendKeys(JRandomNameTool.getRandomJianHan(4));
        customers_page.shareholder2CertificationType.click();
        bddUtil.scrollWindowToElement(customers_page.shareholder2CertificationTypeSelectPersonalId).click();
        customers_page.shareholder2CertificationNo.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.shareholder2TimePermanent.click();
        customers_page.shareholder2DateOfBirth.sendKeys(bddUtil.dateFormate());
        customers_page.shareholder2Country.click();
        bddUtil.scrollWindowToElement(customers_page.shareholder2CountrySelectChina).click();
        customers_page.shareholder2CountryOfResidence.click();
        bddUtil.scrollWindowToElement(customers_page.shareholder2CountryOfResidenceSelectChina).click();
        customers_page.shareholder2Email.sendKeys(value);
        customers_page.shareholder2Phone.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.shareholder2ResidentialAddress.sendKeys(JRandomNameTool.getStringRandom(10));
        customers_page.shareholder2FundScale.sendKeys("25");
        customers_page.SaveBtnIndustry.click();
        customers_page.nextBtnIndustry.click();
    }

    @Step
    public void verifyWhetherTheBeneficialPageIsDisplayed(){
        customers_page.beneficialCheckBox.isVisible();
    }

    @Step
    public void fillInTheInformationOnTheBeneficialPage(String value){
        customers_page.beneficial1FirstName.sendKeys(JRandomNameTool.getRandomJianHan(3));
        customers_page.beneficial1LastName.sendKeys(JRandomNameTool.getRandomJianHan(4));
        customers_page.beneficial1CertificationType.click();
        bddUtil.scrollWindowToElement(customers_page.beneficial1CertificationTypeSelectPersonalId).click();
        customers_page.beneficial1CertificationNo.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.beneficial1TimePermanent.click();
        customers_page.beneficial1FundScale.sendKeys("25");
        customers_page.beneficial1Email.sendKeys(value);
        customers_page.beneficial1DateOfBirth.sendKeys(bddUtil.dateFormate());
        customers_page.beneficial1Country.click();
        bddUtil.scrollWindowToElement(customers_page.beneficial1CountrySelectChina).click();
        bddUtil.scrollWindowToElement(customers_page.beneficial1ResidentialAddress).click();
        customers_page.beneficial1Phone.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.beneficial1CountryOfResidence.click();
        bddUtil.scrollWindowToElement(customers_page.beneficial1CountryOfResidenceSelectChina).click();
        customers_page.beneficial1ResidentialAddress.sendKeys(JRandomNameTool.getStringRandom(10));
        customers_page.SaveBtnIndustry.click();
        customers_page.nextBtnIndustry.click();
    }

    @Step
    public void verifyWhetherTheAccountPageIsDisplayed(){
        customers_page.tellUsAboutAccoutPageTitle.isVisible();
    }

    @Step
    public void enterTheAccountInformation(){
        customers_page.accountCurrency.click();
        bddUtil.scrollWindowToElement(customers_page.accountCurrencyCNY).click();
        customers_page.collectionAccountCurrency.click();
        bddUtil.scrollWindowToElement(customers_page.collectionAccountCurrencyCNY).click();
        customers_page.SaveBtnIndustry.click();
        customers_page.nextBtnIndustry.click();
    }

}
