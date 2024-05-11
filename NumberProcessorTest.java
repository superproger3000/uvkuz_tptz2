import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.junit.Test;

@RunWith(JUnitPlatform.class)
public class NumberProcessorTest {
    @Test
    void testMin() {
        int[] numbers = {1, 3, 5, 7, 9};
        assertEquals(1, NumberProcessor.min(numbers));
    }
    @Test
    void testMax() {
        int[] numbers = {1, 3, 5, 7, 9};
        assertEquals(9, NumberProcessor.max(numbers));
    }
    @Test
    void testSum() {
        int[] numbers = {1, 3, 5, 7, 9};
        assertEquals(25, NumberProcessor.sum(numbers));
    }
    @Test
    void testMult() {
        int[] numbers = {1, 3, 5, 7, 9;
        assertEquals(945, NumberProcessor.mult(numbers));
    }
}
