package com.hsbc.cmb.hk.dbb.glue.baidu;

import com.hsbc.cmb.hk.dbb.steps.baidu.baidu_step;
import  cucumber.api.java.en.Given;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;


public class baidu_glue {

    @ManagedPages
    public Pages pages;

    @Steps
    private baidu_step baidu_steps;
    public static String envTag;

//@Given("^logon \"([^\"]*)\" onboarding custom portal$")
//    public void click() {
//
//        }

//}

    @Given("^logon \"([^\"]*)\" USO test system page$")
    public void logon_onboarding_custom_portal(String envName) {
        envTag = envName;
        if (!envName.isEmpty()) {
            baidu_steps.open_the_first_dbb_logon_page(envName);
            baidu_steps.enter_Organisation_ID("123456");
        }

    }
}