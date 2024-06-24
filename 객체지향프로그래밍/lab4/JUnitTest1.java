//»ó¼Ó

import static org.junit.Assert.*;
import org.junit.Test;

public class JUnitTest1 {
    @Test
    public void test() {
        Food f = new Food();
        Juice j = new Juice();
        assertTrue(f instanceof Menu);
        assertTrue(j instanceof Menu);
    }
}