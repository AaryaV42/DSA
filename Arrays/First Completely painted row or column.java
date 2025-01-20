class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        
        Map<Integer, int[]> valueToPos = new HashMap<>();
        
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                valueToPos.put(mat[i][j], new int[]{i, j});
            }
        }
        
        
        int[] rowCounts = new int[m];
        int[] colCounts = new int[n];
        
        
        for (int i = 0; i < arr.length; i++) {
            int[] pos = valueToPos.get(arr[i]);
            int row = pos[0];
            int col = pos[1];
            
           
            rowCounts[row]++;
            colCounts[col]++;
            
            
            if (rowCounts[row] == n || colCounts[col] == m) {
                return i;
            }
        }
        
      
        return -1;
    }
}
