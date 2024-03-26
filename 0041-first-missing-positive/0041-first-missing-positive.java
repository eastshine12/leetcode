/*
    배열 내의 숫자를 해당 숫자가 가리키는 인덱스로 이동시키고,
    모든 숫자가 올바른 위치에 있게 조정한 후, 빠진 가장 작은 양의 정수를 찾는다.
*/

class Solution {
    public int firstMissingPositive(int[] nums) {
        
        for(int i = 0; i < nums.length; i++) {
            while(nums[i] > 0 && nums[i] <= nums.length && nums[nums[i]-1] != nums[i]) {
                // 인덱스 i-1의 자리에 num[i]를 스왑
                int tmp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = tmp;
            }
        }
                  
        for(int i = 0; i < nums.length; i++) {
            // 제자리에 없는 첫번째 숫자 반환
            if(nums[i] != i+1) {
                return i+1;
            }
        }
                  
        return nums.length + 1;
        
    }
}