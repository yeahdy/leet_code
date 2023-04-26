class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // m+n = 합했을 경우 전체 배열 길이
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
    }
}