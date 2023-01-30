import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BalancedWordsCounterTest {

    @Test
    public void testCountCase1() {
        String input = "aabbabcccba";
        int expectedResult = 28;
        int actualResult = 0;
        try {
            actualResult = BalancedWordsCounter.count(input);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountCase2() {
        String input = "";
        int expectedResult = 0;
        int actualResult = 0;
        try {
            actualResult = BalancedWordsCounter.count(input);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = RuntimeException.class)
    public void testCountCase3() {
        String input = "abababa1";
        try {
            BalancedWordsCounter.count(input);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test(expected = RuntimeException.class)
    public void testCountCase4() {
        String input = null;
        try {
            BalancedWordsCounter.count(input);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}