package screenshot;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScreenshot {

    @Test
    public void search() throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.aliexpress.com/");


        driver.findElement(By.className("search--keyword--15P08Ji"))
                .sendKeys("Blouse" + Keys.ENTER);

        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        // Save to your folder
        File destination = new File("C:\\Users\\HP\\Desktop\\battory\\aliexpress_search.png");
        Files.copy(source.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);

        driver.quit();
    }
}
