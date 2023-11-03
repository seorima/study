
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;



public class Main {
    static class Node implements Comparable<Node>{
        int x;
        int y;
        int size;

        public Node(int x, int y, int size){
            this.x = x;
            this.y = y;
            this.size = size;
        }

        @Override
        public int compareTo(Node o){
            return this.size - o.size;
        }
    }
    static int[][] arr;
    static int[][] size;
    static boolean[][] ch;
    static int n;
    static int min;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    public static void Rupee(int x , int y, int sum){

        PriorityQueue<Node> p = new PriorityQueue<>();
        p.offer(new Node(x,y,sum));
        size[x][y] = arr[x][y];
        ch[x][y] =true;

        while(!p.isEmpty()){
            Node node = p.poll();

            if(node.x == n-1 && node.y == n-1){
                return;
            }

            for(int k=0;k<4;k++){
                int nx = node.x + dx[k];
                int ny = node.y + dy[k];
                if(nx>=0 && ny>=0 && nx<n && ny<n && ch[nx][ny] ==false && arr[nx][ny]+node.size <size[nx][ny] ){
                    size[nx][ny] = arr[nx][ny]+node.size;
                    ch[nx][ny] = true;
                    p.add(new Node(nx,ny,arr[nx][ny]+node.size));
                }
            }


        }




    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int cnt = 0;

        while(true){
            cnt++;

            n = Integer.parseInt(br.readLine());
            if(n==0) break;

            arr = new int[n][n];
            size = new int[n][n];
            ch = new boolean[n][n];

            min = Integer.MAX_VALUE;

            for(int i=0;i<n;i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0;j<n;j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                    size[i][j] = Integer.MAX_VALUE;
                }
            }
            Rupee(0,0,arr[0][0]);


            System.out.println("Problem " + cnt + ": "+ size[n-1][n-1]);
        }
    }
}
//            for(int i=0;i<n;i++){
//                for(int j=0;j<n;j++){
//                    System.out.print(arr[i][j]);
//                }
//                System.out.println();
//            }
