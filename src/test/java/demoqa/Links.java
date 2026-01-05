package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
        driver.findElement(By.id("dynamicLink")).click();


    }
@Test
    public void newMethodForApiCall(){
        //click  created link
        driver.findElement(By.id("created")).click();

        // Capture response

//        WebElement response = driver.findElement(By.id("linkResponse"));
//        String responseText = response.getText();
//
//// Print response
//        System.out.println("API Response: " + responseText);
//
//// Validate status code and message
//        Assert.assertTrue(responseText.contains("201"));
//        Assert.assertTrue(responseText.contains("Created"));

    }
}
