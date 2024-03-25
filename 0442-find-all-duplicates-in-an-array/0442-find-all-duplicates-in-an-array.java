class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        List<Integer> list = map.entrySet()
            .stream()
            .filter(entry -> entry.getValue() > 1)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
        
        return list;
        
    }
}