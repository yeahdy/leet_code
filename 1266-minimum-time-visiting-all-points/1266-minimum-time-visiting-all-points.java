class Solution {
    // [1,1] -> [3,4] = [2,3]	여기서 더 큰값 
	// [3,4] -> [-1,0] = [-4,-4] 여기서 더 큰값  
	// 1행1열 - 2행1열 / 2행1열 - 3행1열
	// 1행2열 - 2행2열 / 2행2열 - 3행2열
	public static int minTimeToVisitAllPoints(int[][] points) {
		int count = 0;
		for(int i=0; i<points.length; i++) {
			if(i+1 != points.length) {
				int front = Math.abs(points[i][0] - points[i+1][0]);
				int back = Math.abs(points[i][1] - points[i+1][1]);
				
				count += Math.max(front, back);
			}
		}
		
        return count;
    }
}