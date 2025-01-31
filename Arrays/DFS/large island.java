import java.util.*;

class Solution {
    private int n;
    private int[][] grid;
    private int islandId;
    private Map<Integer, Integer> islandSizes;

    public int largestIsland(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
        this.islandId = 2; 
        this.islandSizes = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int size = dfs(i, j, islandId);
                    islandSizes.put(islandId, size);
                    islandId++;
                }
            }
        }

        //this will find the best flip position
        int maxSize = islandSizes.isEmpty() ? 0 : Collections.max(islandSizes.values());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    Set<Integer> neighboringIslands = new HashSet<>();
                    //this will check all four directions 
                    if (i > 0 && grid[i - 1][j] > 1) neighboringIslands.add(grid[i - 1][j]);
                    if (i < n - 1 && grid[i + 1][j] > 1) neighboringIslands.add(grid[i + 1][j]);
                    if (j > 0 && grid[i][j - 1] > 1) neighboringIslands.add(grid[i][j - 1]);
                    if (j < n - 1 && grid[i][j + 1] > 1) neighboringIslands.add(grid[i][j + 1]);

                    int totalSize = 1; 
                    for (int island : neighboringIslands) {
                        totalSize += islandSizes.get(island);
                    }

                    maxSize = Math.max(maxSize, totalSize);
                }
            }
        }

        return maxSize;
    }

    private int dfs(int i, int j, int islandId) {
        if (i < 0 || i >= n || j < 0 || j >= n || grid[i][j] != 1) {
            return 0;
        }
        grid[i][j] = islandId; 
        int size = 1;
    
        size += dfs(i - 1, j, islandId);
        size += dfs(i + 1, j, islandId);
        size += dfs(i, j - 1, islandId);
        size += dfs(i, j + 1, islandId);
        return size;
    }
}
