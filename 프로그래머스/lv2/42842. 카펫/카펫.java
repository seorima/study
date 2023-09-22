import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        
        for(int i=1;i<=total;i++){
            if(total % i == 0){
                int row = i;
                int col = total/i;
                
                if(row>=col && (row-2)*(col-2)==yellow){
                    answer[0] = row;
                    answer[1] = col;
                    return answer;
                }
            }
        }
        
        
        return answer;
    }
}