class Solution {
    public int[] sortedSquares(int[] nums) {
        int i= 0;
        int[] result = new int[nums.length];
        for(int num : nums){
            result[i] = (int)Math.pow(num, 2);
            i++;
        }
        Arrays.sort(result);
        return result;
    }
}