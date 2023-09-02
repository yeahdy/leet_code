class Solution {

    public int numIslands(char[][] grid) {
        int islandsCount = 0;
        if(grid.length == 0) return islandsCount;
        
        int row = grid.length, column = grid[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i, j, row, column);
                    islandsCount += 1;
                }
            }
        }
        
        return islandsCount;
    }
    
    private void dfs(char[][] grid, int i, int j, int row, int column){
        if(i == row || j == column || i < 0 || j < 0 || grid[i][j] != '1'){
            return;
        }
        // 발견한 '1'인 지점에 방문표시'x'
        grid[i][j] = 'x';
        
        // '1'을 찾기 위해 네방향으로 돌기
        dfs(grid, i+1, j, row, column); //아래
        dfs(grid, i, j+1, row, column); //오른쪽
        dfs(grid, i-1, j, row, column); //위
        dfs(grid, i, j-1, row, column); //왼쪽
    }
    
}