import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int firstMissingPositive(int[] nums) {
        int result = 0;
    	Arrays.sort(nums);
    	List<Integer> list = new ArrayList<>();
    	
    	for(int num : nums) {
    		if(num > 0) {
    			list.add(num);
    		}
    	}
    	    	
    	// 누락된 최소 정수 n = 배열의 최소정수 < n < 배열의 최대정수
    	int j = 0;
        if(list.size() > 0){
            list = list.stream().distinct().collect(Collectors.toList());
            for(int i= 1; i < list.get(list.size()-1); i++) {
    		    if(list.get(j) != i) {
    			    result = i;
    			    break;
    		    }
    		    j++;
    	    }
            
            if(result == 0) {
        		result = list.get(list.size()-1) + 1; 
            }
        }else {
        	result = 1;
        }
    	
    	
    	return result;
    }
}