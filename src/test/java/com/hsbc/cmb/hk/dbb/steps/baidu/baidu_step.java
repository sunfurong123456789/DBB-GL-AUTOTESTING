package com.hsbc.cmb.hk.dbb.steps.baidu;


import com.hsbc.cmb.hk.dbb.pages.baidu.baidu_page;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import com.hsbc.cmb.hk.dbb.utils.CommonUtil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.hsbc.cmb.hk.dbb.pages.CBSOnline.logon_page;

public class baidu_step {
    private baidu_page baiduPage;
    private BDDUtil bddUtil;

    @Step
    public void open_the_first_dbb_logon_page(String envName) {
        String logonUrl = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".webdriver.base.url");
       baiduPage.openUrl(logonUrl);

    }

    @Step

    public void enter_Organisation_ID(String value){
       baiduPage.ruanjian.click();
        baiduPage.tianxie.sendKeys("IDE");
        baiduPage.sousuo.click();
        baiduPage.pro6.click();
        bddUtil.sleep(5);
    }


}
