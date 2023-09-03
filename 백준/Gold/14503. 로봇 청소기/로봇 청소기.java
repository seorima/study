
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static int n,m,r,c,d;

    static StringTokenizer st;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int[][] ch = new int[n][m];

    static int answer = 1;
    public static void Robot(int x,int y,int dis){

            arr[x][y]=2;

            for(int i=0;i<4;i++){
                dis -= 1;
                if(dis == -1) dis =3;
                int nx = x + dx[dis];
                int ny = y + dy[dis];

                if(nx<n && ny <m && nx>=0 &&  ny>=0){
                    if(arr[nx][ny] == 0){
                        answer++;
                        Robot(nx,ny,dis);
                        return;
                    }
                }
            }

            int d = (dis + 2 ) %4;
            int bx = x + dx[d];
            int by = y + dy[d];
        if(bx >= 0 && by >= 0 && bx < n && by < m && arr[bx][by] != 1) {
            Robot(bx, by, dis); //후진할 때 방향을 유지해야 한다.
        }



    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];

        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Robot(r,c,d);

        System.out.println(answer);



    }
}
