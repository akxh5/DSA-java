package tree.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal {
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
        public static List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            preorder(root, result);
            return result;
        }

        private static void preorder(TreeNode node, List<Integer> result) {
            if (node == null) return;
            result.add(node.val);     // Visit
            preorder(node.left, result);  // Left
            preorder(node.right, result); // Right
        }
        public static List<Integer> preorderTraversalIter(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            if (root == null) return result;

            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);

            while (!stack.isEmpty()) {
                TreeNode node = stack.pop();
                result.add(node.val);

                if (node.right != null) stack.push(node.right);
                if (node.left != null) stack.push(node.left);
            }

            return result;
        }
        public static void main(String[] args) {
            TreeNode root1 = new TreeNode(1, null,
                    new TreeNode(2, new TreeNode(3), null));

            System.out.println(preorderTraversal(root1)); // [1, 2, 3]
            System.out.println(preorderTraversalIter(root1)); // [1, 2, 3]

            TreeNode root2 = new TreeNode(1,
                    new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                    new TreeNode(3, null, new TreeNode(8, new TreeNode(9), null))
            );

            System.out.println(preorderTraversal(root2)); // [1,2,4,5,3,8,9]
        }
    }
}
