
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int r,c;
    static boolean[] word;
    static char[][] arr;
    static int[] dx={-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    static int cnt = 0;
    static int max = Integer.MIN_VALUE;

    public static void DFS(int x, int y,int cnt){
        word[arr[x][y]-65] = true;
        max = Math.max(max,cnt);
        for(int i=0;i<4;i++){
            int nx = x+ dx[i];
            int ny = y+ dy[i];
            if(nx>=1 && nx<=r && ny>=1 && ny<=c && word[arr[nx][ny]-65] == false ){
                word[arr[nx][ny]-65] = true;
                DFS(nx,ny,cnt+1);
                word[arr[nx][ny]-65] = false;
            }

        }




    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        word = new boolean[26];
        arr = new char[r+1][c+1];

        for(int i=1;i<=r;i++){
            String str = br.readLine();
            for(int j=0;j<c;j++){
                arr[i][j+1] = str.charAt(j);
            }
        }

        DFS(1,1,0);

        System.out.println(max+1);


    }

}
