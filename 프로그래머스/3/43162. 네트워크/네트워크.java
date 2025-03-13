import java.io.*;
import java.util.*;

class Solution {
    public void DFS(int n,int node, int[] ch,int[][] computers){
            for(int j=0;j<n;j++){
                if(ch[j] == 0 && computers[node][j]==1){
                    ch[j] = 1;
                    DFS(n,j,ch,computers);
                }
            }
    }
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int[] ch = new int[n];
        
        for(int i=0;i<n;i++){
            if(ch[i] == 0){
                answer++;
                ch[i] = 1;
                DFS(n,i,ch,computers);
            }
        }
        
        return answer;
    }
}