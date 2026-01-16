package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TextBox {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Instead of thread.sleep()
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/text-box");
    }

    @Test(priority = 0)
    public void method1() {
        driver.findElement(By.id("userName")).sendKeys("Sachintha Vidanagamage");
        driver.findElement(By.id("userEmail")).sendKeys("sachinthavida@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("NO/126/A,Parawahera,Kekanadura,Matara");
        driver.findElement(By.id("permanentAddress")).sendKeys("No 47, kotuwegoda, Matara");
        driver.findElement(By.id("submit")).click();


    }

    @Test(priority = 1)
    public void method2() {
        driver.findElement(By.id("permanentAddress")).sendKeys("No 47, kotuwegoda, Matara");


    }



    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
