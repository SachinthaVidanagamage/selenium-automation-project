package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeForm {

    WebDriver driver;



    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();   // ✅ initialize class variable
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
    }

    @Test
    public void studentRegistrationForm() {
        driver.findElement(By.id("firstName")).sendKeys("Sachintha");
        driver.findElement(By.id("lastName")).sendKeys("Vidanagamage");
        driver.findElement(By.id("userEmail")).sendKeys("sachinthavida@gmail.com");
        driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
        driver.findElement(By.id("userNumber")).sendKeys("0702964365");
//select date
        driver.findElement(By.id("dateOfBirthInput")).click();
        // Click the year dropdown
        driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).click();
        // Select 1998
        driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']/option[text()='1998']")).click();
        // Click the mo dropdown and August in one line
        driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']/option[text()='August']")).click();


        driver.findElement(By.xpath("//div[contains(@aria-label,'Choose Sunday, August 9th, 1998')]")).click();

    }
    @Test
    public void method_Subject_Select(){
//Type subject ma
        driver.findElement(By.id("subjectsInput")).sendKeys("ma");
        // Click "Maths" suggestion
        driver.findElement(By.xpath("//div[text()='Maths']")).click();
//Type subject che
        driver.findElement(By.id("subjectsInput")).sendKeys("che");
        // Click "Chemistry" suggestion
        driver.findElement(By.xpath("//div[text()='Chemistry']")).click();

        driver.findElement(By.id("subjectsInput")).sendKeys("phy");
        driver.findElement(By.xpath("//div[text()='Physics']")).click();

    }
    @Test
    public void checkMethod()
    {
//        driver.findElement(By.xpath("//label[normalize-space()='Sports']")).click();

        WebElement sports= driver.findElement(By.xpath("//label[normalize-space()='Sports']"));
        if(sports.isSelected()){
            sports.click();// uncheck
        }
        driver.findElement(By.xpath("//label[normalize-space()='Reading']")).click();
        driver.findElement(By.xpath("//label[normalize-space()='Music']")).click();
    }
@Test
    public void newMethod(){

        //upload image
    driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\HP\\Downloads\\sampleFile (1).jpeg");
    //input home address
        driver.findElement(By.id("currentAddress")).sendKeys("NO.146/A, Parawahera, Kekanadura");
        //select state
        driver.findElement(By.xpath("//div[@id='state']//div[contains(@class,'css-1hwfws3')]")).click();
        //select city
    driver.findElement(By.xpath("//div[@id='city']//div[contains(@class,'css-1hwfws3')]")).click();
//submit the form
    driver.findElement(By.id("submit")).click();


    }

}
