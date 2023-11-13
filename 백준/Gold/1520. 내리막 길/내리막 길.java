
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Map{
    int x;
    int y;
    Map(int x, int y){
        this.x = x;
        this.y = y;
    }

}
public class Main {
    static int n,m;
    static int[][] arr;
    static int[][] dis;
    static boolean[][] visited;
    static Queue<Map> q;
    static int cnt;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    public static int DFS(int x, int y){

        if(x==n-1 && y==m-1) return 1;

        if(dis[x][y] == -1){
            dis[x][y] = 0;
            for(int i=0;i<4;i++){
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    if(nx>=0 && nx<n && ny>=0 && ny<m && arr[x][y]>arr[nx][ny]){
                        dis[x][y] += DFS(nx,ny);
                    }
                }
        }
        return dis[x][y];

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        dis = new int[n][m];
        visited = new boolean[n][m];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                dis[i][j] = -1;
            }
        }



        System.out.println(DFS(0,0));

    }
}
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }