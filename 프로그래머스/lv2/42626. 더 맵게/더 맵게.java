import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int x : scoville){
            q.offer(x);
        }
        int sum = 0;
        
    
        while(q.peek() < K){
            if(q.size()==1){
                return -1;
            }
            int a = q.poll();
            int b = q.poll();
            
            sum = a+(b*2);
            q.offer(sum);
            answer++;
        }
        
        return answer;
        
    }
    
}