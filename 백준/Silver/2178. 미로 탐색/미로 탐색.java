
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;


class Miro{
    public int x;
    public int y;

    Miro(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Main {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int n,m;
    static int[][] graph;
    static int[][] dis;
    static boolean check;
    static Queue<Miro> queue;

    public static void BFS(int x, int y){

            queue.offer(new Miro(x,y));
            graph[x][y]=0;
            while(!queue.isEmpty()){
                Miro tmp = queue.poll();
                for(int i=0;i<4;i++){
                    int nx = tmp.x + dx[i];
                    int ny = tmp.y + dy[i];
                    if(nx>=1 && ny>=1 && ny<=m && nx<=n && graph[nx][ny] == 1){
                        graph[nx][ny]=0;
                        queue.offer(new Miro(nx,ny));
                        dis[nx][ny] = dis[tmp.x][tmp.y] +1;

                    }
                }

            }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        graph = new int[n+1][m+1];
        dis = new int[n+1][m+1];


        queue = new LinkedList<>();
        for(int i=1;i<=n;i++){
            String s = br.readLine();
            for(int j=1;j<=m;j++){
                graph[i][j] = s.charAt(j-1)-'0';
            }
        }

        dis[1][1] = 1;
        BFS(1,1);

        System.out.println(dis[n][m]);






    }
}
