import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LocatosUse {


    @Test
    public void option3() throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        //open website ex like google, w3 school, ali express
        driver.get("https://opensource-demo.orangehrmlive.com");
        Thread.sleep(3000);
        // 2. Enter username

driver.findElement(By.name("username")).sendKeys("Admin");
        // 3. Enter password
        driver.findElement(By.name("password")).sendKeys("admin123");

        // 4. Click login button
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        Thread.sleep(30000);
        // Click Admin button

driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']//span[1]")).click();
//        driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']//span[1]")).click();
        driver.close();
    }

}
