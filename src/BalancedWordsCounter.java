import java.util.HashMap;

public class BalancedWordsCounter {
    public static int count(String input) throws Exception {
        if (input == null) {
            throw new Exception("Input cannot be null");
        }

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!Character.isLetter(c)) {
                throw new Exception("Input should contain letters only");
            }
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = i; j < input.length(); j++) {
                char curr = input.charAt(j);
                if (map.containsKey(curr)) {
                    map.put(curr, map.get(curr) + 1);
                } else {
                    map.put(curr, 1);
                }
                boolean isBalanced = true;
                int freq = -1;
                for (int val : map.values()) {
                    if (freq == -1) {
                        freq = val;
                    } else if (val != freq) {
                        isBalanced = false;
                        break;
                    }
                }
                if (isBalanced && j - i + 1 > 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public String toString(String aabbabcccba) {
        return "aabbabcccba";
    }
}
