package tree.easy;
import java.util.*;
public class BalancedBinaryTree {
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
        public static boolean isBalanced(TreeNode root) {
            return height(root) != -1;
        }

        private static int height(TreeNode node) {
            if (node == null) return 0;

            int left = height(node.left);
            if (left == -1) return -1;

            int right = height(node.right);
            if (right == -1) return -1;

            if (Math.abs(left - right) > 1) return -1;

            return 1 + Math.max(left, right);
        }
        public static void main(String[] args) {
            // Example 1: Balanced
            TreeNode root1 = new TreeNode(3,
                    new TreeNode(9),
                    new TreeNode(20, new TreeNode(15), new TreeNode(7)));

            System.out.println(isBalanced(root1)); // true

            // Example 2: Unbalanced
            TreeNode root2 = new TreeNode(1,
                    new TreeNode(2,
                            new TreeNode(3,
                                    new TreeNode(4),
                                    new TreeNode(4)),
                            new TreeNode(3)),
                    new TreeNode(2));

            System.out.println(isBalanced(root2)); // false

            // Example 3: Empty tree
            System.out.println(isBalanced(null)); // true
        }
    }
}
