package math.easy;
import java.util.*;
public class PascalsTriangleII {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>(Collections.nCopies(rowIndex + 1, 0));
        row.set(0, 1);

        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }

        return row;
    }
    public static List<Integer> getRowCombinatorial(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long val = 1;

        for (int i = 0; i <= rowIndex; i++) {
            row.add((int) val);
            val = val * (rowIndex - i) / (i + 1);
        }

        return row;
    }
    public static void main(String[] args) {
        System.out.println(getRow(3)); // [1, 3, 3, 1]
        System.out.println(getRow(0)); // [1]
        System.out.println(getRow(1)); // [1, 1]
        System.out.println(getRow(6)); // [1, 6, 15, 20, 15, 6, 1]

        System.out.println(getRowCombinatorial(5)); // [1, 5, 10, 10, 5, 1]
    }
}
