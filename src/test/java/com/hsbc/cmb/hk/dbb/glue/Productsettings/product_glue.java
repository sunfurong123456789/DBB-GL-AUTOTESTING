package com.hsbc.cmb.hk.dbb.glue.Productsettings;

import com.hsbc.cmb.hk.dbb.steps.ProductSettings.product_step;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

public class product_glue {

    @ManagedPages
    public Pages pages;

    @Steps
    private product_step productStep;
    private BDDUtil bddUtil;
    public static String envTag;


    @When("^logon \"([^\"]*)\" on tubea by inputting system$")
    public void logon_onboarding_custom_portal(String envName) {
        envTag = envName;
        if (!envName.isEmpty()) {
            productStep.open_the_first_dbb_logon_page(envName);
//            productStep.enter_Organisation_ID("123456");
        }

    }

    @When("^I click produrt$")
    public void iClickProdurt() {
        productStep.clickProducts();
    }

    @When("^I click on Product List$")
    public void iClickOnProductList() {
        productStep.productList();
    }

    @Then("^click Create Product$")
    public void clickCreateProduct() {
        productStep.creatProduct();
    }

    @Then("^enter the page information$")
    public void enterThePageInformation() {
        productStep.name("lucky");
        productStep.code("010203");
        productStep.productType();
        productStep.clickPostACC();
        productStep.sendkeysStart("2022-01-19");
        productStep.sendkeysEnd("2024-01-19");
        productStep.clickDocs();
        productStep.clickAccepted();
        productStep.clickPaid();
        productStep.clickSeller();
        productStep.clickColletced();
        productStep.clickDiscount();
        productStep.clickDiscount();
        productStep.clickRepayment();
        productStep.clickFull();
        productStep.sendkeysRatio("80");
        productStep.clickTerm();
        productStep.clickWithout();
        productStep.clickIPU();
        productStep.clickoneN();
        productStep.clickMOU();
        productStep.clicktwoN();
        productStep.clickBoth();
    }

    @Then("^click Submit to submit a new product$")
    public void clickSubmitToSubmitANewProduct() {
        productStep.clickSubmit();
    }

}


