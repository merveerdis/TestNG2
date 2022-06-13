package com.infoTech.crossbrowsertests;

import com.infoTech.pages.GcreddyPage;
import com.infoTech.utilities.ConfigurationReader;
import com.infoTech.utilities.TestBaseCross;
import org.testng.annotations.Test;

public class PositiveTest extends TestBaseCross {
    @Test
    public void giris(){

        driver.get(ConfigurationReader.getProperty("grcreddy_link"));
        GcreddyPage page=new GcreddyPage(driver);
        page.grcreddy_userName.sendKeys(ConfigurationReader.getProperty("gcreddy_userName"));
        page.grcreddy_password.sendKeys(ConfigurationReader.getProperty("gcreddy_passWord"));
        page.grcreddy_login.click();




    }
}
