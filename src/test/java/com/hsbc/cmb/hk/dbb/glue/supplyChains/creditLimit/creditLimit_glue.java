package com.hsbc.cmb.hk.dbb.glue.supplyChains.creditLimit;

import com.hsbc.cmb.hk.dbb.steps.supplyChains.creditLimit.creditLimit_step;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.apache.tools.ant.taskdefs.Sleep;

public class creditLimit_glue {
    @ManagedPages
    public Pages pages;

    @Steps
    private creditLimit_step creditLimit_step;
    public static String envTag;
    private BDDUtil bddUtil;


    @When("^I click UnderWriting and UnderWriting Approval$")
    public void iClickUnderWritingAndUnderWritingApproval() {
        creditLimit_step.clickUnderWritingAndApproval();
    }


    @Then("^I should direct to the UnderWriting Approval page$")
    public void iShouldDirectToTheUnderWritingApprovalPage() {
        creditLimit_step.seeUnderWritingAndApprovalText();
    }

    @When("^I click buyer Assign to Me button on UnderWriting Approval page$")
    public void iClickBuyerAssignToMeButtonOnUnderWritingApprovalPage() {
        creditLimit_step.clickBuyerAssignBtn();
    }

    @When("^I click Assign to ME title on the on UnderWriting Approval page$")
    public void iClickAssignToMETitleOnTheOnUnderWritingApprovalPage() {
        creditLimit_step.clickTopAssignBtn();
    }

    @Then("^I should see Proceed Button on the UnderWriting Approval page$")
    public void iShouldSeeProceedButtonOnTheUnderWritingApprovalPage() {
        creditLimit_step.seeProceedBtn();
    }

    @When("^I click Completed Button on the UnderWriting Approval page$")
    public void iClickCompletedButtonOnTheUnderWritingApprovalPage() {
        creditLimit_step.clickCompletedBtn();
    }
}
