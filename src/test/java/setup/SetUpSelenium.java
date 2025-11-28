package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SetUpSelenium {
    WebDriver driver;
    @BeforeMethod
    public void option3(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver= new ChromeDriver();

    }
    @Test
    public  void option1() throws InterruptedException {
        //setup path
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        // Create WebDriver instance
        //       WebDriver is an interface
        // Chromedriver is a class
        //WebDriver driver= new ChromeDriver();
        // Open Google

        driver.get("https://www.kapruka.com/");
        Thread.sleep(30000);

        //close browser
        //driver.quit();

       // driver.close();

    }
@Test
    public void option2() throws InterruptedException {
        //setup path
       // System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        // Create WebDriver instance
        //       WebDriver is an interface
        // Chromedriver is a class
        //WebDriver driver= new ChromeDriver();
        // Open Google
        driver.get("https://www.w3schools.com/");
        Thread.sleep(30000);

    }
    @AfterMethod
    public void option4(){
        driver.close();
    }
}
