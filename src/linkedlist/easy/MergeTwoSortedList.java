package linkedlist.easy;

public class MergeTwoSortedList {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
        ListNode(int val, ListNode next){
            this.val=val;
            this.next=next;
        }
    }
    //Time:O(n+m)
    //Space:O(1)
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        //Dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1!=null && list2!= null){
            if (list1.val<=list2.val){
                current.next = list1;
                list1 = list1.next;
            }else{
                current.next = list2;
                list2=list2.next;
            }
            current=current.next;
        }
        //Attach remaining nodes
        current.next = (list1!=null)?list1:list2;
        return dummy.next;
    }
    private static void printList(ListNode head){
        while (head!=null){
            System.out.print(head.val);
            if (head.next!=null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //list 1=[1,2,4]
        ListNode list1=new ListNode(1, new ListNode(2,new ListNode(4)));
        //list 2=[1,3,4]
        ListNode list2=new ListNode(1,new ListNode(3, new ListNode(4)));

        ListNode merged = mergeTwoLists(list1, list2);
        printList(merged); //1->1->2->3->4->4
        //Edge Cases
        printList(mergeTwoLists(null,null)); //empty
        printList(mergeTwoLists(null, new ListNode(0))); //0
    }
}
