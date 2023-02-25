class Solution {
    public void moveZeroes(int[] nums) {
        // 0의 갯수 만큼 처음부터 끝까지를 몇번 반복할지 구한다.
        int count = 0;
		for(int n : nums) {
			if(n == 0) count++;
		}
        
        // 0이 있을 경우 다음의 배열값과 앞뒤로 자리를 바꾼다.
		for(int j =0; j<count; j++) {
			for(int i=0; i < nums.length; i++) {
				if(nums[i] == 0 && i+1 != nums.length) {
					nums[i] = nums[i+1];
					nums[i+1] = 0;
				}
			}
			
		}
    }
}