package com.infoTech.tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.concurrent.TimeUnit;
public class SoftAssertTest {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void test1(){
        driver.get("http://amazon.com");
        String baslik= driver.getTitle();
        System.out.println(baslik);
        SoftAssert softAssert=new SoftAssert();
//
//        Assert.assertEquals();
//        Assert.assertTrue();
//        Assert.assertFalse();
        softAssert.assertTrue(baslik.contains("fals"));
        softAssert.assertEquals("Amazon.com. Spend less.Car Smile more.",baslik);
        softAssert.assertFalse(baslik.contains("Car"));
        //yukaridaki tum testlerimizin doru olup olmadigini assert(dogrulamasini)yapiyoruz.
        softAssert.assertAll();
    }
}

