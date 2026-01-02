package strings.slidingwindow;
import java.util.HashSet;
import java.util.Set;
public class LongestSubstringWithoutRepeatingCharacters {

    //Time: O(n)
    //Space: O(n)
    public static int lengthOfLongestSubstring(String s){
        int n=s.length();
        int left=0;
        int maxLen=0;

        Set<Character> set = new HashSet<>();
        for (int right=0; right<n; right++){
            char current=s.charAt(right);

      //If duplicate found, shrink window from the left
        while (set.contains(current)){
            set.remove(s.charAt(left));
            left++;
        }
        set.add(current);
        maxLen= Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); //3
        System.out.println(lengthOfLongestSubstring("bbbbb")); //1
        System.out.println(lengthOfLongestSubstring("pwwkew")); //3
        System.out.println(lengthOfLongestSubstring("")); //0
    }
}
