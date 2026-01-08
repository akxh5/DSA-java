package arrays.easy;

public class PlusOne {
    // Time: O(n)
// Space: O(1) except at carry overflow case (999 -> 1000)
    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0; // carry continues
        }

        // If we reach here: it was all 9's, e.g. 999 -> 1000
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
    private static void print(int[] arr) {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        print(plusOne(new int[]{1,2,3}));   // 1 2 4
        print(plusOne(new int[]{4,3,2,1})); // 4 3 2 2
        print(plusOne(new int[]{9}));       // 1 0
        print(plusOne(new int[]{9,9,9}));   // 1 0 0 0
        print(plusOne(new int[]{0}));       // 1
    }
}
