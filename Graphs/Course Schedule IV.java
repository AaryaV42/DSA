class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        
        boolean[][] reachable = new boolean[numCourses][numCourses];
        
        
        for (int[] prerequisite : prerequisites) {
            int courseA = prerequisite[0];
            int courseB = prerequisite[1];
            reachable[courseA][courseB] = true;
        }
        
       
        for (int k = 0; k < numCourses; k++) {
            for (int i = 0; i < numCourses; i++) {
                for (int j = 0; j < numCourses; j++) {
                    reachable[i][j] = reachable[i][j] || (reachable[i][k] && reachable[k][j]);
                }
            }
        }
        
       
        List<Boolean> result = new ArrayList<>();
        for (int[] query : queries) {
            int courseU = query[0];
            int courseV = query[1];
            result.add(reachable[courseU][courseV]);
        }
        
        return result;
    }
}
