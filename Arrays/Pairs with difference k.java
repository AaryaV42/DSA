class Solution {
    int countPairs(int[] arr, int k) {
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int x = entry.getKey();
            int freqX = entry.getValue();

            if (k == 0) {
                
                
                count += freqX * (freqX - 1) / 2;
            } else {
            
                if (frequencyMap.containsKey(x + k)) {
                    count += freqX * frequencyMap.get(x + k);
                }
            }
        }

        return count;
    }
}
