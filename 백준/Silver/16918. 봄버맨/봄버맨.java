
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Bomb{
    public int x;
    public int y;

    Bomb(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Main {
    static int r,c,n;
    static String[][] arr;
    static Queue<Bomb> q = new LinkedList<Bomb>();

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int[][] ch;

    public static void BFS(){

        while(!q.isEmpty()){
            Bomb b = q.poll();
            arr[b.x][b.y] = ".";
            for(int k=0;k<4;k++){
                int nx = b.x + dx[k];
                int ny = b.y + dy[k];
                if(nx>=0 && ny>=0 && nx<r && ny<c){
                    if(arr[nx][ny].equals("O")){
                        arr[nx][ny] = ".";

                    }
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new String[r][c];
        ch = new int[r][c];

        int cnt = 0;
        for(int i=0;i<r;i++){
            String str = br.readLine();
            for(int j=0;j<c;j++){
                arr[i][j] = String.valueOf(str.charAt(j));
                if(arr[i][j].equals("O")){
                    q.offer(new Bomb(i,j));
                }
            }
        }

        if(n%2 == 0){
            for(String[] x : arr){
                Arrays.fill(x,"O");
            }
        }else{
            for(int k=2;k<n;k++){
                if(k % 2 == 0){
                    for(String[] x : arr){
                        Arrays.fill(x,"O");
                    }
                    BFS();

                }else{
                    for(int i=0;i<r;i++){
                        for(int j=0;j<c;j++){
                            if(arr[i][j].equals("O") ){
                                q.offer(new Bomb(i,j));
                            }
                        }
                    }
                }

//                System.out.println(k+"초");
//                for(int i=0;i<r;i++){
//                    for(int j=0;j<c;j++){
//                        System.out.print(arr[i][j]);
//                    }
//                    System.out.println();
//                }
//                System.out.println();

            }
        }





        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        }



    }

