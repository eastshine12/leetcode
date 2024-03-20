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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = list1;
        
        ListNode prev = dummy;
        for (int i = 0; i < a; i++) {
            prev = prev.next;
        }
        
        ListNode curr = prev.next;
        for (int i = a; i <= b; i++) {
            curr = curr.next;
        }
        
        prev.next = list2;
        
        ListNode list2Tail = list2;
        while (list2Tail.next != null) {
            list2Tail = list2Tail.next;
        }
        
        list2Tail.next = curr;
        
        return dummy.next;
        
    }
    
}