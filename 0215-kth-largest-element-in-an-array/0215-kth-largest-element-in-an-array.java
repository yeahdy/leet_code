class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
		// List<Integer> list = new ArrayList();
		// for(int n : nums) {
		// 	list.add(n);
		// }
		// HashSet<Integer> set = new HashSet<>(list);
		
		return nums[nums.length-k];
        
    }
}