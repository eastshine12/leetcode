/*
    슬라이딩 윈도우와 투 포인터 기법을 사용
*/

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0; // k가 1보다 작거나 같으면 어떠한 하위 배열도 곱이 k보다 작을 수 없음
        
        int count = 0;
        int product = 1;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right]; // 현재 요소를 곱에 추가

            while (product >= k) { // 곱이 k보다 크거나 같으면
                product /= nums[left]; // 가장 왼쪽 요소를 곱에서 제거
                left++; // 시작 인덱스를 오른쪽으로 이동
            }

            count += right - left + 1; // 현재 하위 배열의 길이만큼 가능한 하위 배열의 수 추가
        }

        return count;
    }
    

}