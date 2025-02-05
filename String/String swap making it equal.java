class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
       
        if (s1.equals(s2)) {
            return true;
        }
        
       
        List<Integer> mismatches = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                mismatches.add(i);
                
                if (mismatches.size() > 2) {
                    return false;
                }
            }
        }
        
     
        if (mismatches.size() == 2) {
            int i = mismatches.get(0);
            int j = mismatches.get(1);
           
            return s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i);
        }
        
   
        return false;
    }
}
