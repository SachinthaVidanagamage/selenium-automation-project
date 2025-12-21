import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;


public class LocatorsPractice {



    WebDriver driver;
    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //open website ex like google, w3 school, ali express
        driver.get("https://www.aliexpress.com/");
        Thread.sleep(3000);
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

    @Test
    public void methodId()  {

        driver.findElement(By.id("search-words")).sendKeys("dell" + Keys.ENTER);

    }


    @Test
    public void methodName() throws IOException {

        driver.findElement(By.name("searchWords")).sendKeys("mouse" + Keys.ENTER);
        //take screenshot
        TakesScreenshot ts = (TakesScreenshot)driver;
        File sourse =(File)ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\HP\\IdeaProjects\\questionsproject\\src\\test\\java\\screenshot\\epic.png");
        FileUtils.copyFile(sourse, destination);


    }

    @Test
    public void methodClassName() {
        driver.findElement(By.className("search--keyword--15P08Ji")).sendKeys("hp" + Keys.ENTER);

    }

    @Test
    public void methodTagName() {
        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        // 1 is the second input tage in the htpml code..  it start form the o,1,2,3 like a array index
        WebElement fifthInput = inputs.get(1);  //1 means 2nd input tag the html code

        fifthInput.sendKeys("Phone");
}
@Test
public void methodXplath(){
//    driver.findElements(By.xpath("//input[@id='search-words']")).sendKeys("shirt" + Keys.ENTER);
    driver.findElement(By.xpath("//input[@id='search-words']")).sendKeys("shirt" + Keys.ENTER);
}

@Test
public void cssSelector(){
    driver.findElement(By.cssSelector("input[type='text']")).sendKeys("mouse");
}

@Test
public void  cssSelector2() throws IOException {
        driver.findElement(By.cssSelector("input[placeholder='Headsets']")).sendKeys("laptop");

    // Take a screenshot
// Cast the WebDriver instance (driver) to the TakesScreenshot interface
// because WebDriver itself does not directly have the getScreenshotAs() method.
// Only drivers that implement TakesScreenshot (like ChromeDriver) support it.
    TakesScreenshot ts = (TakesScreenshot) driver;

// Capture the screenshot and store it as a temporary file in memory.
// OutputType.FILE tells Selenium to return the screenshot as a File object.
    File source = ts.getScreenshotAs(OutputType.FILE);


// Save screenshot
// Create a File object that represents the final location where the screenshot
// will be saved on your computer.
    File destination = new File("C:\\Users\\HP\\IdeaProjects\\questionsproject\\src\\test\\java\\screenshot\\image.jpg");

// Copy the screenshot file (source) to the destination path.
// StandardCopyOption.REPLACE_EXISTING overwrites the file if it already exists.
    Files.copy(source.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
}


@Test
public void partiallinkText() throws InterruptedException {
    Thread.sleep(5000);
    driver.findElement(By.partialLinkText("Bundle deals"));

}
@Test
public void linkText(){
    driver.findElement(By.linkText("Bundle deals"));

}

    @Test
    public void partiallinkText2() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.partialLinkText("Bundle"));

    }
    @Test
    public void linkText2() throws InterruptedException {
        Thread.sleep(50000);
        driver.findElement(By.linkText("Bundle deals"));




    }

    @Test
    public void urlCheck() throws IOException {


//        driver.findElement(By.linkText( "Bundle deals" )).click();
        driver.findElement(By.linkText( "Bundle deals" )).click();

        String currentUrl = driver.getCurrentUrl();

Assert.assertEquals(currentUrl,"https://www.aliexpress.com/ssr/300000512/BundleDeals2?disableNav=YES&pha_manifest=ssr&_immersiveMode=true&businessCode=guide");
//Assert.assertEquals(currentUrl,"https://www.aliexpress.com/ssr/300000512/BundleDeals2?disableNav=YES&pha_manifest=ssr&_immersiveMode=true&businessCode=guide");




    }
@Test
    public  void checkUrl2() throws InterruptedException {
    Thread.sleep(5000);
    driver.findElement(By.linkText("Cart")).click();
//        String currentUrl = driver.getCurrentUrl();
//        Assert.assertEquals(currentUrl,"https://www.aliexpress.com/p/shoppingcart/index.html?spm=a2g0o.cart.header.1.44b938dafOwtqN");
    }
    

}
