import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;


public class AddTest {
    @Test
    public void testAdd() {
        Add add = new Add();
        int sum = add.add(10, 5);
        assertEquals("Success", 15, sum);
    }

    public void testSub() {
        Add add = new Add();
        int sub=add.subtract(10,5);
        assertEquals("Success1", 5, sub);

    }
    public void  testMultiply(){
        Add add=new Add();
        int mul=add.multiply(18,5);
        assertEquals("Success2",90,mul);
    }
}
class MainApp {
    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(AddTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}

