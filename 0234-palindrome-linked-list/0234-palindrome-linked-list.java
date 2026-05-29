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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode fh=head;
        ListNode sh=slow;
        sh=rev(sh);
       
        while(sh!=null){
            if(fh.val!=sh.val){
                return false;
            }
            sh=sh.next;
            fh=fh.next;
        }
        return true;
    }
        ListNode rev(ListNode curr){
            ListNode prev=null;
            ListNode next=null;
            while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            }
            return prev;
        }
}