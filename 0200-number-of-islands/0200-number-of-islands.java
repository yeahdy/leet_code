class Solution {
    /*
    [BFS 풀이]
    1. 이중 for문을 돌면서 시작 노드가 target과 부합한다면 queue에 추가, 방문표시 한다.
    -> 이때 해당 노드를 중심으로 연결된 모든 노드를 찾기 때문에 이미 하나의 섬을 찾았다는 뜻
    
    2. 추가한 노드를 기준으로 연결되어 있는 주변 노드를 네 방향으로 탐색한다.
    
    3. 주변 노드들 중 조건에 부합하는 target이 있다면 queue에 추가, 방문표시
    -> 부합하지 않는다면 다음으로 넘어간다.
    
    4. 추가한 노드를 뽑고, 다시 해당 노드를 기준으로 연결된 노드 탐색
    -> queue가 비어질때 까지 2.3.을 반복한다.
    queue가 비어 있다는 뜻은 연결되어 있는 모든 노드를 다 순회했다는 뜻
    
    5. 더 이상 queue 반복문을 돌지 않고, 반복문을 탈출한 후 다음 연결된 노드를 찾으러 간다.
    */
    public int numIslands(char[][] grid) {
        int islandCount= 0;
        int row = grid.length, colmn = grid[0].length;
        if(row == 0) return islandCount;
        
        Queue<int[]> queue = new LinkedList<>();
        int[][] direction = {{1,0},{0,1},{-1,0},{0,-1}};
        
        for(int i=0; i<row; i++){
            for(int j=0; j<colmn; j++){
                
                if(grid[i][j] == '1'){
                    islandCount += 1;
                    queue.add(new int[]{i,j});
                    grid[i][j] = 'x';
                    
                    while(!queue.isEmpty()){
                        int[] node = queue.poll();
                        for(int[] d : direction){
                            int r= node[0] + d[0];
                            int c= node[1] + d[1];
                            if(r<row && c<colmn && r >= 0 && c >= 0 && grid[r][c] == '1'){
                                //System.out.printf("grid[%d][%d]\n",r,c);
                                queue.add(new int[]{r,c});
                                grid[r][c] = 'x';
                            }
                        }
                    }
                }//if
                
            }//안쪽for
        }//바깥for
        
        return islandCount;
    }

}