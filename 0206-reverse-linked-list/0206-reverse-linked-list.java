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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode list2 = head;
        ListNode current = head.next;
        list2.next = null;
        while( current != null){
            ListNode prev = current;
            current = current.next;
            prev.next = list2;
            list2 = prev;
        }
        return list2;     
    }
}