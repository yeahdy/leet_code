class Solution {
    public int islandPerimeter(int[][] grid) {
       /*
       [[0,1,0,0],
        [1,1,1,0],
        [0,1,0,0],
        [1,1,0,0]]
        
        맞닿아 있는 면의 갯수 만큼 -1
        
                       grid[i-1][j]
         grid[i][j-1]  grid[i][j]    grid[i][j+1]
                       grid[i+1][j]
       */
        
        // count: 호수와 맞닿아 있는 면의 갯수
        int count= 0, result= 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == 1){
                    //상
                    if(i-1 >= 0){
                        if(grid[i-1][j] == 1) count++;
                    }
                    //하
                    if(i+1 < grid.length){
                        if(grid[i+1][j] == 1) count++;
                    }
                    //좌
                    if(j-1 >= 0){
                        if(grid[i][j-1] == 1) count++;
                    }
                    //우
                    if(j+1 < grid[i].length){
                        if(grid[i][j+1] == 1) count++;
                    }
                    
                    result += 4-count;
                    count=0;    // 다음 땅의 맞닿은 면의 갯수를 위해 초기화
                }
            }
            
        }
        
        return result;
    }
}