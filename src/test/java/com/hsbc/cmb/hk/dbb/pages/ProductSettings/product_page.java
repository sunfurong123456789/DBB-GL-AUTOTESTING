package com.hsbc.cmb.hk.dbb.pages.ProductSettings;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class product_page extends PageObject {
    @FindBy(xpath= "//*[@id='app']//div[@class='lls-menu__content']/div[3]/div[@class='lls-submenu__title']/span")
    public WebElementFacade products;
    @FindBy(xpath= "//span[text()='Product List']")
    public WebElementFacade List;
    @FindBy(xpath= "//div[@class='btn-container flex-end']/div/button")
    public WebElementFacade addDrop;
    @FindBy(xpath= "//input[@autocomplete='off'=1]")
    public WebElementFacade name;
    @FindBy(xpath= "//div[contains(text(), 'Core product code')]/parent::label/following-sibling::div//input")
    public WebElementFacade code;
    @FindBy(xpath= "//label[contains(text(), 'Product Type')]/following-sibling::div//input/following-sibling::span")
    public WebElementFacade Type;
    @FindBy(xpath= "//span[text()='Post Acceptance']")
    public WebElementFacade postAcc;
    @FindBy(xpath= "//input[@placeholder='Start date']")
    public WebElementFacade start;
    @FindBy(xpath= "//input[@placeholder='End date']")
    public WebElementFacade end;
    @FindBy(xpath= "//label[contains(text(), 'Underlying Docs Status')]/following-sibling::div//input/following-sibling::span")
    public WebElementFacade Docs;
    @FindBy(xpath= "//span[text()='Accepted']")
    public WebElementFacade Accepted;
    @FindBy(xpath= "//label[contains(text(), 'Interest Paid By')]/following-sibling::div//input/following-sibling::span")
    public WebElementFacade Paid;
    @FindBy(xpath= "//span[text()='The Seller Pays Interest']")
    public WebElementFacade seller;
    @FindBy(xpath= "//label[contains(text(), 'Interest Collected')]/following-sibling::div//input/following-sibling::span")
    public WebElementFacade colletced;
    @FindBy(xpath= "//span[text()='Discount']")
    public WebElementFacade discount;
    @FindBy(xpath= "//label[contains(text(), 'Repayment Mode')]/following-sibling::div//input/following-sibling::span")
    public WebElementFacade Repayment;
    @FindBy(xpath= "//span[text()='Full Repayment']")
    public WebElementFacade FULL;
    @FindBy(xpath= "//div[contains(text(), '   Financing Ratio（p.a.）')]/parent::label/following-sibling::div//input")
    public WebElementFacade Ratio;
    @FindBy(xpath= "//label[contains(text(),'Recourse Term')]/following-sibling::div//input/following-sibling::span")
    public WebElementFacade Term;
    @FindBy(xpath= "//span[text()='Without Recourse']")
    public WebElementFacade Without;
    @FindBy(xpath= "//label[contains(text(),'Need Buyer IPU')]/following-sibling::div//input/following-sibling::span")
    public WebElementFacade IPU;
    @FindBy(xpath= "//body/div[2]//span[text()='N']")
    public WebElementFacade oneN;
    @FindBy(xpath= "//label[contains(text(),'Buyer MOU')]/following-sibling::div//input/following-sibling::span")
    public WebElementFacade MOU;
    @FindBy(xpath= "//body/div[2]//span[text()='N']")
    public WebElementFacade twoN;
    @FindBy(xpath= "//label[contains(text(),'Limit Allocation')]/following-sibling::div//input/following-sibling::span")
    public WebElementFacade Limit;
    @FindBy(xpath= "//span[text()='Both Supplier's and Buyer's']")
    public WebElementFacade Both;
    @FindBy(xpath= "//div[@class='btn-container center']/div[3]/button/span")
    public WebElementFacade submit;




}






