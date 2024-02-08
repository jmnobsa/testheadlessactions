package com.bancodebogota;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest 
{
    WebDriver driver;

    @Test
    public void verifyLoad() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);
        long start = System.currentTimeMillis();
        driver.get("https://usuariosenlinea.bancodebogota.com.co");
        long finish = System.currentTimeMillis();
        long totalTime = finish - start; 
        System.out.println("Total Time for page load - "+totalTime);
        System.out.println("Title is: " + driver.getTitle());
        Assert.assertTrue(totalTime < 1000);
        driver.quit();
    }
}
