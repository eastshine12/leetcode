import java.util.HashMap;

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, Comparator.comparing(Map.Entry::getValue));

        for (Map.Entry<Integer, Integer> entry : list) {
            int key = entry.getKey();
            int value = entry.getValue();
            
            if (value <= k) {
                k -= value;
                map.remove(key);
            } else {
                break;
            }
        }

        return map.size();
    }
}