class Solution {
    public int longestkSubstr(String s, int k) {
        int n = s.length();
        if (n == 0 || k == 0 || k > n) {
            return -1;
        }

        Map<Character, Integer> charCount = new HashMap<>();
        int left = 0; 
        int maxLen = 0; 

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
           
            charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);

          
            while (charCount.size() > k) {
                char leftChar = s.charAt(left);
                charCount.put(leftChar, charCount.get(leftChar) - 1);
                if (charCount.get(leftChar) == 0) {
                    charCount.remove(leftChar);
                }
                left++;
            }

            
            if (charCount.size() == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        
        return maxLen > 0 ? maxLen : -1;
    }
}