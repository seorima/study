
import java.util.Scanner;



public class Main {
    static int n,m;
    static int[][] graph;
    static boolean[][] check;
    static int[] dy = {-1,0,1,0};
    static int[] dx = {0,1,0,-1};


    public static void DFS(int x, int y){
        check[y][x]=true;

        for(int i=0;i<4;i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx>=0 && nx<m && ny>=0 && ny<n && graph[ny][nx]==1 && check[ny][nx]==false){

                    DFS(nx,ny);
                }
            }


//        while(!queue.isEmpty()){
//            cab tmp = queue.poll();
//            for(int i=0;i<4;i++){
//                int nx = tmp.x + dx[i];
//                int ny = tmp.y + dy[i];
//                if(nx>=0 && nx<n && ny>=0 && ny<m && graph[nx][ny]==0 ){
//                    graph[nx][ny] = 1;
//                    queue.offer(new cab(nx,ny));
//                }
//            }
//        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        for(int tc = 0 ; tc<T; tc++){
            int result=0;
            m=sc.nextInt();
            n=sc.nextInt();
            graph = new int[n][m];
            check = new boolean[n][m];
            int k = sc.nextInt();

            for(int i=0;i<k;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                graph[b][a] = 1;
            }

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(graph[i][j]==1 && check[i][j] == false){
                        result++;
                        DFS(j,i);
                    }
                }
            }

            System.out.println(result);

        }


    }
}
