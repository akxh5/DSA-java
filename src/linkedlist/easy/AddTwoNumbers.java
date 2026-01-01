package linkedlist.easy;

public class AddTwoNumbers{
    //Definition for singly-linkedlist.
    static class ListNode{
        int val;
        ListNode next;
        ListNode (int val){
            this.val=val;
        }
        ListNode(int val, ListNode next){
            this.val=val;
            this.next=next;
        }
    }
    //Time: O(max(n,m))
    //Space: O(max(n,m))
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        while (l1 !=null || l2 != null || carry !=0){
            int sum = carry;
            if (l1 !=null){
                sum+= l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                sum += l2.val;
                l2 =l2.next;
            }
            carry = sum/10;
            int digit = sum%10;
            current.next = new ListNode(digit);
            current = current.next;
        }
        return dummy.next;
    }
    //Helper to print list (local , not leetcode)
    public static void printList (ListNode head){
        while (head!=null){
            System.out.println(head.val);
            if (head.next!=null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //l1 = [2,4,3]
        ListNode l1 = new ListNode(2,
                new ListNode(4,
                        new ListNode(3)));
        //l2 = [5,6,4]
        ListNode l2 = new ListNode(5,
                new ListNode(6,
                        new ListNode(4)));
        ListNode result = addTwoNumbers(l1, l2);
        printList(result);
    }
}
