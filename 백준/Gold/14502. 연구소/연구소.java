
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
public class Main {
    static int[][] arr;
    static int n;
    static int m;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int max= Integer.MIN_VALUE;

    public static void DFS(int L){
        if(L==3){
            BFS();
        }else{
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    if(arr[i][j] == 0){
                        arr[i][j] =1;
                        DFS(L+1);
                        arr[i][j] = 0;
                    }
                }
            }
        }
    }
    public static void BFS(){
        Queue<Point> q= new LinkedList<>();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(arr[i][j] == 2){
                    q.offer(new Point(i,j));
                }
            }
        }
        int copy[][] = new int[n+1][m+1];

        for(int i=1;i<=n;i++){
            copy[i] = arr[i].clone();
        }

        while(!q.isEmpty()){
            Point tmp = q.poll();
            for(int i=0;i<4;i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx>=1 && nx<=n && ny>=1 && ny<=m && copy[nx][ny]==0){
                    copy[nx][ny] = 2;
                    q.offer(new Point(nx,ny));
                }

            }
        }

        Max(copy);

    }
    public static void Max(int[][] copy){
        int cnt = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(copy[i][j] == 0){
                    cnt++;
                }
            }
        }
        if(max<cnt){
            max = cnt;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=m;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        DFS(0);

        System.out.println(max);






    }
}
