import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RealWorldLoginScenario {
    @Test(priority = 1)
    public void mothodOne(){
        System.out.println("Login");
    }
    @Test(priority = 2)
    public void methodTwo(){
        System.out.println("open the dashboard");
    }
    @Test(priority = 3)
    public void methodThree(){
        System.out.println("Logout");
    }
@BeforeMethod
    public void methodFour(){
        System.out.println(" open Browser and navigate");
    }
    @AfterMethod
    public void methodFive(){
        System.out.println("close browser");
    }

}
