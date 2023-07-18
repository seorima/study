
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int n;
    static int[][] arr;
    static boolean visit[][];
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int cnt;
    static ArrayList<Integer> result = new ArrayList<>();

    public static void number(int x, int y){


        cnt++;
        arr[x][y] = 0;
        for(int z=0;z<4;z++){
            int nx = x + dx[z];
            int ny = y + dy[z];
            if(nx>=1 && ny>=1 && ny<=n && nx<=n && arr[nx][ny] == 1 && visit[nx][ny] ==false){
                if(arr[nx][ny]==1){
                    number(nx,ny);
                }

            }
        }



    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n+1][n+1];
        visit = new boolean[n+1][n+1];
        int total=0;

        for(int i=1;i<=n;i++){
            String str = br.readLine();
            for(int j=1;j<=n;j++){
                arr[i][j] = str.charAt(j-1) - '0';
            }
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(arr[i][j]==1 && visit[i][j] == false){
                    cnt=0;
                    total++;
                    number(i,j);
                    result.add(cnt);
                }
            }
        }

        System.out.println(total);
        Collections.sort(result);

        for(int x : result){
            System.out.println(x);
        }




    }
}
