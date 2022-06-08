package com.infoTech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class newGooglePage {
    //Bos bir webdriver degiskeni olusturuyoruz
    WebDriver driver;

    //Constructor olusturuyoruz ,1 tane parametresi var
    public newGooglePage(WebDriver driver) {
        /*
        parametre olarak gelen driver nesnesini bu class'ta olusturdugumuz driver nesnemize esitledik.
        Bu sekilde yeniden bos bir driver olusturmak yerine zaten halihazirdaki kullandigimiz driver'i bu
        nesneye esitlemis olacagiz.
         */
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[.='Ich stimme zu']")
    public WebElement guvenlikDuvari;
    @FindBy(name = "q")
    public WebElement aramaKutusu;
    @FindBy(tagName = "a")
    public List<WebElement> tumLinkler;
}
