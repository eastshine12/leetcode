class Solution {
    public int islandPerimeter(int[][] grid) {
        
        int answer = 0;
        int row = grid.length;
        int col = grid[0].length;
        
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(grid[i][j] == 1) 
                    answer += checkPerimeter(grid, i, j);
            }
        }
        
        return answer;
    }
    
    private int checkPerimeter(int[][] grid, int x, int y) {
        int cnt = 0;
        
        if(x == 0 || grid[x-1][y] == 0) {
            cnt += 1;
        }
        if(x == grid.length-1 || grid[x+1][y] == 0) {
            cnt += 1;
        }
        if(y == 0 || grid[x][y-1] == 0) {
            cnt += 1;
        }
        if(y == grid[0].length-1 || grid[x][y+1] == 0) {
            cnt += 1;
        }

        return cnt;
    }
}