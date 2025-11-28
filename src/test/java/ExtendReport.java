package Reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ExtendReport {
    static ExtentReports report;
    static ExtentTest test;
    static WebDriver driver;
    @BeforeClass
    public void startReport() {
        String timestamp = new
                SimpleDateFormat("yyyy.MM.dd_HH.mm.ss").format(new Date());
        report = new ExtentReports(System.getProperty("user.dir") +
                "C:\\Users\\HP\\Desktop\\battory" + timestamp + ".html");
// Optional: set chromedriver path if needed
System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void setReport() {
        ExtentTest test1 = report.startTest("Extent Demo");
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        Assert.assertNotNull(title);
        if (title.equals("Google")) {
            test1.log(LogStatus.PASS, "Navigated to Google successfully.");

        } else {
            test1.log(LogStatus.FAIL, "Title mismatch. Actual title: " +
                    title);
        }
        report.endTest(test1);
    }
    @Test
    public void setReport2() {
        ExtentTest test2 = report.startTest("Extent Demo");
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        Assert.assertNotNull(title);
        if (title.contains("Firefox")) {
            test2.log(LogStatus.PASS, "Navigated to Google successfully.");
        } else {
            test2.log(LogStatus.FAIL, "Title mismatch. Actual title: " +
                    title);
        }
        report.endTest(test2);
    }
    @AfterClass
    public void endReport() {
        driver.quit();
        report.flush(); // Make sure to save the report file
    }
}