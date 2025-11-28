import org.testng.annotations.Test;

public class PriorityBehaviour {
//    @Test
//    public void secondM(){
//        System.out.println("print 2");
//    }
//    @Test
//    public void fristM(){
//        System.out.println("print 1");
//    }
//@Test
//    public void thirdM(){
//        System.out.println("print 3");
//    }
//@Test(priority = 1)
//public void secondM(){
//    System.out.println("print 2");
//}
//    @Test(priority = 2)
//    public void fristM(){
//        System.out.println("print 1");
//    }
//    @Test(priority = 0)
//    public void thirdM(){
//        System.out.println("print 3");
//    }

    @Test(priority = 0)
    public void thirdM(){
        System.out.println("print 3");
    }
    @Test(dependsOnMethods ="thirdM" )
    public void secondM(){
        System.out.println("print 2");
    }
//    @Test(priority = 2)
//    public void fristM(){
//        System.out.println("print 1");
//    }


}
