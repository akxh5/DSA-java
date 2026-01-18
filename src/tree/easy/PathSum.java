package tree.easy;
import java.util.*;
public class PathSum {
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
        public static boolean hasPathSum(TreeNode root, int targetSum) {
            if (root == null) return false;

            // Check leaf
            if (root.left == null && root.right == null) {
                return targetSum == root.val;
            }

            int remainder = targetSum - root.val;

            return hasPathSum(root.left, remainder) ||
                    hasPathSum(root.right, remainder);
        }
        public static boolean hasPathSumBFS(TreeNode root, int targetSum) {
            if (root == null) return false;

            Queue<TreeNode> qNodes = new LinkedList<>();
            Queue<Integer> qSums = new LinkedList<>();

            qNodes.offer(root);
            qSums.offer(root.val);

            while (!qNodes.isEmpty()) {
                TreeNode node = qNodes.poll();
                int currSum = qSums.poll();

                if (node.left == null && node.right == null) {
                    if (currSum == targetSum) return true;
                }

                if (node.left != null) {
                    qNodes.offer(node.left);
                    qSums.offer(currSum + node.left.val);
                }
                if (node.right != null) {
                    qNodes.offer(node.right);
                    qSums.offer(currSum + node.right.val);
                }
            }

            return false;
        }
        public static void main(String[] args) {
            TreeNode root1 = new TreeNode(5,
                    new TreeNode(4,
                            new TreeNode(11,
                                    new TreeNode(7),
                                    new TreeNode(2)),
                            null),
                    new TreeNode(8,
                            new TreeNode(13),
                            new TreeNode(4, null, new TreeNode(1)))
            );

            System.out.println(hasPathSum(root1, 22)); // true
            System.out.println(hasPathSumBFS(root1, 22)); // true

            TreeNode root2 = new TreeNode(1,
                    new TreeNode(2),
                    new TreeNode(3));

            System.out.println(hasPathSum(root2, 5)); // false
            System.out.println(hasPathSumBFS(root2, 5)); // false

            System.out.println(hasPathSum(null, 0)); // false
        }
    }
}
