package odev;

import com.infoTech.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Ornek_AmazonKayitSayfasi extends TestBase {


    @Test
    public void test1() throws InterruptedException {
        driver.get("http://amazon.com");
        String baslik = driver.getTitle();
        System.out.println(baslik);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Amazon.com. Spend less.Car Smile more.", baslik);

        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        WebElement kayit = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
        Thread.sleep(3000);
        actions.moveToElement(kayit).perform();

        WebElement Tikla = driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
        actions.doubleClick(Tikla).perform();

        WebElement Tikla2 = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
        Thread.sleep(3000);
        actions.doubleClick(Tikla2).perform();

        softAssert.assertEquals("Amazon.com. Spend less.Car Smile more.", baslik);
    }
        @Test(dependsOnMethods = "test1")
        public void test2 () throws InterruptedException {

            WebElement isim = driver.findElement(By.id("ap_customer_name"));
            isim.sendKeys("merve");

            WebElement email = driver.findElement(By.id("ap_email"));
            email.sendKeys("merve@outlook.com");

            WebElement parola = driver.findElement(By.id("ap_password"));
            parola.sendKeys("password");

            WebElement parolatkr = driver.findElement(By.id("ap_password_check"));
            parolatkr.sendKeys("password");
            Thread.sleep(3000);

            Actions actions = new Actions(driver);
            WebElement Tikla3 = driver.findElement(By.xpath("//input[@id='continue']"));
            Thread.sleep(3000);
            actions.doubleClick(Tikla3).perform();

            String baslik = driver.getTitle();
            System.out.println(baslik);
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertEquals("Amazon.com. Spend less.Car Smile more.", baslik);

        }
}