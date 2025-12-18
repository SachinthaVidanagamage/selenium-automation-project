package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class Buttons {

    WebDriver driver;
public void methodForButtons() throws InterruptedException {
driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoqa.com/buttons");
Thread.sleep(3000);

//To double-click in Selenium, you must use the Actions class
    WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
    Actions actions = new Actions(driver);
    actions.doubleClick(doubleClickButton).perform();

    // right click
    WebElement element = driver.findElement(By.id("rightClickBtn"));
    actions.contextClick(element).perform();

    // Click the button with ID "n3Rn8"
    driver.findElement(By.xpath("//button[@id='eOsrB']")).click();
//    driver.findElement(By.id("n3Rn8")).click();




}
}
