package strings.easy;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);

            // Skip non-alphanumeric on left
            if (!Character.isLetterOrDigit(l)) {
                left++;
                continue;
            }

            // Skip non-alphanumeric on right
            if (!Character.isLetterOrDigit(r)) {
                right--;
                continue;
            }

            // Compare in lowercase
            if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
    public static boolean isPalindromeBuild(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        String str = sb.toString();
        String rev = sb.reverse().toString();
        return str.equals(rev);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("race a car")); // false
        System.out.println(isPalindrome(" ")); // true
        System.out.println(isPalindrome("0P")); // false
    }
}
