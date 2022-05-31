package com.infoTech.tests;
import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import java.nio.file.Files;
import java.nio.file.Paths;
public class fileDowland extends TestBase {
    @Test
    public void dosyaVarmiYokmu(){
        //bir dosyanin var olup olmadigini konr=trol etmek icin
        //bulunan klasorun yolunu(path)verir
        System.out.println(System.getProperty("user.dir"));//E:\IT\IT PROGRAM PROJE\SELENIUM\infoTechTestNG_2
        //Kullanici ana klasorune ulasmak icin
        System.out.println(System.getProperty("user.home")); //C:\Users\User
        String kullaniciDosyaYolu=System.getProperty("user.dir");
        //E:\IT\IT PROGRAM PROJE\SELENIUM\infoTechTestNG_2
        System.out.println("Kullanici Dosya Yolu => "+kullaniciDosyaYolu);
        //aradigimiz dosyanin yolunu yaziyoruz
        String pomXmlDosyaYolu=kullaniciDosyaYolu+"/pom.xml";
        boolean varMI= Files.exists(Paths.get(pomXmlDosyaYolu));
        System.out.println(varMI);
        Assert.assertTrue(varMI);
    }
    @Test
    public void dosyaUplade() throws InterruptedException {
        //bilgisayardan internet sitesine dosya yukleme
        /*
        Selenium,windows,mac gibi isletim sistemlerine erisemez.Bu yuzden manuel olarak dosya secimi yapamaz.
        Bu engeli asmak icin bilgisayarimizdaki dosya yolunu(Path) kullanarak yukleme islemi gerceklestirir
         */
        driver.get("http://the-internet.herokuapp.com/upload");
        WebElement dosyaSecmButonu=driver.findElement(By.id("file-upload"));
        dosyaSecmButonu.sendKeys("C:\\Users\\User\\Desktop\\foto\\Hollanda.jpg");
        Thread.sleep(2000);
        WebElement uplade=driver.findElement(By.id("file-submit"));
        uplade.submit();
        WebElement fileUpladeYazisi=driver.findElement(By.tagName("h3"));
        Assert.assertTrue(fileUpladeYazisi.isDisplayed());
    }
    @Test
    public void dosyaDowland() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/download");
        WebElement recipe=driver.findElement(By.partialLinkText("recipe.txt"));
        recipe.click();
        Thread.sleep(4000);
        boolean varMI= Files.exists(Paths.get("C:/Users/User/Downloads/recipe.txt"));
        System.out.println(varMI);
        Thread.sleep(4000);
        Assert.assertTrue(varMI);
    }
}