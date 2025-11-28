package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SetUpSelenium3 {

    @Test
    public void option3(){
        WebDriver driver=new ChromeDriver();
        // Open Google
        driver.get("https://www.google.com");

    }
}


