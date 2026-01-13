package binarysearch;

public class SqrtX {
    // Time: O(log x)
// Space: O(1)
    public static int mySqrt(int x) {

        if (x < 2) return x; // handles 0 and 1

        int low = 1;
        int high = x / 2; // sqrt(x) for x>=2 is <= x/2 for sure
        int ans = 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Avoid overflow: instead of mid*mid <= x, use mid <= x/mid
            if (mid <= x / mid) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(4));           // 2
        System.out.println(mySqrt(8));           // 2
        System.out.println(mySqrt(0));           // 0
        System.out.println(mySqrt(1));           // 1
        System.out.println(mySqrt(2));           // 1
        System.out.println(mySqrt(2147395599));  // 46339 (classic edge case)
    }
}
