package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        Thread.sleep(2000);
        //By.name("q") --> name = "q"
        WebElement search = driver.findElement(By.name("q"));
//        search.sendKeys("Java", Keys.ENTER);
//        Thread.sleep(2000);
        Thread.sleep(2000);
        search.sendKeys("J");
        Thread.sleep(2000);
        search.sendKeys("a");
        Thread.sleep(2000);
        search.sendKeys("v");
        Thread.sleep(2000);
        search.sendKeys("a", Keys.ENTER);
        Thread.sleep(2000);
        driver.quit();

    }
}
