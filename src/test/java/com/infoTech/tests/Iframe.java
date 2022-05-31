package com.infoTech.tests;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Iframe extends TestBase {

    @Test
    public void iframeTest1() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/iframe");

        driver.switchTo().frame(0);
        WebElement paragraf = driver.findElement(By.xpath("//p"));
        paragraf.clear();
        Thread.sleep(2000);
        paragraf.sendKeys("index ile selamlama");

    }

    @Test
    public void iframeTest2() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/iframe");

        driver.switchTo().frame("mce_0_ifr");
        WebElement paragraf = driver.findElement(By.xpath("//p"));
        paragraf.clear();
        Thread.sleep(2000);
        paragraf.sendKeys("id value ile selamlama");


    }
    @Test
    public void iframeTest3() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/iframe");
        Thread.sleep(3000);
        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframe);
        WebElement paragraf = driver.findElement(By.xpath("//p"));
        paragraf.clear();
        paragraf.sendKeys("id ve value ile selamlama");

    }
    @Test
    public void iframeTest4() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/iframe");

        driver.switchTo().frame(0);
        WebElement paragraf = driver.findElement(By.xpath("//p"));
        paragraf.clear();
        Thread.sleep(2000);
        paragraf.sendKeys("index ile selamlama");
        driver.switchTo().defaultContent();
        WebElement button = driver.findElement(By.partialLinkText("Elemental Selenium"));
        button.click();

    }
}