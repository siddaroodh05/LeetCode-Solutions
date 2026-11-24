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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)return head;
        ListNode current=head;
        int len=0;
        while(current!=null){
         current=current.next;
         len++;
        } 
        if(len==n){
            return head.next;
        }
        int deleteindex=len-n;
        ListNode recent=head;
        for(int i=1;i<deleteindex;i++){
            recent=recent.next;
        }
        if(recent!=null && recent.next!=null){
            recent.next=recent.next.next;
        }

      return head;
    }
}