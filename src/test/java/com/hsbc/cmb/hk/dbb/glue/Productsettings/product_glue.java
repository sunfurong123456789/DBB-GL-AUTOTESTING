package com.hsbc.cmb.hk.dbb.glue.Productsettings;

import com.hsbc.cmb.hk.dbb.steps.ProductSettings.product_step;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
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

}
