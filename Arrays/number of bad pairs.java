class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        
        int[] diff = new int[n];
        for (int i = 0; i < n; i++) {
            diff[i] = nums[i] - i;
        }

        
        Map<Integer, Integer> freq = new HashMap<>();
        for (int d : diff) {
            freq.put(d, freq.getOrDefault(d, 0) + 1);
        }

        
        long goodPairs = 0;
        for (int key : freq.keySet()) {
            long k = freq.get(key);
            goodPairs += k * (k - 1) / 2; 
        }

        
        long totalPairs = (long) n * (n - 1) / 2;

        
        long badPairs = totalPairs - goodPairs;

        return badPairs;
    }
}
