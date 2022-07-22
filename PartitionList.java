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
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode();
        ListNode l = less;
        ListNode high = new ListNode();
        ListNode h = high;
        ListNode curr = head;
        while(curr!=null){
            if(curr.val<x){
                less.next = new ListNode(curr.val);
                less=less.next;
            }else{
                high.next = new ListNode(curr.val);
                high = high.next;
            }
            curr = curr.next;
        }
        if(l.next == null){
            return h.next;
        }
        l = l.next;
        h = h.next;
        less.next = h;
        return l;
    }
}
