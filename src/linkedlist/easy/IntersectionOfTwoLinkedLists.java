package linkedlist.easy;

public class IntersectionOfTwoLinkedLists {

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

        public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null) return null;

            ListNode pA = headA;
            ListNode pB = headB;

            while (pA != pB) {
                pA = (pA == null) ? headB : pA.next;
                pB = (pB == null) ? headA : pB.next;
            }

            return pA; // can be null or intersection node
        }
        public static ListNode getIntersectionNodeLength(ListNode headA, ListNode headB) {
            int lenA = 0, lenB = 0;
            ListNode a = headA, b = headB;

            while (a != null) { lenA++; a = a.next; }
            while (b != null) { lenB++; b = b.next; }

            a = headA;
            b = headB;

            if (lenA > lenB) {
                for (int i = 0; i < lenA - lenB; i++) a = a.next;
            } else {
                for (int i = 0; i < lenB - lenA; i++) b = b.next;
            }

            while (a != null && b != null) {
                if (a == b) return a;
                a = a.next;
                b = b.next;
            }

            return null;
        }
        public static void main(String[] args) {
            // Example 1
            ListNode common = new ListNode(8, new ListNode(4, new ListNode(5)));

            ListNode headA = new ListNode(4, new ListNode(1, common));
            ListNode headB = new ListNode(5, new ListNode(6, new ListNode(1, common)));

            ListNode ans = getIntersectionNode(headA, headB);
            System.out.println(ans != null ? ans.val : "null"); // 8

            // Example 2
            ListNode common2 = new ListNode(2, new ListNode(4));

            ListNode headA2 = new ListNode(1, new ListNode(9, new ListNode(1, common2)));
            ListNode headB2 = new ListNode(3, common2);

            ListNode ans2 = getIntersectionNode(headA2, headB2);
            System.out.println(ans2 != null ? ans2.val : "null"); // 2

            // Example 3: No intersection
            ListNode headA3 = new ListNode(2, new ListNode(6, new ListNode(4)));
            ListNode headB3 = new ListNode(1, new ListNode(5));

            ListNode ans3 = getIntersectionNode(headA3, headB3);
            System.out.println(ans3 != null ? ans3.val : "null"); // null
        }
    }
}