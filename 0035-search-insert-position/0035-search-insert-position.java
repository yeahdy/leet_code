class Solution {
    public int searchInsert(int[] nums, int target) {
        int result = 0;
		for(int i =0; i < nums.length; i++) {
			if(nums[i] == target) {
				return i;
			}else {
				if(nums[i] > target) {
					return i;
				}
			}
		}
        
        if(result == 0) return nums.length;
		return result;
    }
}