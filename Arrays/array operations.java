class Solution {
    public static int arrayOperations(int n, int[] arr) {
        
        boolean hasZero = false;
        for (int num : arr) {
            if (num == 0) {
                hasZero = true;
                break;
            }
        }
        
       
        if (!hasZero) {
            return -1;
        }
        
        
        int operations = 0;
        boolean inNonZeroSegment = false;
        
        for (int num : arr) {
            if (num != 0) {
                if (!inNonZeroSegment) {
                    operations++;
                    inNonZeroSegment = true;
                }
            } else {
                inNonZeroSegment = false;
            }
        }
        
        return operations;
    }
}
