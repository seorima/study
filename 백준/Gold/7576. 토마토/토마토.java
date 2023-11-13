
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Tomato{
    int x;
    int y;
    Tomato(int x, int y){
        this.x = x;
        this.y = y;
    }

}

public class Main {
    static int n,m;
    static int[][] arr ;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static Queue<Tomato> q;
    public static int BFS(){
        int cnt = 0;
        while (!q.isEmpty()){
            int c = q.size();
            for(int k=0;k<c;k++){
                Tomato cur = q.poll();
                for(int i=0;i<4;i++){
                    int nx = cur.x + dx[i];
                    int ny = cur.y + dy[i];
                    if(nx>=0 && nx<n && ny>=0 && ny<m && arr[nx][ny] == 0){
                        arr[nx][ny] = 1;
                        q.add(new Tomato(nx,ny));
                    }
                }

            }

            cnt++;

        }

        if(check()){
            return cnt-1;
        }else{
            return -1;
        }

    }
    public static boolean check(){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        q = new LinkedList<>();
        arr = new int[n][m];
        boolean check = false;

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 1){
                    q.add(new Tomato(i,j));
                    check = true;

                }
            }
        }
        if(!check){
            System.out.println(-1);
        }else{
            System.out.println(BFS());

        }





    }
}
