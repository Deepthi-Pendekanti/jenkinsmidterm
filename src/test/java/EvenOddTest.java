import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class EvenOddTest {

    @Test
    void testIsEven() {
        EvenOdd calculator = new EvenOdd();
        
        assertTrue(calculator.isEven(10), "10 should be even");
        assertTrue(calculator.isEven(0), "0 should be even");
    
        assertFalse(calculator.isEven(7), "7 should be odd");
        assertFalse(calculator.isEven(-3), "-3 should be odd");
    }
}
