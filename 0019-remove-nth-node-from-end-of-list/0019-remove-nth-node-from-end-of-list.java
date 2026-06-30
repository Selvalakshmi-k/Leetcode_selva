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
        if(head==null){
            return null;
        }

        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        if (n == c) {
            head = head.next;
            return head;
        }
        int access=c-n;
        ListNode temp1=head;
        for(int i=0;i<access-1;i++){
            temp1=temp1.next;
        }
        temp1.next=temp1.next.next;
        return head;
    }
}