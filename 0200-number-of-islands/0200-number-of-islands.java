class Solution {
    // DFS
    /*
    이중for문을 통해 전체 노드를 순회한다.
    만약 target에 일치하는 노드가 있다면 방문처리 후 깊이 탐색 시작
    해당 노드로 부터 하-우-상-좌 네 방향을 돌면서 target과 일치하는 노드를 찾는다.
    target의 조건에 부합하지 않다면 깊이 탐색을 멈추고, 다음 방향으로 이동한다.
    하나의 노드로 부터 연결된 깊이 탐색을 모두 순회한 후, 호출한 곳으로 다시 돌아간다.
    */
    public int numIslands(char[][] grid) {
        int islandCount= 0;
        int row= grid.length, column= grid[0].length;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){               
                if(grid[i][j] == '1'){
                    dfs(grid, i, j, row, column);
                    islandCount++;
                }
                
            }
        }
        return islandCount;
    }
    
    private void dfs(char[][] grid, int i, int j, int row, int column){
        if(i<0 || j<0 || i>=row || j>=column || grid[i][j] != '1') return;
        
        // 방문처리
        grid[i][j] = 'x';
        // 하-우-상-좌 네 방향 순회
        dfs(grid, i+1, j, row, column);
        dfs(grid, i, j+1, row, column);
        dfs(grid, i-1, j, row, column);
        dfs(grid, i, j-1, row, column);
    }
}














