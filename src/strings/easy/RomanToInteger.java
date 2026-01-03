package strings.easy;

import java.sql.SQLOutput;

public class RomanToInteger {
    //Time: O(n)
    //Space: O(1)
    public static int romanToInt (String s){
        int total = 0;
        int prevValue=0;
        for (int i=s.length()-1;i>=0;i--){
            int curr=valueOfRoman(s.charAt(i));
            if (curr<prevValue){
                total -=curr;
            }else{
                total+=curr;
            }
            prevValue=curr;
        }
        return total;
    }
    private static int valueOfRoman(char c){
        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: throw new IllegalArgumentException("Invalid Roman Numeral");
        }
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III")); //3
        System.out.println(romanToInt("LVIII")); //58
        System.out.println(romanToInt("MCMXCIV")); //1994
        System.out.println(romanToInt("MMV")); //2005
        System.out.println(romanToInt("MMCMVI")); //2906
        System.out.println(romanToInt("IV")); //4
        System.out.println(romanToInt("IX")); //9
    }
}
