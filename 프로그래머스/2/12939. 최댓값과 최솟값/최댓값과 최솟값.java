import java.util.*;
import java.io.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");
        int[] result = new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            result[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(result);
        
        int min = result[0];
        int max = result[result.length-1];
        
        return min + " " + max;
    }
}