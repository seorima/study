import java.io.*;
import java.util.*;

class Point{
    public int x;
    public int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Solution {
    static int dx[] = {0,1,0,-1};
    static int dy[] = {1,0,-1,0};
    
    public void BFS(int[][] maps,int[][] dis){
        dis[0][0] =1;
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(0,0));
        while(!q.isEmpty()){
            Point tmp = q.poll();
            for(int i=0;i<4;i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                
                if(nx>=0 && nx<=maps.length-1 && ny>=0 && ny<=maps[0].length-1 && maps[nx][ny] == 1){
                    maps[nx][ny] = 0;
                    q.offer(new Point(nx,ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
                
            }
                
                
        }
        
    }
    
    public int solution(int[][] maps) {
        int answer = 0;
        int dis[][] = new int[maps.length][maps[0].length];
        BFS(maps,dis);
        answer = dis[maps.length-1][maps[0].length-1];
        if(answer ==0 ){
            answer = -1;
        }
         
        return answer;
    }
}