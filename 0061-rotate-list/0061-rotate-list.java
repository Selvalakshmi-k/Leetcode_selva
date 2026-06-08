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
    public ListNode rotateRight(ListNode head, int k) {
       ListNode dummy=head;
       if(head==null)
       return head;
       int length=1;
       while(dummy.next!=null){
        length++;
        dummy=dummy.next;
       } 
       int pos=k%length;
       if(pos==0){
        return head;
       }
       ListNode curr=head;
       for(int i=0;i<length-pos-1;i++){
        curr=curr.next;
       }
       ListNode newhead=curr.next;
       curr.next=null;
       dummy.next=head;

       return newhead;
    }
}