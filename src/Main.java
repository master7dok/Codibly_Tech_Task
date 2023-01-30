import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BubbleSort bubbleSort = new BubbleSort();
        List<Comparable> input = new ArrayList<>(Arrays.asList(4, 2, 7, 1, 3, 8));
        List<Comparable> sorted = bubbleSort.sort(input);
        System.out.println("Sorted list: " + sorted);


        int i = BalancedWordsCounter.count("aabbabcccba");
        System.out.println(i);
    }
}