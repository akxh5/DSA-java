package arrays.easy;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR cancels duplicates
        }
        return result;
    }
    public static int singleNumberSort(int[] nums) {
        java.util.Arrays.sort(nums);
        for (int i = 1; i < nums.length; i += 2) {
            if (nums[i] != nums[i - 1]) {
                return nums[i - 1];
            }
        }
        return nums[nums.length - 1];
    }
    public static int singleNumberMap(int[] nums) {
        java.util.Map<Integer, Integer> map = new java.util.HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (var e : map.entrySet()) {
            if (e.getValue() == 1) return e.getKey();
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,1}));        // 1
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));    // 4
        System.out.println(singleNumber(new int[]{1}));            // 1
    }
}
