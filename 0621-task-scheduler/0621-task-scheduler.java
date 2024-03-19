class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        Map<Character, Integer> countMap = new HashMap<>();
        
        int maxFreq = 0;
        int maxCount = 0;

        for (char c : tasks) {
            int count = countMap.getOrDefault(c, 0) + 1;
            countMap.put(c, count);
            
        }
        
        for (int freq : countMap.values()) {
            if (freq > maxFreq) {
                maxFreq = freq;
                maxCount = 1;
            } else if (freq == maxFreq) {
                maxCount++;
            }
        }

        int intervals = (maxFreq - 1) * (n + 1) + maxCount;


        return Math.max(intervals, tasks.length);
        
    }
}