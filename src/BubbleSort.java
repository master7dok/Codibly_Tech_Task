import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BubbleSort {
    public List<Comparable> sort(List<Comparable> input) {
        if (input == null) {
            throw new IllegalArgumentException("Input list cannot be null");
        }
        List<Comparable> sorted = new ArrayList<>(input.size());
        for (Comparable value : input) {
            if (value != null) {
                sorted.add(value);
            }
        }
        Collections.sort(sorted, new Comparator<Comparable>() {
            @Override
            public int compare(Comparable o1, Comparable o2) {
                if (o1 instanceof Integer && o2 instanceof Integer) {
                    return Integer.compare((Integer) o1, (Integer) o2);
                } else if (o1 instanceof Double && o2 instanceof Double) {
                    return Double.compare((Double) o1, (Double) o2);
                } else if (o1 instanceof Integer && o2 instanceof Double) {
                    return Double.compare((Integer) o1, (Double) o2);
                } else {
                    return Double.compare((Double) o1, (Integer) o2);
                }
            }
        });
        return sorted;
    }
}