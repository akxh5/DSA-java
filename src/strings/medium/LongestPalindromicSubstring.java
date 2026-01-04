package strings.medium;

public class LongestPalindromicSubstring {
    //Time: O(n^2)
    //Space: O(1)
    public static String longestPalindrome(String s){
        if (s==null||s.length()<2){
            return s;
        }
        int start =0;
        int maxLen=1;
        for (int i =0; i<s.length();i++){
            //Odd-length palindrome (center at i)
            int len1=expandFromCenter(s,i,i);
            //Even-length palindrome (center between i and i+1)
            int len2=expandFromCenter(s,i,i+1);
            int len = Math.max (len1,len2);
            if (len>maxLen){
                maxLen=len;
                start=i-(len-1)/2;
            }
        }
        return s.substring(start, start+maxLen);
    }
    private static int expandFromCenter(String s, int left, int right){
        while (left>=0&&right <s.length()
        && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        //right and left have gone one step too far
        return right-left-1;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad")); //bab or aba
        System.out.println(longestPalindrome("cbbd")); //bb
        System.out.println(longestPalindrome("a")); //a
        System.out.println(longestPalindrome("ac")); //a or c
        System.out.println(longestPalindrome("forgeeksskeegfor")); //geeksskeeg
        System.out.println(longestPalindrome("akshansh")); //a
    }
}
