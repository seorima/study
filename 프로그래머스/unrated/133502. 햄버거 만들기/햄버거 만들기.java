import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> s = new Stack<Integer>();
        for(int i=0;i<ingredient.length;i++){
            s.push(ingredient[i]);
            if(s.size()>=4){
                int size = s.size();
                if(s.get(size-1)==1 && s.get(size-2)==3 && s.get(size-3)==2 && s.get(size-4)==1){
                    answer++;
                    for(int j=0;j<4;j++){
                        s.pop();
                    }
                }
            }
            
            
        }
        
        return answer;
    }
}