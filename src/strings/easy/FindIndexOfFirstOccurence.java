package strings.easy;

public class FindIndexOfFirstOccurence {
    // Time: O(n * m)
    // Space: O(1)
    public static int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        if (m > n) {
            return -1;
        }

        for (int i = 0; i <= n - m; i++) {
            int j = 0;

            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == m) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {

        System.out.println(strStr("sadbutsad", "sad"));   // 0
        System.out.println(strStr("leetcode", "leeto")); // -1
        System.out.println(strStr("aaaaa", "aaa"));      // 0
        System.out.println(strStr("abc", "abc"));        // 0
        System.out.println(strStr("abc", "d"));          // -1
    }
}
