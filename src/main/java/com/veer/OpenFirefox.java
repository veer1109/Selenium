package com.veer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {
    public static void main(String []args)
    {
        System.setProperty("webdriver.gecko.driver","C:\\\\ChromeDriver\\\\geckodriver.exe");
        WebDriver _driver = new FirefoxDriver();
        _driver.navigate().to("https://www.facebook.com");


    }

}
