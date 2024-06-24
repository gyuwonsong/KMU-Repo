
import static org.junit.Assert.*;
import org.junit.Test;

public class JUnitTest2 {
    @Test
    public void test() {
        Food f = new Food();
        Food f2 = new Food(1,2);
        assertTrue(f.getPrice() == 0);
        assertTrue(f.getCookingTime() == 0);
        assertTrue(f2.getPrice() == 1);
        assertTrue(f2.getCookingTime() == 2);
	        
        f.setPrice(3);
        f.setCookingTime(4);
        assertTrue(f.getPrice() == 3);
        assertTrue(f.getCookingTime() == 4);
    }
}