
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static int n,m,k;
    static int[][] arr;
    static int result;
    static int dx[] = {0,1,0,-1};
    static int dy[] = {1,0,-1,0};
    static void dfs(int x, int y) {
        arr[x][y] = 1;
        result ++; //영역의 개수 증가

        for(int k=0; k<4; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];

            if(0<=nx && nx<m && 0<=ny && ny < n) {
                if(arr[nx][ny] == 0) {
                    dfs(nx,ny);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[m][n];

        for(int i=0; i<k; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int y=y1; y<y2; y++) {
                for(int x=x1; x<x2; x++){
                    arr[y][x] = 1;
                }
            }
        }

        ArrayList<Integer> count = new ArrayList<>();
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(arr[i][j] == 0) {
                    result = 0; //영역 개수 초기화
                    dfs(i,j);
                    count.add(result);
                }
            }
        }

        System.out.println(count.size());
        Collections.sort(count);
        for(int x : count){
            System.out.print(x + " ");
        }




    }
}
