package com.cydeo.tests.week17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vytrack.com");
        driver.findElement(By.cssSelector("#top-menu #menu-item-849")).click();
        driver.findElement(By.id("prependedInput")).sendKeys("User1");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String title = driver.getTitle();

       if (title.equals("Dashboard")){
           System.out.println("Pass");
       }else{
           System.out.println("Fail");
       }

    }

}
