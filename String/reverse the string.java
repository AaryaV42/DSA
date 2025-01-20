import java.util.*;
import java.io.*;

public class Solution {
    public static String reverseString(String str) {
        
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;

       
        while (left < right) {
            
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

          
            left++;
            right--;
        }

       
        return new String(charArray);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); 

        for (int i = 0; i < T; i++) {
            String str = br.readLine(); 
            System.out.println(reverseString(str)); 
        }
    }
}
