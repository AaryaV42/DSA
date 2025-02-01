class Solution {
    int countPairs(int arr[], int target) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int count = 0;

        while (left < right) {
            int currentSum = arr[left] + arr[right];

            if (currentSum == target) {
                
                int leftCount = 1;
                while (left + leftCount < right && arr[left + leftCount] == arr[left]) {
                    leftCount++;
                }

                
                int rightCount = 1;
                while (right - rightCount > left && arr[right - rightCount] == arr[right]) {
                    rightCount++;
                }

                
                count += leftCount * rightCount;

                
                left += leftCount;
                right -= rightCount;
            } else if (currentSum < target) {
                left++; 
            } else {
                right--; 
            }
        }

        return count;
    }
}
