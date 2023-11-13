
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
class Short{
    int x;
    int y;
    Short(int x, int y){
        this.x = x;
        this.y = y;
    }

}
public class Main {
    static int n,m;
    static int[][] arr;
    static int[][] dis;
    static boolean[][] visited;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static Queue<Short> q;

    public static void DFS(){


            while(!q.isEmpty()){
                Short cur = q.poll();
                visited[cur.x][cur.y] = true;
                for(int i=0;i<4;i++){
                    int nx = cur.x + dx[i];
                    int ny = cur.y + dy[i];
                    if(nx>=0 && nx<n && ny>=0 && ny<m && !visited[nx][ny] && arr[nx][ny] == 1 ){
                        visited[nx][ny] = true;
                        dis[nx][ny] = dis[cur.x][cur.y] +1 ;
                        q.add(new Short(nx,ny));
                    }
                }


        }


    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        q = new LinkedList<>();

        arr = new int[n][m];
        dis = new int[n][m];
        visited = new boolean[n][m];

        int a=0;
        int b = 0;

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 0){
                    dis[i][j] = 0;
                }else if(arr[i][j] == 2){
                    q.add(new Short(i,j));
                }else{
                    dis[i][j] = -1;
                }
            }
        }

        DFS();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(dis[i][j] + " ");
            }
            System.out.println();
        }

    }
}
