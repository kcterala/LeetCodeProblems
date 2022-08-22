/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class RemoveDuplicatesFromSortedListProblem {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode curr = new ListNode(head.val);
        ListNode ans = curr;
        ListNode temp = head;
        while(temp!=null){
            if(temp.val != curr.val){
                curr.next = new ListNode(temp.val);
                curr = curr.next;
            }
            temp=temp.next;
        }
        return ans;
    }
}