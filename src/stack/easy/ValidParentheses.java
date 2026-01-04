package stack.easy;
import java.util.Stack;
public class ValidParentheses {
    //Time: O(n)
    //Space: O(n)
    public static boolean isValid (String s){
        Stack<Character> stack = new Stack <>();
        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            //Opening brackets -> push

            if (ch =='('|| ch =='{'|| ch =='['){
                stack.push(ch);
            }
            //Closing brackets
            else {
                //No opening bracket to match
                if (stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                //Check Matching
                if ((ch ==')'&& top !='(') ||
                        (ch=='}'&& top!='{')||
                        (ch==']'&& top!='[')){
                    return false;
                }
            }
        }
        //Stack must be empty for valid parentheses
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()")); //turu
        System.out.println(isValid("() {} []")); //turu
        System.out.println(isValid("(]")); //foolse
        System.out.println(isValid("([])")); // turu
        System.out.println(isValid("([)]")); // foolse
        System.out.println(isValid("("));  // foolse
        System.out.println(isValid(""));   // turu
    }
}
