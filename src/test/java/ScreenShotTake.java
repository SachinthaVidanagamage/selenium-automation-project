import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ScreenShotTake {

        WebDriver driver;
        @Test
        public void screenShot() throws IOException {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            //open website ex like google, w3 school, ali express
            driver.get("https://www.aliexpress.com/");

            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            // Save to your folder
            File destination = new File("C:\\Users\\HP\\Desktop\\battory\\aliexpressnew.png");
            Files.copy(source.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);


        }


}
