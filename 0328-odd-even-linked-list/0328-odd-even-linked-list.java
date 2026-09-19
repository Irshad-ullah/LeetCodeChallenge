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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return head;
        ListNode current = head;
        int n = 0;
        while(current != null){
            current = current.next;
            n++;
        }
        current = head;
        int index = 1;
        for(int j = 0; j < Math.floor((n-1)/2); j++){
            ListNode prev = current;
            ListNode temp = prev.next;
            for(int i = 0; i<index; i++){
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
            temp.next = current.next;
            current.next = temp;
            current = current.next;
            index++;
        }
        return head;
    }
}