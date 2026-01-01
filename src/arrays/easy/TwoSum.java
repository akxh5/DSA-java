package arrays.easy;
import java.util.*;
public class TwoSum {
//Approach 1: Brute Force
//Time: O(n^2) , Space O(1)
public static int [] twoSumBruteForce (int[] nums, int target){
    int n = nums.length;
    for (int i=0; i<n; i++){
        for (int j=i+1; j<n; j++){
            if (nums[i] + nums[j] == target){
                return new int[]{i,j};
            }
        }
    }
    return new int[]{-1,-1};
}
//Approach 2: Optimized using HashMap
//Time: O(n) , Space: O(n)
public static int[] twoSumOptimized (int[] nums, int target){
    Map<Integer, Integer> map = new HashMap<>();
    for (int i=0; i<nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)){
            return new int[]{map.get(complement), i};
        }
        map.put(nums[i],i);
    }
    return new int[]{-1,-1}; //safety return
}

    public static void main(String[] args) {
        int[]nums={2,7,11,15};
        int target = 9;
        int [] result = twoSumOptimized(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
