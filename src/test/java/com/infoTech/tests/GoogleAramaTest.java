package com.infoTech.tests;

import com.infoTech.pages.GooglePage;
import com.infoTech.utilities.ConfigurationReader;
import com.infoTech.utilities.Driver;
import com.infoTech.utilities.TestBaseFinal;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleAramaTest extends TestBaseFinal {

    @Test
    public void test1() throws InterruptedException {

        Driver.getDriver().get(ConfigurationReader.getProperty("google_link"));

        GooglePage page = new GooglePage(driver);

        Thread.sleep(3000);

        page.guvenlikDuvari.click();
        page.aramaKutusu.sendKeys(ConfigurationReader.getProperty("google_arama"));
        boolean linkVarmi = false;
        for (WebElement w:page.tumLinkler){
            if(w.getText().contains("infotech")){
                linkVarmi=true;
                break;
            }
        }
        Assert.assertTrue(linkVarmi);
    }
}
