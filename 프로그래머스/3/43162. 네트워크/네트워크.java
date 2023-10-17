import java.util.*;
import java.io.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] ch = new boolean[n];
        
        //  for(int i = 0; i < n; i++){
        //     ch[i] = false;
        // }
        
        for(int i=0;i<n;i++){
            if(ch[i]==false){
                answer++;
                DFS(i,ch,computers);
            }
        }
        
        return answer;
    }
    
    public void DFS(int node, boolean[] ch, int[][] computers){
        ch[node] = true;
        
        for(int i=0;i<computers.length;i++){
            if(ch[i]==false && computers[node][i] == 1){
                DFS(i,ch,computers);
            }
        }
        
    }
}