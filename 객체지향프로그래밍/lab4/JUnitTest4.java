
import static org.junit.Assert.*;
import org.junit.Test;

public class JUnitTest4 {
    @Test
    public void test() {
    	Menu[] menu = new Menu[5];
    	menu[0] = new Food();
    	menu[1] = new Food(1,2);
    	menu[2] = new Juice();
    	menu[3] = new Juice(3,"dd");
    	menu[4] = new Food(4,5);
    	
    	Order order = new Order(menu);
        
        assertTrue(order.bill() == 8);
        assertTrue(order.waitingTime() == 7);
    }
}
