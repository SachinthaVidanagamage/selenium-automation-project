import org.testng.annotations.Test;

public class NegativeSamePriority {
@Test(priority = -1)
    public void methodOne(){
        System.out.println("there is a frist method");
    }
    @Test(priority = 0)
    public void methodTwo(){
        System.out.println("thare is a second method");
    }
    @Test(priority = 1)
    public void methodThree(){
        System.out.println("there is a third method");
    }
    @Test(priority = -2)
    public void methodFour(){
        System.out.println("there is a fourth method");
    }


}
