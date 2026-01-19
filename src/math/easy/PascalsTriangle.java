package math.easy;
import java.util.*;
public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows <= 0) return triangle;

        // First row is always [1]
        triangle.add(Arrays.asList(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();

            row.add(1); // first element

            for (int j = 1; j < i; j++) {
                row.add(prev.get(j - 1) + prev.get(j)); // middle elements
            }

            row.add(1); // last element
            triangle.add(row);
        }

        return triangle;
    }
    public static List<List<Integer>> generateCombinatorial(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            long val = 1;
            for (int j = 0; j <= i; j++) {
                row.add((int) val);
                val = val * (i - j) / (j + 1);
            }
            triangle.add(row);
        }
        return triangle;
    }
    public static void main(String[] args) {
        System.out.println(generate(5));
        System.out.println(generate(1));
        System.out.println(generate(6));

        System.out.println(generateCombinatorial(5));
    }
}
