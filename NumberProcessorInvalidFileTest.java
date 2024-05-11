import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@RunWith(JUnitPlatform.class)
class NumberProcessorInvalidFileTest {
    @Test
    void testMinInvalidFile() {
        int[] numbers = NumberProcessor.readNumbersFromFile("invalid.txt");
        assertEquals(0, numbers.length);
    }
    @Test
    void testMaxInvalidFile() {
        int[] numbers = NumberProcessor.readNumbersFromFile("invalid.txt");
        assertEquals(0, numbers.length);
    }
    @Test
    void testSumInvalidFile() {
        int[] numbers = NumberProcessor.readNumbersFromFile("invalid.txt");
        assertEquals(0, numbers.length);
    }
    @Test
    void testMultInvalidFile() {
        int[] numbers = NumberProcessor.readNumbersFromFile("invalid.txt");
        assertEquals(0, numbers.length);
    }
}
