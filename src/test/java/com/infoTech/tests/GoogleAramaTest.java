package com.infoTech.tests;

import com.infoTech.pages.GoogleAramaPage;
import com.infoTech.pages.GooglePage;
import com.infoTech.utilities.ConfigurationReader;
import com.infoTech.utilities.Driver;
import com.infoTech.utilities.TestBaseFinal;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleAramaTest extends TestBaseFinal {

    @Test
    public void test() throws InterruptedException {
        extentTest=extentReports.createTest("Google Arama","Google'da infotech aramasi yaptik");
        extentTest.info("Google sayfasina gittik");
        Driver.getDriver().get(ConfigurationReader.getProperty("google_link"));
        extentTest.info("Web Elementleri kullanmak icin nesne olusturduk");
        GoogleAramaPage googleAramaPage=new GoogleAramaPage();
        extentTest.info("WebElementlerin yuklenmesi icin bekleme yaptik");
        Thread.sleep(3000);
        extentTest.info("Guvenlik duvarini gectik");
        Thread.sleep(3000);
        googleAramaPage.googleGuvenlik.click();
        extentTest.info("Tekrar bekleme yaptik");
        Thread.sleep(3000);
        extentTest.info("Infotech aramasi yaptik");
        googleAramaPage.aramaKutusu.sendKeys("infotech Akademi"+ Keys.ENTER);
        extentTest.info("Tekrar bekleme yaptik");
        Thread.sleep(3000);
        extentTest.info("Tum linkleri aldik ve karsilastirdik");
        boolean linkVarmi=false;
        for(WebElement w: googleAramaPage.tumLinkler){
            if(w.getText().contains("infotech")){
                linkVarmi=true;
                break;
            }
        }
        extentTest.info("Assert islemi yap");
        Assert.assertTrue(linkVarmi);
        extentTest.info("Testimiz gecti");
        extentTest.pass("Testimiz PASSED!!!");
    }
}
