import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Report {

    static ExtentReports report;
    static ExtentTest test;
    static WebDriver driver;

    @BeforeClass
    public void startReport() {

        String timestamp = new SimpleDateFormat("yyyy.MM.dd_HH.mm.ss").format(new Date());

        // FIXED: Correct report file path
        report = new ExtentReports(System.getProperty("user.dir") +
                "/src/test/java/Reports/" + timestamp + "_ExtentReport.html");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void startTest(Method method) {
        test = report.startTest(method.getName());
    }

    // Screenshot method
    public String takeScreenshot(String name) {
        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            String path = System.getProperty("user.dir") + "src/test/java/screenshot";
            new File(path).mkdirs();

            String filePath = path + name + ".png";
            Files.copy(src.toPath(), new File(filePath).toPath());

            return filePath;
        } catch (Exception e) {
            return null;
        }
    }

    @Test
    public void testGoogleTitle() {
        driver.get("https://www.google.com");
        String title = driver.getTitle();

        Assert.assertNotNull(title);
        if (title.equals("Google")) {
            test.log(LogStatus.PASS, "Google title matched.");
        } else {
            test.log(LogStatus.FAIL, "Title mismatch: " + title);
        }
    }

    @Test
    public void testFailingCase() {
        driver.get("https://www.google.com");
        String title = driver.getTitle();

        Assert.assertNotNull(title);
        if (title.contains("Firefox")) {
            test.log(LogStatus.PASS, "Condition matched");
        } else {
            test.log(LogStatus.FAIL, "Expected Firefox but got: " + title);
        }
    }

    @AfterMethod
    public void getResult(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {
            String screenshot = takeScreenshot(result.getName());

            test.log(LogStatus.FAIL, "Test Failed: " + result.getThrowable());
            test.log(LogStatus.FAIL, "Screenshot: " + test.addScreenCapture(screenshot));
        }
        report.endTest(test);
    }

    @AfterClass
    public void endReport() {
        driver.quit();
        report.flush();
    }
}
