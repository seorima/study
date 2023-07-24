
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class island{
    public int x;
    public int y;

    island(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int w,h;
    static int[][] graph;
    static boolean[][] check;
    static int[] dx = {-1,-1,0,1,1,1,0,-1};
    static int[] dy = {0,1,1,1,0,-1,-1,-1};
    public static void Island(int x , int y){

        graph[x][y] = 0;
        for(int i=0;i<8;i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && ny>=0 && ny<w && nx<h && graph[nx][ny] == 1  ){
                Island(nx,ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str = "";

        while(!(str = br.readLine()).equals("0 0")){

            st = new StringTokenizer(str);
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            graph = new int[h][w];
            check = new boolean[h][w];

            int cnt = 0;

            for(int i=0;i<h;i++){
                StringTokenizer str2 = new StringTokenizer(br.readLine());
                for(int j=0;j<w;j++){
                    graph[i][j] = Integer.parseInt(str2.nextToken());
                }
            }


            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    if(graph[i][j] == 1 ){
                        Island(i,j);
                        cnt++;

                    }
                }
            }


            System.out.println(cnt);
        }

    }
}
