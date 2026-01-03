package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Links {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/links");
    }

    @Test
    public void openNewTabMethod(){
        driver.findElement(By.id("simpleLink")).click();

    }
}
