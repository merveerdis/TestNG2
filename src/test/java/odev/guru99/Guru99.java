package odev.guru99;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



    public class Guru99 extends TestBase {
        @Test
        public void amazonKayitSayfasi() throws InterruptedException {
            driver.get("https://demo.guru99.com/insurance/v1/index.php");

            Thread.sleep(3000);
            driver.switchTo().frame(6);
            WebElement cerez=driver.findElement(By.xpath("//*[.='Alle akzeptieren']"));
            cerez.click();

            WebElement register = driver.findElement(By.xpath("//*[.='Register']"));
            register.click();

            WebElement cinsiyet1 = driver.findElement(By.id("user_title"));
            cinsiyet1.click();

            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.ARROW_DOWN).perform();

            WebElement firstName = driver.findElement(By.id("user_firstname"));
            firstName.sendKeys("Merve");

            WebElement surname = driver.findElement(By.id("user_surname"));
            surname.sendKeys("Er");

            WebElement phone = driver.findElement(By.id("user_phone"));
            phone.sendKeys("111-1234567");

            WebElement dogumYili = driver.findElement(By.id("user_dateofbirth_1i"));
            dogumYili.sendKeys("1989");

            WebElement dogumAyi = driver.findElement(By.id("user_dateofbirth_2i"));
            dogumAyi.sendKeys("February");

            WebElement dogumGunu = driver.findElement(By.id("user_dateofbirth_3i"));
            dogumGunu.sendKeys("17");

            WebElement pro = driver.findElement(By.id("licencetype_f"));
            pro.click();

            WebElement year = driver.findElement(By.id("user_licenceperiod"));
            year.sendKeys("7");

            WebElement occupation = driver.findElement(By.id("user_occupation_id"));
            occupation.sendKeys("Lawyer");

            WebElement street = driver.findElement(By.id("user_address_attributes_street"));
            street.sendKeys("König");

            WebElement city = driver.findElement(By.id("user_address_attributes_city"));
            city.sendKeys("Bad Wünnenberg");

            WebElement country = driver.findElement(By.id("user_address_attributes_county"));
            country.sendKeys("Deutschland");

            WebElement postcode = driver.findElement(By.id("user_address_attributes_postcode"));
            postcode.sendKeys("33181");

            WebElement email = driver.findElement(By.id("user_user_detail_attributes_email"));
            email.sendKeys("mer@gmail.com");

            WebElement password = driver.findElement(By.id("user_user_detail_attributes_password"));
            password.sendKeys("13579");

            WebElement password_confirmation = driver.findElement(By.id("user_user_detail_attributes_password_confirmation"));
            password_confirmation.sendKeys("13579");

          //  WebElement create = driver.findElement(By.name("submit"));
            //create.click();


        }
    }