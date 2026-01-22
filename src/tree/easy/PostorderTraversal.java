package tree.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PostorderTraversal {
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

        public static List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            dfs(root, result);
            return result;
        }

        private static void dfs(TreeNode node, List<Integer> res) {
            if (node == null) return;
            dfs(node.left, res);
            dfs(node.right, res);
            res.add(node.val); // Visit root last
        }
        public static List<Integer> postorderTraversalIter(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            if (root == null) return result;

            Stack<TreeNode> s1 = new Stack<>();
            Stack<TreeNode> s2 = new Stack<>();

            s1.push(root);

            while (!s1.isEmpty()) {
                TreeNode curr = s1.pop();
                s2.push(curr);

                if (curr.left != null) s1.push(curr.left);
                if (curr.right != null) s1.push(curr.right);
            }

            while (!s2.isEmpty()) result.add(s2.pop().val);

            return result;
        }
        public static List<Integer> postorderTraversalTrick(TreeNode root) {
            LinkedList<Integer> result = new LinkedList<>();
            if (root == null) return result;

            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);

            while (!stack.isEmpty()) {
                TreeNode curr = stack.pop();
                result.addFirst(curr.val); // prepend

                if (curr.left != null) stack.push(curr.left);
                if (curr.right != null) stack.push(curr.right);
            }

            return result;
        }
        public static void main(String[] args) {
            // Example 1: [1,null,2,3] -> [3,2,1]
            TreeNode root1 = new TreeNode(1,
                    null,
                    new TreeNode(2, new TreeNode(3), null));
            System.out.println(postorderTraversal(root1)); // [3,2,1]

            // Example 4: [1]
            TreeNode root2 = new TreeNode(1);
            System.out.println(postorderTraversal(root2)); // [1]

            // Example 3: []
            System.out.println(postorderTraversal(null)); // []
        }
    }
}