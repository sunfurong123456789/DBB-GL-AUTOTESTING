package com.hsbc.cmb.hk.dbb.steps.ProductSettings;

import com.hsbc.cmb.hk.dbb.pages.ProductSettings.product_page;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import com.hsbc.cmb.hk.dbb.utils.CommonUtil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class product_step extends ScenarioSteps {
    private BDDUtil bddUtil;
    private product_page productPage;

    @Step
    public void open_the_first_dbb_logon_page(String envName) {
        String logonUrl = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".webdriver.base.url");
        productPage.openUrl(logonUrl);
    }
    @Step
    public void clickProducts() {
        productPage.products.click();}
    @Step
    public void productList() {
        productPage.List.click();
    }

    @Step
    public void creatProduct() {
        productPage.addDrop.click();
    }

    @Step
    public void name(String Value) {productPage.name.sendKeys(Value);}

    @Step
    public void code(String Value) {productPage.code.sendKeys(Value);}

    @Step
    public void productType() {productPage.Type.click();}

    @Step
    public void clickPostACC() { productPage.postAcc.click();}

    @Step
    public void sendkeysStart(String Value) { productPage.start.sendKeys(Value);}

    @Step
    public void sendkeysEnd(String Value) { productPage.end.sendKeys(Value);}

    @Step
    public void clickDocs() {productPage.Docs.click();}

    @Step
    public void clickAccepted() {productPage.Accepted.click();}

    @Step
    public void clickPaid() {productPage.Paid.click();}
    @Step
    public  void  clickSeller() {productPage.seller.click();}
    @Step
    public  void clickColletced() {productPage.colletced.click();}
    @Step
    public  void clickDiscount() {productPage.discount.click();}
    @Step
    public  void clickRepayment() {productPage.Repayment.click();}
    @Step
    public  void  clickFull() {productPage.FULL.click();}
    @Step
    public  void sendkeysRatio(String Value) { productPage.Ratio.sendKeys(Value);}


    @Step
    public  void  clickTerm() {productPage.Term.click();}
    @Step
    public  void  clickWithout() {productPage.Without.click();}
    @Step
    public  void  clickIPU() {productPage.IPU.click();}
    @Step
    public  void  clickoneN() {productPage.oneN.click();}
    @Step
    public  void  clickMOU() {productPage.MOU.click();}
    @Step
    public  void  clicktwoN() {productPage.twoN.click();}
    @Step
    public  void  clickLimit() {productPage.Limit.click();}
    @Step
    public  void  clickBoth() {productPage.Both.click();}

    @Step
    public void  clickSubmit() {productPage.submit.click();}


    }


