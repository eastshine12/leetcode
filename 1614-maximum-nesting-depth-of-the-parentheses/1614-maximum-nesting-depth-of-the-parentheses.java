class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        char[] cArr = s.toCharArray();
        
        int answer = 0;
        for(char c : cArr) {
            if(c == '(' || c == ')') {
                if(stack.isEmpty() || stack.peek() == c) {
                    stack.push(c);
                    if(stack.size() > answer) {
                        answer = stack.size();
                    }
                } else {
                    stack.pop();
                }
            }
            
        }
        
        return answer;
        
    }
}