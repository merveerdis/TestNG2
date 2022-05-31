package com.infoTech.tests;

import com.infoTech.utilities.Driver;
import org.testng.annotations.Test;

public class test {

    @Test
    public void test(){


        Driver.getDriver().get("https://google.com");
        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().getTitle();
    }
}
