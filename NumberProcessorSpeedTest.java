import org.junit.jupiter.api.RepeatedTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitPlatform.class)
class NumberProcessorSpeedTest {
    @RepeatedTest(10)
    void testMinSpeed(int size) {
        int[] numbers = generateRandomArray(size);
        long startTime = System.currentTimeMillis();
        int min = NumberProcessor.min(numbers);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Время выполнения поиска min для массива чисел размера " + size + ": " + elapsedTime + " мс");
    }
    @RepeatedTest(10)
    void testMaxSpeed(int size) {
        int[] numbers = generateRandomArray(size);
        long startTime = System.currentTimeMillis();
        int max = NumberProcessor.max(numbers);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Время выполнения поиска max для массива чисел размера " + size + ": " + elapsedTime + " мс");
    }
    @RepeatedTest(10)
    void testSumSpeed(int size) {
        int[] numbers = generateRandomArray(size);
        long startTime = System.currentTimeMillis();
        int sum = NumberProcessor.sum(numbers);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Время выполнения sum для массива чисел размера " + size + ": " + elapsedTime + " мс");
    }
    @RepeatedTest(10)
    void testMultSpeed(int size) {
        int[] numbers = generateRandomArray(size);
        long startTime = System.currentTimeMillis();
        int mult = NumberProcessor.mult(numbers);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Время выполнения mult для массива чисел размера " + size + ": " + elapsedTime + " мс");
    }
    private int[] generateRandomArray(int size) {
        int[] numbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(10000);
        }
        return numbers;
    }
}
