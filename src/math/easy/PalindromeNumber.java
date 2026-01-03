package math.easy;

public class PalindromeNumber {
    //Time: O(log10(n))
    //Space: O(1)
    public static boolean isPalindrome(int x){
        //Negative numbers are not palindromes
        //Numbers ending with 0 (except 0 itself) are not palindromes
        if (x<0||(x%10==0&&x!=0)){
            return false;
        }
        int reversedHalf =0;
        //Reversing only half of the number
        while (x>reversedHalf) {
            int digit = x%10;
            reversedHalf=reversedHalf*10+digit;
            x/=10;
        }
        //For even length:x==reversedHalf
        //For odd length:x==reversedHalf/10
        return x == reversedHalf||x==reversedHalf/10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121)); //turu
        System.out.println(isPalindrome(-121)); //foolse
        System.out.println(isPalindrome(10)); //foolse
        System.out.println(isPalindrome(0)); //turu
        System.out.println(isPalindrome(12321)); //turu
        System.out.println(isPalindrome(1221)); //turu
    }
}
