
 
  public class ListNode {//delete nth node from last
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        int size=0;
        ListNode currNode=head;
        while(currNode!=null){
            size++;
            currNode=currNode.next;
        }
        if(n==size){
            return head.next;
        }
        ListNode prev=head;
        int r=size-n;
        int i=1;
        while(i<r){
            prev=prev.next;
            i++;

        }
        prev.next=prev.next.next;
        

        return head;
        
    }
}