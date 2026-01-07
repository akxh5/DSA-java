package binarysearch;

public class SearchInsertPosition {
    // Time: O(log n)
    // Space: O(1)
    public static int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // low is the correct insertion position
        return low;
    }
    public static void main(String[] args) {

        int[] nums1 = {1,3,5,6};
        System.out.println(searchInsert(nums1, 5)); // 2
        System.out.println(searchInsert(nums1, 2)); // 1
        System.out.println(searchInsert(nums1, 7)); // 4
        System.out.println(searchInsert(nums1, 0)); // 0

        int[] nums2 = {1};
        System.out.println(searchInsert(nums2, 1)); // 0
        System.out.println(searchInsert(nums2, 0)); // 0
        System.out.println(searchInsert(nums2, 2)); // 1
    }
}
