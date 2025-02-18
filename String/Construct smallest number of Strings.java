class Solution {
    public String smallestNumber(String pattern) {
        int n=pattern.length();
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i <= n;i++){
            stack.push((char) ('1' + i));


            if(i == n || pattern.charAt(i) == 'I'){
                while (!stack.isEmpty()){
                    result.append(stack.pop());


                }
            }
        }


        return result.toString();
        
    }
}
