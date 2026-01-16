package tree.easy;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
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
        public static boolean isSymmetric(TreeNode root) {
            if (root == null) return true;
            return isMirror(root.left, root.right);
        }

        private static boolean isMirror(TreeNode a, TreeNode b) {
            if (a == null && b == null) return true;
            if (a == null || b == null) return false;
            if (a.val != b.val) return false;
            return isMirror(a.left, b.right) && isMirror(a.right, b.left);
        }
        public static boolean isSymmetricIterative(TreeNode root) {
            if (root == null) return true;

            Queue<TreeNode[]> q = new LinkedList<>();
            q.add(new TreeNode[]{root.left, root.right});

            while (!q.isEmpty()) {
                TreeNode[] pair = q.poll();
                TreeNode a = pair[0], b = pair[1];

                if (a == null && b == null) continue;
                if (a == null || b == null) return false;
                if (a.val != b.val) return false;

                q.add(new TreeNode[]{a.left,  b.right});
                q.add(new TreeNode[]{a.right, b.left});
            }

            return true;
        }
        public static void main(String[] args) {
            TreeNode root1 = new TreeNode(1,
                    new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                    new TreeNode(2, new TreeNode(4), new TreeNode(3))
            );

            System.out.println(isSymmetric(root1)); // true
            System.out.println(isSymmetricIterative(root1)); // true

            TreeNode root2 = new TreeNode(1,
                    new TreeNode(2, null, new TreeNode(3)),
                    new TreeNode(2, null, new TreeNode(3))
            );

            System.out.println(isSymmetric(root2)); // false
            System.out.println(isSymmetricIterative(root2)); // false
        }
    }
}
