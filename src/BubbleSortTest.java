import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {
    private BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void testSortCase1() {
        List<Comparable> input = new ArrayList<>();
        input.add(1);
        input.add(4);
        input.add(5);
        input.add(6);
        input.add(8);
        input.add(3);
        input.add(8);
        List<Comparable> expectedResult = new ArrayList<>();
        expectedResult.add(1);
        expectedResult.add(3);
        expectedResult.add(4);
        expectedResult.add(5);
        expectedResult.add(6);
        expectedResult.add(8);
        expectedResult.add(8);
        Assert.assertEquals(expectedResult, bubbleSort.sort(input));
    }

    @Test
    public void testSortCase2() {
        List<Comparable> input = new ArrayList<>();
        input.add(-9.3);
        input.add(0.2);
        input.add(4.0);
        input.add(0.1);
        input.add(5.0);
        input.add(9.0);
        List<Comparable> expectedResult = new ArrayList<>();
        expectedResult.add(-9.3);
        expectedResult.add(0.1);
        expectedResult.add(0.2);
        expectedResult.add(4.0);
        expectedResult.add(5.0);
        expectedResult.add(9.0);
        Assert.assertEquals(expectedResult, bubbleSort.sort(input));
    }

    @Test
    public void testSortCase3() {
        List<Comparable> input = new ArrayList<>();
        List<Comparable> expectedResult = new ArrayList<>();
        Assert.assertEquals(expectedResult, bubbleSort.sort(input));
    }

    @Test
    public void testSortCase4() {
        List<Comparable> input = new ArrayList<>();
        input.add(null);
        input.add(5.0001);
        List<Comparable> expectedResult = new ArrayList<>();
        expectedResult.add(5.0001);
        Assert.assertEquals(expectedResult, bubbleSort.sort(input));
    }

    @Test(expected = RuntimeException.class)
    public void testSortCase5() {
        bubbleSort.sort(null);
    }
}
