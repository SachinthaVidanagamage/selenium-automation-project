import org.testng.annotations.*;

public class TestNG {

    public static void main(String[] args) {
        System.out.println( "main");
        TestNG obj = new TestNG();


    }

    @AfterClass
    public void afterClass(){
        System.out.println("Browser closed"); //11
    }

    @BeforeMethod
    public void loginToTheApp(){
        System.out.println("Login to app"); //2,5,8
    }
    @BeforeClass
    public void beforeclass(){
        System.out.println("Browser launched");  //1
    }
@AfterMethod
    public void afterMethod(){
        System.out.println("Logout from app"); //4,7,10
    }
    @Test
    public void atestSearchProduct(){
        System.out.println("Searching product"); //9
    }
    @Test
    public void btestAddToCart(){
        System.out.println("Adding product to cart");  //3
    }
    @Test
    public void ctestPayment(){
        System.out.println("Making payment");  //6
    }





}
