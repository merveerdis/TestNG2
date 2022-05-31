package com.infoTech.tests;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KlavyeTuslari extends TestBase {

    @Test
    public void asagiYukari(){

        driver.get("https://amazon.com");
        Actions actions = new Actions(driver);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.END).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.ARROW_RIGHT).perform();
        actions.sendKeys(Keys.ARROW_LEFT).perform();

    }
    @Test
    public void kucukBuyukYazma() throws InterruptedException {
        driver.get("http://google.com");

        WebElement guvenlikDuvari = driver.findElement(By.xpath("//*[.='Ich stimme zu']"));
        Thread.sleep(3000);
        guvenlikDuvari.click();

        WebElement arama = driver.findElement(By.name("q"));
        Actions actions = new Actions(driver);


        actions.moveToElement(arama).click()
                .keyDown(Keys.SHIFT).sendKeys("mErHaBa ")
                .keyUp(Keys.SHIFT).sendKeys("NASILSINIZ")
             //  .keyDown(Keys.ENTER) //calismadi
               // .keyUp(Keys.ENTER)
                .perform();
        Thread.sleep(3000);


    }
}
