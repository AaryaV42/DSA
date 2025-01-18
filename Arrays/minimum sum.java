class Solution {
    String minSum(int[] arr) {
        
        Arrays.sort(arr);
        
        
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        
        
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                num1.append(arr[i]); 
            } else {
                num2.append(arr[i]); 
            }
        }
        
        
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
            
            int sum = digit1 + digit2 + carry;
            carry = sum / 10; 
            result.append(sum % 10); 
            
            i--;
            j--;
        }
        
        
        result.reverse();
        
        
        int start = 0;
        while (start < result.length() - 1 && result.charAt(start) == '0') {
            start++;
        }
        
        return result.substring(start);
    }
}
