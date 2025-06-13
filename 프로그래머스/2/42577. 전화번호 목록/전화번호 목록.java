import java.io.*;
import java.util.*;

class Solution {
    public boolean solution(String[] book) {
        boolean answer = true;
        Map<String, Integer> map = new HashMap<>();
        
        for(int i =0;i<book.length;i++){
            map.put(book[i],map.getOrDefault(book[i],0)+1);
        }
        
        for(String str : book){
            for(int i=1;i<str.length();i++){
                String tmp = str.substring(0,i);
                if(map.containsKey(tmp)){
                    answer = false;
                    break;
                }
            }
        }
        
        
        
        
        return answer;
    }
}