package fix;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class FixCode {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //open website ex like google, w3 school, ali express
        driver.get("https://www.aliexpress.com/");
        Thread.sleep(3000);
    }
    @Test
    public void newMethod() throws IOException {
        driver.findElement(By.name("searchWords")).sendKeys("mouse" + Keys.ENTER);
        //take screenshot
        TakesScreenshot ts = (TakesScreenshot)driver;
        File sourse =(File)ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\HP\\IdeaProjects\\questionsproject\\src\\test\\java\\screenshot\\mousepic.png");
        FileUtils.copyFile(sourse, destination);


    }




}
