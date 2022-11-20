class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
    	if(nums.length == 1) {
    		return nums[0];
    	}
    	
    	
    	for(int i=0; i < nums.length; i++) {
    		int twice= 0;
    		
    		for(int j=0; j<nums.length; j++) {
    			if(nums[i] == nums[j]) {
    				twice++;
    			}
    			if(twice > 1) break;
    		}
    		
    		if(twice < 2){
    			result = nums[i];
    			break;
    		}
    	}
    	
        return result;
        
    }
}