import java.util.HashSet;
import java.util.Set;

public class FindNumbersBySum {

    public static boolean findNumbersBySum(int[] numbers, int sum) {
        Set<Integer> set = new HashSet<>(numbers.length);
        for (int number: numbers) {
            if (set.contains(number)) {
                return true;
            }
            set.add(sum - number);
        }
        return false;
    }
}
