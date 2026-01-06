package arrays.easy;

public class RemoveElement {
    //Time: O(n)
    //Space: O(1)
    public static int removeElement(int[]nums, int val){
        int left =0;
        int right =nums.length -1;
        while (left<=right){
            if (nums[left]==val){
                nums[left]=nums[right];
                right--;
            }else{
                left++;
            }
        }
        return right+1;
    }
    private static void printArray(int[]nums, int k){
        for (int i=0;i<k;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int []nums1={3,2,2,3};
        int k1=removeElement(nums1, 3);
        System.out.println(k1); //2
        printArray(nums1, k1); //2 2

        int [] nums2={0,1,2,2,3,0,4,2};
        int k2=removeElement(nums2, 2);
        System.out.println(k2); //5
        printArray(nums2, k2); //order may vary

        int[] nums3={};
        System.out.println(removeElement(nums3, 1)); //0

        int[] nums4={1,1,1};
        System.out.println(removeElement(nums4, 1)); //0
    }
}
