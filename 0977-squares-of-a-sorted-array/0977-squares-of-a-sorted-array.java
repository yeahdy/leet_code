class Solution {
    public int[] sortedSquares(int[] arr) {
        // int i= 0;
        // int[] result = new int[nums.length];
        // for(int num : nums){
        //     result[i] = (int)Math.pow(num, 2);
        //     i++;
        // }
        // Arrays.sort(result);
        // return result;
        
        // Point! 두 개의 포인터를 이용하여 동시에 비교하기 때문에 빠르게 정렬이 가능하다.
        int L = 0, R = arr.length-1;
        int nums[] = new int[arr.length];
        for(int i = nums.length-1; i>=0; i--){
            if(Math.abs(arr[L])>=Math.abs(arr[R])){
                System.out.println("Left :: "+arr[L]);
                nums[i]=arr[L]*arr[L];
                L++;
            }
            else{
                System.out.println("Right :: "+arr[R]);
                nums[i] =arr[R]*arr[R];
                R--;
            }
            System.out.println("nums[i] :: "+ nums[i]);
        }
        return nums;
        
    }
    
}
