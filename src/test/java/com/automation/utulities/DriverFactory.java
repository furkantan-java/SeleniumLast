package com.automation.utulities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    /**
     * This method return webdrşver ıbject based on browser type
     * If you want to use chrome browseri just provide chrome as a parameter
     * @param browserName
     * @return WebDriver object
     */

    public static WebDriver createADriver(String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }

    }
}
