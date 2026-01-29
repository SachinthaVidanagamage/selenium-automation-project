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
public void methodForRegister() throws InterruptedException {

    Thread.sleep(10000);
    driver.findElement(By.id("newUser")).click();
    driver.findElement(By.id("firstname")).sendKeys("Sachintha");
    driver.findElement(By.id("lastname")).sendKeys("Vidanagamage");
    driver.findElement(By.id("userName")).sendKeys("sachinthavida");
    driver.findElement(By.id("password")).sendKeys("Sachintha@123");
    Thread.sleep(5000);
    driver.findElement(By.id("gotologin")).click();

    driver.findElement(By.id("userName")).sendKeys("sachinthavida");
    driver.findElement(By.id("password")).sendKeys("Sachintha@123");
    Thread.sleep(8000);
    driver.findElement(By.id("login")).click();


}



@AfterClass
    public void afterClassMethod() throws InterruptedException {
//    Thread.sleep(4000);
//    driver.quit();
}



}
