package com.hsbc.cmb.hk.dbb.pages.baidu;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class baidu_page  extends PageObject {
    @FindBy(xpath= "//*[@class='ico1 i3']")
            public WebElementFacade ruanjian;
    @FindBy(xpath = "//input[@id='searchV']")
            public WebElementFacade tianxie ;
    @FindBy(xpath = "//*[@id='search']")
            public WebElementFacade sousuo ;
    @FindBy(xpath = "//*[@class='SCLSSLLTit']")
    public WebElementFacade pro6 ;

}
