package BookStoreApplicationDEMOQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;

public class Register {
WebDriver driver;


@BeforeMethod
public void beforeMethod(){
    driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoqa.com/login");
}
@Test
public void methodForRegister(){
    driver.findElement(By.id("newUser")).click();
    driver.findElement(By.id("firstname")).sendKeys("Sachintha");

}



@AfterClass
    public void afterClassMethod() throws InterruptedException {
    Thread.sleep(2000);
    driver.quit();
}



}
