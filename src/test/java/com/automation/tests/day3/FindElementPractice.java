package com.automation.tests.day3;

import com.automation.utulities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElementPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverFactory.createADriver("Chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullName = driver.findElement(By.name("full_name"));
        fullName.sendKeys("Mister Twister");
        Thread.sleep(3000);
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("sdet@cybertek.com");
        Thread.sleep(3000);
        WebElement signUp = driver.findElement(By.name("wooden_spoon"));
        signUp.submit();

        Thread.sleep(3000);
        String expected = "Thank you for signing up. Click the button below to return to the home page.";
        WebElement text = driver.findElement(By.className("subheader"));
        String actual = text.getText();

        if(expected.equals(actual)){
            System.out.println("TEST PASSED!!!");
        } else {
            System.out.println("TEST FAILED!!!");
        }



        driver.close();
    }
}
