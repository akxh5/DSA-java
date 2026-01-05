package arrays.easy;

public class RemoveDuplicatesFromSortedArray {
    //Time: O(n)
    //Space:O(1)
    public static int removeDuplicates (int [] nums){
        if (nums == null||nums.length==0){
            return 0;
        }
        int i=0; //slow pointer
        for (int j=1; j<nums.length; j++){
            if (nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
    private static void printArray(int[]nums, int k){
        for (int i=0; i<k; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[]nums1={1,1,2};
        int k1=removeDuplicates(nums1);
        System.out.println(k1); //2
        printArray(nums1, k1); //1 2

        int []nums2={0,0,1,1,1,2,2,3,3,4};
        int k2=removeDuplicates(nums2);
        System.out.println(k2); //5
        printArray(nums2, k2); //0 1 2 3 4

        int [] nums3={1};
        int k3= removeDuplicates(nums3);
        System.out.println(k3);
        printArray(nums3, k3);
    }
}
