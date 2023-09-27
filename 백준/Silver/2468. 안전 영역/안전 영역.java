
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[][] arr;
    static int[][] ch;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    public static void DFS(int h,int x, int y){

        ch[x][y] = 1;
        for(int i=0;i<4;i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx>=0 && ny>=0 & nx<n && ny<n && ch[nx][ny]==0 && arr[nx][ny]>h){
                DFS(h,nx,ny);
            }

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        int max_h = 0;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j]>max_h) max_h = arr[i][j];
            }
        }

        int max =0;
        for(int z=0;z<=max_h;z++){
            int cnt = 0;
            ch = new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(arr[i][j]>z && ch[i][j]==0){
                        cnt++;
                        DFS(z,i,j);
                    }

                }
            }

            max = Math.max(max, cnt);
        }

        System.out.println(max);



    }
}
