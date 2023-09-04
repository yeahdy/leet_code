class Solution {
    //BFS
    /*
    조건에 부합할 경우 Queue에 추가한 후, 중복해서 방문하지 않도록 방문처리 한다.
    queue에서 빼내어 해당 노드를 기준으로 연결되어 있는 모든 노드를 탐색한다
    탐색 중 조건에 맞는 노드를 찾으면 Queue에 추가 > 빼기 > 주변 노드 탐색 과정을 반복한다.
    그러다 Queue가 비면 더 이상 연결되어 있는 노드가 없다는 뜻이므로 탐색을 종료한다.
    */
    public int numIslands(char[][] grid) {
        int islandCount=0;
        int row= grid.length, column= grid[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        int[][] direction = {{1,0},{0,1},{-1,0},{0,-1}};
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                
                if(grid[i][j] == '1'){
                    islandCount++;
                    queue.add(new int[]{i,j});
                    
                    while(!queue.isEmpty()){
                        int[] node = queue.poll();
                        // 해당 노드를 기준으로 하-우-상-좌 탐색
                        for(int[] drt :direction){
                            int r= node[0]+drt[0];
                            int c= node[1]+drt[1];
                            if(r<row && c<column && r>=0 && c>=0 && grid[r][c] == '1'){
                                queue.add(new int[]{r,c});
                                grid[r][c] = 'x';
                            }
                        }
                    }//while
                    
                }//if
                
            }//안쪽
        }//바깥
     
        return islandCount;
    }
}