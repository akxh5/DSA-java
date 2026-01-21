package linkedlist.easy;

public class LinkedListCycle {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
        public static boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) return false;

            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    return true; // cycle detected
                }
            }

            return false; // no cycle
        }
        public static boolean hasCycleSet(ListNode head) {
            java.util.HashSet<ListNode> set = new java.util.HashSet<>();
            while (head != null) {
                if (!set.add(head)) return true;
                head = head.next;
            }
            return false;
        }
        public static void main(String[] args) {
            // Example 1: [3,2,0,-4], pos = 1 (cycle)
            ListNode head1 = new ListNode(3);
            ListNode node2 = new ListNode(2);
            ListNode node3 = new ListNode(0);
            ListNode node4 = new ListNode(-4);
            head1.next = node2;
            node2.next = node3;
            node3.next = node4;
            node4.next = node2; // cycle

            System.out.println(hasCycle(head1)); // true

            // Example 2: [1,2], pos = 0 (cycle)
            ListNode head2 = new ListNode(1);
            ListNode node22 = new ListNode(2);
            head2.next = node22;
            node22.next = head2; // cycle
            System.out.println(hasCycle(head2)); // true

            // Example 3: [1], pos = -1 (no cycle)
            ListNode head3 = new ListNode(1);
            System.out.println(hasCycle(head3)); // false
        }
    }
}
