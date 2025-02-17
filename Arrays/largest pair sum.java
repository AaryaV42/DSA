class Solution {
    public static int pairsum(int[] arr) {
       
        int first= Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        
        
        
        for (int num : arr) {
           
            if (num > first) {
                second = first;  
                first = num;   
            }
            
            else if (num > second) {
                second = num;   
            }
        }

       
        return first + second;
    }

   
    public static void main(String[] args) {
        int[] arr1 = {12, 34, 10, 6, 40};
        int[] arr2 = {10, 20, 30};

        System.out.println(pairsum(arr1));  
        System.out.println(pairsum(arr2));  
    }
}
