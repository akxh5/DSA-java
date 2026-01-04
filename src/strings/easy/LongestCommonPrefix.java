package strings.easy;

public class LongestCommonPrefix {
    //Time: O(n*m)
    //Space: O(1)
    public static String longestCommonPrefix(String[] strs){
        if (strs==null|| strs.length==0){
            return"";
        }
        String prefix =strs[0];
        for (int i =1; i<strs.length; i++){
            while (!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);
                if (prefix.isEmpty()){
                    return"";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(
                new String[]{"flower", "flow", "flight"})); //f1
        System.out.println(longestCommonPrefix(
                new String[]{"dog", "racecar", "car"})); //""
        System.out.println(longestCommonPrefix(
                new String[]{"interspecies", "interstellar","interstate"})); //inter
        System.out.println(longestCommonPrefix(
                new String[]{"a"})); //a
        System.out.println(longestCommonPrefix(
                new String[]{"","abc"})); //""
    }
}
