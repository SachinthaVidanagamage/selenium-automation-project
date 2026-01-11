package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class LinksFixCode {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/links");
    }

    @Test
    public void openNewTabMethod() {

        String parentWindow = driver.getWindowHandle();

        // Click simple link
        driver.findElement(By.id("simpleLink")).click();

        // Switch to new tab
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
            }
        }

        // Validate new tab URL
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://demoqa.com/");

        // Close new tab and switch back
        driver.close();
        driver.switchTo().window(parentWindow);
    }

    @Test
    public void newMethodForApiCall() throws InterruptedException {

        // Click "Created" link (201 response)
        driver.findElement(By.id("created")).click();

        Thread.sleep(2000); // wait for response text

        WebElement responseText = driver.findElement(By.id("linkResponse"));

        // Validate response message
        Assert.assertTrue(responseText.getText().contains("201"),
                "Expected response code 201 not found");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
