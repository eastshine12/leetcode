class Solution {
    public int numIslands(char[][] grid) {
        
        int answer = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1' && !visited[i][j]) {
                    dfs(grid, i, j, visited);
                    answer++;
                }
            }
        }
        
        return answer;
    }
    
    
    
    private void dfs(char[][] grid, int x, int y, boolean[][] visited) {
        
        if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == '0' || visited[x][y]) {
            return;
        }
        
        visited[x][y] = true;
        
        dfs(grid, x+1, y, visited);
        dfs(grid, x-1, y, visited);
        dfs(grid, x, y+1, visited);
        dfs(grid, x, y-1, visited);

    }
}