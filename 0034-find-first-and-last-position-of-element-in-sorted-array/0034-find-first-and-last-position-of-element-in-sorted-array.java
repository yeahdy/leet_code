class Solution {
     /*
        [이진탐색 O(log n)]
        mid의 값과 찾는 원소를 비교하여 같으면 탐색 종료.
        1) left와 right의 중간값(mid)를 계산한다.
            1-1) mid의 값이 찾는 원소보다 작을 경우, left를 mid+1 한 후 다시 2) 반복.
            1-2) mid의 값이 찾는 원소보다 클 경우, right를 mid-1 한 후 다시 2) 반복.

        만약 left > right 가 되면 해당 배열에 찾는 원소가 없다는 뜻.
        
        \U0001f4a1핵심포인트
        중복되는 원소가 있기 때문에 왼쪽범위와 오른쪽범위를 나눠서 찾아야한다.
    */
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
	    int[] result = {-1, -1};
	    if(nums.length == 0) return result;
	    
	    // 왼쪽 범위를 기준으로 이동은 왼쪽만 한다.
	    while (left < right) {
	      int mid = (left + right)/2;
	      
	      if(nums[mid] < target){	//중간지점보다 타겟이 더 클 경우 왼쪽범위 기준으로 중간지점 뒤는 볼필요 없다.	
	    	  left = mid + 1;		//left는 중간지점의 한칸 앞으로 간다.
	      }else{					//중간지점==타겟이거나, 중간지점보다 타겟이 더 작을 경우 오른쪽범위 기준으로 중간지점 뒤는 볼 필요 없다.
	    	  right = mid;			//right는 중간지점으로 간다.
	      }
	    }
	    if(nums[left] == target) result[0] = left;
	    
	    // 오른쪽 범위를 기준으로 이동은 오른쪽만 한다.
	    right = nums.length - 1;		//right는 끝에서부터 다시 시작
	    while (left < right) {
	      int mid = (left + right)/2 + 1;  //기존의 mid를 계산하는 방법은 가장 낮은 정수에 반올림하기 때문에 왼쪽을 기준으로 계산된다. 따라서 +1 을 하여 오른쪽을 기준으로 한다. 
	      if(nums[mid] > target){	//중간지점보다 타겟이 더 작을 경우 오른쪽범위 기준으로 중간지점 뒤는 볼필요 없다.	
	    	  right = mid - 1;		//right는 중간지점의 한칸 앞으로 간다.
	      }else{ 
	    	  left = mid;			//중간지점==타겟이거나, 중간지점보다 타겟이 더 클 경우 왼쪽범위 기준으로 중간지점 뒤는 볼 필요 없다.
	      }
	    }
	    if (nums[right] == target) result[1] = right;
	    
	    return result;
    }
}