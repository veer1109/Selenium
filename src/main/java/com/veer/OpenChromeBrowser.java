package com.veer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
    public  static  void main(String []arg)
    {
        System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
        WebDriver _driver = new ChromeDriver();
        _driver.navigate().to("https://www.facebook.com");
    }
}
