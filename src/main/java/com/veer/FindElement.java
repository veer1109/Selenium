package com.veer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElement {
    public static void main(String []arg)
    {
        System.setProperty("webdriver.gecko.driver","C:\\ChromeDriver\\geckodriver.exe");
        WebDriver _driver = new FirefoxDriver();
        _driver.get("https://www.google.com");
        _driver.findElement(By.id("lst-ib")).sendKeys("Veerkumar patil");
        _driver.findElement(By.name("btnK")).submit();
        _driver.close();

    }
}
