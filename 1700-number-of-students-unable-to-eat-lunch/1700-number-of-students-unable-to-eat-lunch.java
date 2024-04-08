class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        int len = students.length;
        
        Deque<Integer> studentDeque = new LinkedList<>();
        Deque<Integer> sandwichDeque = new LinkedList<>();
        
        for(int i = 0; i < len; i++) {
            studentDeque.add(students[i]);
            sandwichDeque.add(sandwiches[i]);
        };
        
        int cnt = 0;
        while(!studentDeque.isEmpty() && cnt < len*len) {
            if(studentDeque.peek() == sandwichDeque.peek()) {
                studentDeque.poll();
                sandwichDeque.poll();
            } else {
                int tmp = studentDeque.poll();
                studentDeque.add(tmp);
            }
            
            cnt++;
        }
        
        return studentDeque.size();
    }
}