package tree.easy;
import java.util.*;
public class SameTree {
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
// Space: O(h)
        public static boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null) return true;
            if (p == null || q == null) return false;
            if (p.val != q.val) return false;
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        public static boolean isSameTreeIterative(TreeNode p, TreeNode q) {
            Stack<TreeNode[]> stack = new Stack<>();
            stack.push(new TreeNode[]{p, q});

            while (!stack.isEmpty()) {
                TreeNode[] pair = stack.pop();
                TreeNode a = pair[0], b = pair[1];

                if (a == null && b == null) continue;
                if (a == null || b == null) return false;
                if (a.val != b.val) return false;

                stack.push(new TreeNode[]{a.left, b.left});
                stack.push(new TreeNode[]{a.right, b.right});
            }

            return true;
        }
        public static void main(String[] args) {
            TreeNode t1 = new TreeNode(1,
                    new TreeNode(2),
                    new TreeNode(3));

            TreeNode t2 = new TreeNode(1,
                    new TreeNode(2),
                    new TreeNode(3));

            System.out.println(isSameTree(t1, t2)); // true
            System.out.println(isSameTreeIterative(t1, t2)); // true

            TreeNode t3 = new TreeNode(1,
                    new TreeNode(2),
                    null);

            TreeNode t4 = new TreeNode(1,
                    null,
                    new TreeNode(2));

            System.out.println(isSameTree(t3, t4)); // false
            System.out.println(isSameTreeIterative(t3, t4)); // false

            System.out.println(isSameTree(null, null)); // true
        }
    }
}
