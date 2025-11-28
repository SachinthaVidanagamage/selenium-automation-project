import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun {
    @Test
    public void setUp(){
        System.out.println("setup");

    }
    @Test(dependsOnMethods = "setUp")
    public void beforeEach(){
        System.out.println("before each test");
    }
    @Test(dependsOnMethods = "beforeEach")
    public void test1(){
        System.out.println("Test 1");
        Assert.fail();  // after this line nothing print anything
    }
    @Test(dependsOnMethods = "test1")
    public void test2(){
        System.out.println("test 2");
    }
    @Test(dependsOnMethods = "test2")
    public void tearDown(){
        System.out.println("Closing");
    }
}
