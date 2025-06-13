import java.io.*;
import java.util.*;

class Solution {
    static ArrayList<ArrayList<Integer>> arr;
    static int[] ch;
    static int[] result;
    public void point(int v){
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        ch[v] = 1;
        result[v] = 0;
        
        while(!q.isEmpty()){
            for(int i=0;i<q.size();i++){
                int tmp = q.poll();
                
                for(int x: arr.get(tmp)){
                    if(ch[x] == 0){
                        ch[x] = 1;
                        q.offer(x);
                        result[x] = result[tmp]+1;
                    }
                    
                }
            }
        }
            
    }
    public int solution(int n, int[][] edge) {
        int answer = 0;
        ch = new int[n+1];
        result = new int[n+1];
        
        Arrays.fill(result,Integer.MAX_VALUE);
        
        arr = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<=n;i++){
            arr.add(new ArrayList<Integer>());
        }
        
        for(int i=0;i<edge.length;i++){
            int a = edge[i][0];
            int b = edge[i][1];
            
            arr.get(a).add(b);
            arr.get(b).add(a);
        }
       point(1);
    
        int max = Integer.MIN_VALUE;
       for(int i=1;i<=n;i++){
           if(result[i]>max){
               max = result[i];
           }
       }
        for(int x : result){
            if(max ==x ){
                answer++;
            }
        }
        
        
        
        
        return answer;
    }
}