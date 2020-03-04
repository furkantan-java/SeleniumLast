package com.automation.tests.officeHours;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class SeleniumOH1 {

    /*
    -Iterator
        *List, Set, Map, and other types of collections can use Iterator class to iterate over that collection
        *List has indexes (for i, for each, while, Iterator)
        *Map (for each, Iterator - to loop through keys)

    -Basic Selenium Navigation

     */

    public static void main(String[] args) {

        // Create arraylist of Strings - iterator over it

        ArrayList<String> keysToSearch = new ArrayList<>();
        keysToSearch.add("fruits");
        keysToSearch.add("veggies");
        keysToSearch.add("berries");
        Iterator <String> iterator = keysToSearch.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //add * to each string in list before printing

        Iterator <String> iterator1 = keysToSearch.iterator();
        while (iterator1.hasNext()){
            String fruit = (String) iterator1.next();
            System.out.println(fruit);
            System.out.println("*"+fruit);
        }

        //create map with <String, String>

        HashMap<String,String> personalInfo = new HashMap<>();
        personalInfo.put("name","Bryan");
        personalInfo.put("student id", "53221654");
        personalInfo.put("major","computer science");

        Iterator<String>mapIterator = personalInfo.keySet().iterator();
        while(mapIterator.hasNext()){
            String key = mapIterator.next();
            System.out.println(key + ":" + personalInfo.get(key));
        }

        //========================
        //SELENIUM
        /*
            id - unique (it is not always available)
            class - classname
            name
            tag - every element will have a tag

            will only work with the link
            linkedtext
            partial linkedtext

            locator that is using html to locate (syntax)
            css
            xpath
         */
        WebDriverManager.chromedriver().setup();

        WebDriver drive = new ChromeDriver();

        drive.get("http://etsy.com");

        WebElement searchBar = drive.findElement(By.id("global-enhancements-search-query"));
        //findElement() -> returns WebElement
        //as param we put By.locator
        //                          (id,name,classname,class,....)


    }
}
