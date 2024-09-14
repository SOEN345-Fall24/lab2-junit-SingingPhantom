import org.junit.Test;
import static org.junit.Assert.*;
public class ExampleTest {

    @Test public void testFunction_A(){
        Example a = new Example(6, 10);
        assertEquals("Function A incorrect for y > 0", 9, a.Function_A(3));
        assertEquals("Function A incorrect for y < 0", -16, a.Function_A(-10));
    }

    @Test public void testFunction_B(){
        Example a = new Example(6, 10);
        assertEquals("Function A incorrect for x < 6", 13, a.Function_B(3));
        assertEquals("Function A incorrect for x > 6", 37, a.Function_B(47));
    }

}
