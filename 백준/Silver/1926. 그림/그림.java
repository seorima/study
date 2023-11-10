
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
class Point {
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

}
public class Main {
    static int[][] arr;
    static int r,c;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int max = Integer.MIN_VALUE;
    static boolean[][] visited;
    static Queue<Point> q = new LinkedList<>();
    public static void Paint(){
        int sum = 0;
        while(!q.isEmpty()){
            sum++;
            Point cur = q.poll();
            for(int i=0;i<4;i++){
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                if(nx>=0 && nx<r && ny>=0 && ny<c && arr[nx][ny] == 1 && !visited[nx][ny]){
                    q.add(new Point(nx,ny));
                    arr[nx][ny] = 0;

                }

            }
        }

        max = Math.max(max, sum);



    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        arr = new int[r][c];
        visited = new boolean[r][c];
        boolean check = false;

        for(int i=0;i<r;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<c;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 1){
                    check = true;
                }
            }
        }

        if(!check){
            System.out.println("0");
            System.out.println("0");
        }else{
            int total = 0; // 그림의 개수
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(arr[i][j]==1 && !visited[i][j]){
                        total++;
                        q.add(new Point(i,j));
                        visited[i][j] = true;
                        Paint();

                    }
                }
            }

            System.out.println(total);
            System.out.println(max);

        }




    }
}
