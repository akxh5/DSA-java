package tree.easy;
import java.util.*;
public class MinimumDepthOfBinaryTree {
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
        public static int minDepthBFS(TreeNode root) {
            if (root == null) return 0;

            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            int depth = 1;

            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = q.poll();
                    if (node.left == null && node.right == null) {
                        return depth;
                    }
                    if (node.left != null) q.offer(node.left);
                    if (node.right != null) q.offer(node.right);
                }
                depth++;
            }

            return depth;
        }
        public static int minDepthDFS(TreeNode root) {
            if (root == null) return 0;

            int left = minDepthDFS(root.left);
            int right = minDepthDFS(root.right);

            // If one side is missing, take the other side only (can't consider null as 0)
            if (left == 0 || right == 0) {
                return 1 + left + right; // one is zero, one is depth
            }

            return 1 + Math.min(left, right);
        }
        public static void main(String[] args) {
            TreeNode root1 = new TreeNode(3,
                    new TreeNode(9),
                    new TreeNode(20, new TreeNode(15), new TreeNode(7))
            );

            System.out.println(minDepthBFS(root1)); // 2
            System.out.println(minDepthDFS(root1)); // 2

            TreeNode root2 = new TreeNode(2,
                    null,
                    new TreeNode(3,
                            null,
                            new TreeNode(4,
                                    null,
                                    new TreeNode(5,
                                            null,
                                            new TreeNode(6)
                                    )
                            )
                    )
            );

            System.out.println(minDepthBFS(root2)); // 5
            System.out.println(minDepthDFS(root2)); // 5

            System.out.println(minDepthBFS(null)); // 0
            System.out.println(minDepthDFS(null)); // 0
        }
    }
}
