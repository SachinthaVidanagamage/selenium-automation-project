package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadAndDownload {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/upload-download");

    }

    @Test(priority = 0)
    public void downloadMethod() throws InterruptedException {
     driver.findElement(By.id("downloadButton")).click();
        Thread.sleep(5000);

    }
    @Test(priority = 2)
    public void uploadMethod() throws InterruptedException {
        driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\HP\\Downloads\\sampleFile (1).jpeg");
        Thread.sleep(5000);
    }
@AfterMethod
    public void afterMethod(){
        driver.close();
    }
}

