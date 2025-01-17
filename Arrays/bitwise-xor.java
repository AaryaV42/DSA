class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        
        int totalXOR = 0;
        for (int num : derived) {
            totalXOR ^= num;
        }
        
        
        if (totalXOR != 0) {
            return false;
        }
        
        
        int n = derived.length;
        int[] original = new int[n];
        original[0] = 0; 
        
        
        for (int i = 0; i < n - 1; i++) {
            original[i + 1] = original[i] ^ derived[i];
        }
        
        
        if ((original[n - 1] ^ original[0]) == derived[n - 1]) {
            return true;
        } else {
            return false;
        }
    }
}
