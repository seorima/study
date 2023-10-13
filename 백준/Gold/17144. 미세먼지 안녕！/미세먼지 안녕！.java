
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

}
public class Main {
    static int[][] arr;
    static int r,c,t;
    static int x1;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int[][] tmp;


    public static void Dust(int x, int y){

        int cnt = 0; // 확산되는 공간의 개수
        int first = arr[x][y];

        for(int i=0;i<4;i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx>=1 && ny>=1 && nx<=r && ny<=c && arr[nx][ny] != -1){
                cnt++;
                tmp[nx][ny] += first/5;
            }
        }

        tmp[x][y] += first - ((first/5)*cnt);

    }

    static void Cleaner(){
        int top = x1-1;
        int bottom = x1;

        for(int i=top-1;i>1;i--){
            arr[i][1] = arr[i-1][1];
        }
        for(int i=1;i<c;i++){
            arr[1][i] = arr[1][i+1];
        }
        for(int i=1;i<top;i++){
            arr[i][c] = arr[i+1][c];
        }
        for(int i=c;i>2;i--){
            arr[top][i] = arr[top][i-1];
        }
        arr[top][2] = 0;


        for(int i=bottom+1;i<r;i++){
            arr[i][1] = arr[i+1][1];
        }
        for(int i=1;i<c;i++){
            arr[r][i] = arr[r][i+1];
        }
        for(int i=r ;i>bottom;i--){
            arr[i][c] = arr[i-1][c];
        }
        for(int i=c;i>2;i--){
            arr[bottom][i] = arr[bottom][i-1];
        }

        arr[bottom][2] = 0;


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());
        arr = new int[r+1][c+1];

        int sum = 0;


        for(int i=1;i<=r;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=c;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == -1){
                    x1=i;
                }

            }
        }


        while(t --> 0){

            tmp = new int[r+1][c+1];
            Queue<Point> q = new LinkedList<>();
            for(int i=1;i<=r;i++){
                for(int j=1;j<=c;j++){
                    if(arr[i][j] != -1 && arr[i][j] != 0){ // 우선 처음 먼지들이있는장소 q에 넣음
                        q.offer(new Point(i,j));
                    }
                }
            }

            int n = q.size();
            for(int i=0;i<n;i++){
                Point point = q.poll();
                Dust(point.x,point.y);
            }


            for(int i=1;i<=r;i++){
                for(int j=1;j<=c;j++){
                    if(arr[i][j] != -1){
                        arr[i][j] = tmp[i][j];
                    }
                }
            }

           Cleaner(); //그리고 이제 공기청정기 이동시켜야함


        }

//        for(int i=1;i<=r;i++){
//            for(int j=1;j<=c;j++){
//                System.out.print(arr[i][j] + " ");
//
//            }
//            System.out.println();
//        }




        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(arr[i][j] !=0 && arr[i][j] != -1){
                    sum += arr[i][j];
                }

            }
        }

        System.out.println(sum);





    }

}

