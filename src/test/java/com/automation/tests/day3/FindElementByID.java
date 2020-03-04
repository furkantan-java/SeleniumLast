package com.automation.tests.day3;

import com.automation.utulities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByID {
    public static void main(String[] args) throws InterruptedException {
        //WebDriver driver = DriverFactory.createADriver("chrome");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/login");
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        Thread.sleep(3000);
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword");
        Thread.sleep(3000);
        driver.findElement(By.id("wooden_spoon")).click();
        Thread.sleep(3000);

        String expected = "Welcome to the Secure Area. When you are done click logout below.";
        String actual = driver.findElement(By.tagName("h4")).getText();

        if(expected.equals(actual)){
            System.out.println("TEST PASSED!!!!!");
        } else {
            System.out.println("TEST FAILED!!!!!");
        }


        String href = driver.findElement(By.partialLinkText("Logout")).getAttribute("href");
        String className = driver.findElement(By.partialLinkText("Logout")).getAttribute("class");

        System.out.println(href);
        System.out.println(className);
        driver.findElement(By.partialLinkText("Logout")).click();
        Thread.sleep(3000);


        String expectedLogout = "You logged out of the secure area!";
        String actualLogout = driver.findElement(By.id("flash-messages")).getText();

        if(expected.equals(actual)){
            System.out.println("2nd TEST PASSED!!!");
        } else {
            System.out.println("2nd TEST FAILED");
        }
        driver.findElement(By.id("wooden_spoon")).click();
        Thread.sleep(3000);

        WebElement invalid = driver.findElement(By.id("flash-messages"));
        System.out.println(invalid.getText());
        Thread.sleep(3000);
        driver.quit();
    }
}
