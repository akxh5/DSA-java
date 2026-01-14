package array.easy;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
    }

    private static void print(int[] arr) {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
        print(nums1); // 1 2 2 3 5 6

        int[] nums3 = {1};
        int[] nums4 = {};
        merge(nums3, 1, nums4, 0);
        print(nums3); // 1

        int[] nums5 = {0};
        int[] nums6 = {1};
        merge(nums5, 0, nums6, 1);
        print(nums5); // 1
    }
}