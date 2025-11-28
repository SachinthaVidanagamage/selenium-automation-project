
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

public class ChatGpt {

    public void takeScreenshot(String fileName) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            File dest = new File("C:\\Users\\HP\\Desktop\\battory\\" + fileName + ".png");

            // Create folder if it doesn't exist
            dest.getParentFile().mkdirs();

            Files.copy(src.toPath(), dest.toPath());
            System.out.println("Screenshot saved: " + dest.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Error taking screenshot: " + e.getMessage());
        }
    }



    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        driver = new ChromeDriver(); // ✅ assign to global variable
        driver.manage().window().maximize();
        driver.get("https://www.aliexpress.com/");
        Thread.sleep(3000);
    }

    @AfterMethod
    public void afterMethod() {
        if (driver != null) {
            driver.quit(); // safer
        }
    }

    @Test
    public void methodId() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("search-words")).sendKeys("dell" + Keys.ENTER);
        takeScreenshot("methodId");
    }

    @Test
    public void methodName() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.name("searchWords")).sendKeys("mouse" + Keys.ENTER);
    }

    @Test
    public void methodClassName() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.className("search--keyword--15P08Ji")).sendKeys("hp" + Keys.ENTER);
    }

    @Test
    public void methodTagName()  {

        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        WebElement fifthInput = inputs.get(1);
        fifthInput.sendKeys("Phone");
    }


}
