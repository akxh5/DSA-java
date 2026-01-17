package tree.easy;
import java.util.*;
public class SortedArrayToBST {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
        public static TreeNode sortedArrayToBST(int[] nums) {
            return build(nums, 0, nums.length - 1);
        }

        private static TreeNode build(int[] nums, int l, int r) {
            if (l > r) return null;

            int mid = (l + r) >>> 1;  // bitshift avoids overflow, better than (l+r)/2

            TreeNode root = new TreeNode(nums[mid]);
            root.left = build(nums, l, mid - 1);
            root.right = build(nums, mid + 1, r);
            return root;
        }
        private static void inorder(TreeNode root) {
            if (root == null) return;
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
        public static void main(String[] args) {
            int[] nums1 = {-10, -3, 0, 5, 9};
            TreeNode root1 = sortedArrayToBST(nums1);
            inorder(root1); // prints: -10 -3 0 5 9
            System.out.println();

            int[] nums2 = {1, 3};
            TreeNode root2 = sortedArrayToBST(nums2);
            inorder(root2); // prints: 1 3 or 3 1? (depends on mid calculation); valid as long as BST balanced
            System.out.println();

            int[] nums3 = {0};
            TreeNode root3 = sortedArrayToBST(nums3);
            inorder(root3); // prints: 0
            System.out.println();
        }
    }
}
