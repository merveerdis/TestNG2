package com.infoTech.tests;
import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AmazonKayitSayfasi extends TestBase {
    @Test
    public void amazonKayitSayfasi() throws InterruptedException {
        driver.get("https://amazon.com");
        Thread.sleep(3000);
        Actions action=new Actions(driver);
        WebElement element= driver.findElement(By.id("nav-link-accountList"));
        action.moveToElement(element).perform();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Start here.")).click();
        Assert.assertEquals(driver.getTitle(),"Amazon Registration");
    }
    @Test(dependsOnMethods ="amazonKayitSayfasi")
    public void bilgiler(){
        WebElement name=driver.findElement(By.id("ap_customer_name"));
        name.sendKeys("emre");
        driver.findElement(By.id("ap_email")).sendKeys("emreInfo@gmail.com");
        driver.findElement(By.id("ap_password")).sendKeys("222222");
        driver.findElement(By.id("ap_password_check")).sendKeys("222222");
        driver.findElement(By.id("continue")).submit();
    }
}
