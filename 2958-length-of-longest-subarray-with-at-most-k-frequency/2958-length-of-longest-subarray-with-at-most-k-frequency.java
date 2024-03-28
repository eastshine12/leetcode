/*
    슬라이딩 윈도우
*/

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {

        int ans = 0;
        int start = -1;
        Map<Integer, Integer> frequency = new HashMap();
        
        // 배열을 반복하면서 윈도우를 이동하고 서브 배열의 길이를 계산
        for (int end = 0; end < nums.length; end++) {
            
            // 현재 요소의 빈도를 해시맵에 추가
            frequency.put(nums[end], frequency.getOrDefault(nums[end], 0) + 1);
            
            // 유효성을 유지하기 위해 윈도우를 이동
            while (frequency.get(nums[end]) > k) {
                // 유효성을 위반하는 경우, start 인덱스를 증가시켜서 윈도우를 이동
                start++;
                // start 인덱스에 해당하는 요소의 빈도를 감소시킴
                frequency.put(nums[start], frequency.get(nums[start]) - 1);
            }
            
            // 현재 서브 배열의 길이를 최대값과 비교하여 갱신
            ans = Math.max(ans, end - start);
        }
        
        return ans;
    }
}