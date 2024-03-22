import java.util.*;

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
        
        if(head.next == null) return true;
        
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        
        ListNode curr = head;
        
        while(curr != null) {
            stack.push(curr.val);
            queue.add(curr.val);
            curr = curr.next;
        }
        
        for(int i = 0; i < stack.size(); i++) {
            if(queue.poll() != stack.pop()) return false;
        }
    
        
        return true;
    }
}