package tree.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
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
        public static List<Integer> inorderRecursive(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            inorderHelper(root, result);
            return result;
        }

        private static void inorderHelper(TreeNode node, List<Integer> result) {
            if (node == null) return;
            inorderHelper(node.left, result);
            result.add(node.val);
            inorderHelper(node.right, result);
        }
        public static List<Integer> inorderIterative(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            TreeNode curr = root;

            while (curr != null || !stack.isEmpty()) {
                while (curr != null) {
                    stack.push(curr);
                    curr = curr.left;
                }
                curr = stack.pop();
                result.add(curr.val);
                curr = curr.right;
            }

            return result;
        }
        public static void main(String[] args) {
            TreeNode root1 = new TreeNode(1, null,
                    new TreeNode(2, new TreeNode(3), null));

            System.out.println(inorderRecursive(root1)); // [1, 3, 2]
            System.out.println(inorderIterative(root1)); // [1, 3, 2]

            TreeNode root2 = new TreeNode(1,
                    new TreeNode(2,
                            new TreeNode(4),
                            new TreeNode(5, new TreeNode(6), new TreeNode(7))),
                    new TreeNode(3, null,
                            new TreeNode(8, new TreeNode(9), null))
            );

            System.out.println(inorderRecursive(root2)); // [4,2,6,5,7,1,3,9,8]
            System.out.println(inorderIterative(root2)); // same
        }
    }
}
