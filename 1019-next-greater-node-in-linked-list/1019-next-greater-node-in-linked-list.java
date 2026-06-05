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
    public int[] nextLargerNodes(ListNode head) {
        int size=0;
        ListNode dummy=head;
        while(dummy!=null){
            size++;
            dummy=dummy.next;
        }
        int[] ans=new int[size];
        ListNode temp=head;
        int index=0;
        while(temp!=null){
            ListNode dupli=temp.next;
            int data=temp.val;
            int greater=0;
            while(dupli!=null){
                int data1=dupli.val;
                if(data1>data){
                    // temp.next=dupli;
                    greater=data1;
                    break;
                }
                dupli=dupli.next;
            }
            ans[index++]=greater;
            temp=temp.next;
        }
        return ans;
    }
}