package tree.easy;
import java.util.*;
public class MaximumDepthOfBinaryTree {
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
        // Time: O(n)
// Space: O(h) recursion (h = tree height)
        public static int maxDepthDFS(TreeNode root) {
            if (root == null) return 0;
            return 1 + Math.max(maxDepthDFS(root.left), maxDepthDFS(root.right));
        }
        public static int maxDepthBFS(TreeNode root) {
            if (root == null) return 0;

            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            int depth = 0;

            while (!q.isEmpty()) {
                int size = q.size();
                while (size-- > 0) {
                    TreeNode node = q.poll();
                    if (node.left != null) q.offer(node.left);
                    if (node.right != null) q.offer(node.right);
                }
                depth++;
            }

            return depth;
        }
        public static void main(String[] args) {
            TreeNode root1 = new TreeNode(3,
                    new TreeNode(9),
                    new TreeNode(20,
                            new TreeNode(15),
                            new TreeNode(7)));

            System.out.println(maxDepthDFS(root1)); // 3
            System.out.println(maxDepthBFS(root1)); // 3

            TreeNode root2 = new TreeNode(1, null, new TreeNode(2));
            System.out.println(maxDepthDFS(root2)); // 2
            System.out.println(maxDepthBFS(root2)); // 2

            System.out.println(maxDepthDFS(null)); // 0
            System.out.println(maxDepthBFS(null)); // 0
        }
    }
}
