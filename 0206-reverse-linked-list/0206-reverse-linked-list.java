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
        
        ListNode answer = null;
        ListNode currNode = head;
        
        while(currNode != null) {
            ListNode nextNode = currNode.next;
            currNode.next = answer;
            answer = currNode;
            currNode = nextNode;
        }
        
        return answer;
        
    }
}