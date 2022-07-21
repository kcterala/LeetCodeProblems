class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int count =1;
        ListNode current = head;
        ListNode prevNode = null;
        while(count!=left){
            prevNode=current;
            current = current.next;
            count++;
        }
        ListNode tail = current;
        
        
        ListNode newPrev = null;
        while(count<=right){
            ListNode newNext = current.next;
            current.next = newPrev;
            newPrev = current;
            current = newNext;
            count++;
        }
        if(prevNode!=null){
            prevNode.next = newPrev;
        }else{
            head = newPrev;
        }
        tail.next = current;
        return head;
    }
}
