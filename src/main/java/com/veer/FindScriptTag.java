package com.veer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindScriptTag {
    public static void main(String []arg) {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        WebDriver _driver = new ChromeDriver();
        _driver.navigate().to("https://staging.villaplus.com/destinations/villas-in-spain/villas-in-mainland-spain/costa-del-sol/san-pedro-de-alcantara/villa-altavista-sol");

        List<WebElement> tags = _driver.findElements(By.tagName("script"));

        for (WebElement t: tags)
        {

            String htmlCode = (String) ((JavascriptExecutor) _driver).executeScript("return arguments[0].innerHTML;", t);
            if(htmlCode.contains("GTMdataLayer")) {
                System.out.println(" The tags is ");
                System.out.println(htmlCode);
                System.out.println("__________________________________");
            }
        }
    }
}
