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
        
        List<Integer> list = new ArrayList<>();

        ListNode current = list1;
        int i = 0;
        
        while(current != null) {
            if(a > i) {
                list.add(current.val);
            } else if(a == i) {
                ListNode current2 = list2;
                while(current2 != null) {
                    list.add(current2.val);
                    current2 = current2.next;
                }
            } else if(b < i) {
                list.add(current.val);
            }
            current = current.next;
            i++;
        }

        ListNode answer = new ListNode(list.get(0));
        ListNode currentAnswer = answer;
        for(int j = 1; j < list.size(); j++) {
            currentAnswer.next = new ListNode(list.get(j));
            currentAnswer = currentAnswer.next;
        }
        
        return answer;
        
    }
    
}