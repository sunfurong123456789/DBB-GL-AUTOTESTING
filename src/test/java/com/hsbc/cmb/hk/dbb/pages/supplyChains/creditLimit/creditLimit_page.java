package com.hsbc.cmb.hk.dbb.pages.supplyChains.creditLimit;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;


public class creditLimit_page extends PageObject {

    @FindBy(xpath = "//div[@class='lls-menu__content']/div[@class='lls-submenu']/div[@class='lls-submenu__title']/span[text()='Underwriting']")
    public WebElementFacade underWriting;

    @FindBy(xpath = "//div[@class='lls-menu-item']/span[text()='Underwriting Approval']")
    public WebElementFacade underWritingApproval;

    @FindBy(xpath = "//span[@class='single-line-text is-empty']")
    public WebElementFacade underWritingApprovalText;

    @FindBy(xpath = "//div[@class='lls-design-table-btn-wrapper']/span/button")
    public List<WebElementFacade> assignToMeBtn;

    @FindBy(xpath = "//tr/td[@class='lls-design-cloumn'][@data-key='f3o19io2']")
    public List<WebElementFacade> role;

    @FindBy(xpath = "//div[@class='lls-tabs__nav-scroll']//div[@class='lls-tabs__nav is-top']//div[@aria-controls='pane-1']")
    public WebElementFacade assignToMeTopBtn;

    @FindBy(xpath = "//div[@class='lls-design-table-btn-wrapper']//span[@data-key='f3ql3kf8']//button[@type='button']")
    public WebElementFacade proceedBtn;

    @FindBy(xpath = "//div[@class='lls-tabs__nav-scroll']//div[@class='lls-tabs__nav is-top']//div[@aria-controls='pane-2']")
    public WebElementFacade completed;

}
