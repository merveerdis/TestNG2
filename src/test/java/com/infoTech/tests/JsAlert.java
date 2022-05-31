package com.infoTech.tests;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JsAlert extends TestBase {

    @Test
    public void jSAlert() throws InterruptedException {
       // driver.get("https://google.com");
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement button = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        button.click();

        String alertEsaji = driver.switchTo().alert().getText();
        System.out.println(alertEsaji);
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }
    @Test
    public void jSConfirm() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement button = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        button.click();

        String mesaj = driver.switchTo().alert().getText();
        System.out.println(mesaj);
        driver.switchTo().alert().dismiss();
        //driver.switchTo().alert().accept();

    }
    @Test
    public void jSConfirmSend() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement button = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        button.click();

        String mesaj = driver.switchTo().alert().getText();
        System.out.println(mesaj);
        driver.switchTo().alert().sendKeys("Merhaba TestNG");
        driver.switchTo().alert().accept();
    }

    }
