package setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class setUpSelenium2 {
@Test
    public void option2(){
        WebDriverManager.chromedriver().setup();
        // Create WebDriver instance
        WebDriver driver = new ChromeDriver();
        // Open w3school
//        driver.get("https://www.w3schools.com/");
    driver.get("https://www.aliexpress.com/");



       // driver.findElement(By.id("search2")).sendKeys("HTML"+ Keys.ENTER);
   // driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[1]")).sendKeys("HTML"+ Keys.ENTER);
   // driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div/div[1]/div/form/input")).sendKeys("HTML"+ Keys.ENTER);
   // driver.findElement(By.id("navbtn_tutorials")).click();
    //driver.findElement(By.className("search--keyword--15P08Ji")).sendKeys("hp"+ Keys.ENTER);
    driver.findElement(By.name("searchWords")).sendKeys("dell" + Keys.ENTER);



}

}




