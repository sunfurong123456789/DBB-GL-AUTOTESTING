package com.hsbc.cmb.hk.dbb.steps.supplyChains.creditLimit;

import com.hsbc.cmb.hk.dbb.pages.supplyChains.creditLimit.creditLimit_page;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import net.thucydides.core.steps.ScenarioSteps;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class creditLimit_step extends ScenarioSteps {
    private creditLimit_page creditLimit_page;
    private BDDUtil bddUtil;
    public static String envTag;


    @Step
    public void clickUnderWritingAndApproval(){
        creditLimit_page.underWriting.click();
        bddUtil.sleep(1);
        creditLimit_page.underWritingApproval.click();
    }

    @Step
    public void seeUnderWritingAndApprovalText(){
        assertEquals("Underwriting Approval",creditLimit_page.underWritingApprovalText.getText());
    }

    @Step
    public void clickBuyerAssignBtn(){
        List<WebElementFacade> role = creditLimit_page.role;
        List<WebElementFacade> assignBtn = creditLimit_page.assignToMeBtn;
        for (int i = 0; i <8 ; i++) {
            if (role.get(i).getText().equals("Buyer")){
                assignBtn.get(i).click();
                break;
            }

        }
        bddUtil.sleep(1);
    }

    @Step
    public void clickTopAssignBtn(){
        creditLimit_page.assignToMeTopBtn.click();
    }

    @Step
    public void seeProceedBtn(){
        creditLimit_page.proceedBtn.isDisabled();
    }

    @Step
    public void clickCompletedBtn(){
        creditLimit_page.completed.click();
    }
}
