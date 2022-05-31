package com.infoTech.tests;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Wait extends TestBase {

    @Test
    public void implicitlyWait(){
     driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        WebElement remove = driver.findElement((By.xpath("//*[.='Remove']")));
        remove.click();

        WebElement element = driver.findElement(By.xpath("//*[.='Add']"));
        element.click();

        Assert.assertTrue(element.isDisplayed());

        /*
        genellikle TestBase class'inda kullanilir
        -driver'a verecegimiz 1 komut yeterli
        -tiklanabilir,gorunebilir(yani sart belirtmeden kullaniyoruz)
        -kullanma amacimiz,internet,bilgisayar ve calistigimiz sayfanin performasindandir
        -belirttigimiz sure icerisinde elementi bulamassa nosuchElement hatasi verir
        -elementi bulur bulmaz belirledigimiz sureyi beklemeden kodlari calistirmaya devam eder
        -bu komut tum elementler icin.
        */

    }
        @Test
    public void explicityWait(){

            driver.get("http://the-internet.herokuapp.com/dynamic_controls");

            WebDriverWait wait = new WebDriverWait(driver,30);

            WebElement remove = driver.findElement((By.xpath("//*[.='Remove']")));
            remove.click();

            WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));

            System.out.println(message.getText());

        }
         /*
        Thread.sleep
        *static bir bekleme var
        1-10 sn bekle dediginiz zaman 10 sn bekler,elementler yuklense dahi "inat eder" beklemeye devam eder
        2-herhangi bir kosul sunamiyoruz

        Explicit wait
        *Dinamik bir calismasi vardir
        -webElementi bulurbulmaz kodlari calistirmaya devam eder
        -kosul ekleyebiliyoruz.
         */
}
