
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Magic{
    public int x;
    public int y;

    Magic(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Main {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};
    static int r,c,day;
    static String[][] graph;
    static Queue<Magic> water;
    static Queue<Magic> queue;
    static boolean[][] check;
    static boolean flag;

    public static void BFS(){

        day = 0;
        while(!queue.isEmpty()){
            day++;
            int len = water.size();
            for(int i=0;i<len;i++){
                Magic tmp = water.poll();
                for(int j=0;j<4;j++){
                    int nx = tmp.x+dx[j];
                    int ny = tmp.y + dy[j];
                    if(nx>=0 && ny>=0 && ny<c && nx<r && graph[nx][ny].equals(".") ){
                        graph[nx][ny] = "*";
                        water.offer(new Magic(nx,ny));

                    }

                }

            }
            int S_len = queue.size();


            for(int i =0;i<S_len;i++){
                Magic tmp = queue.poll();
                for(int j=0;j<4;j++){
                    int s_nx = tmp.x + dx[j];
                    int s_ny = tmp.y + dy[j];
                    if(s_nx>=0 && s_ny>=0 && s_ny<c && s_nx<r){
                        if(graph[s_nx][s_ny].equals("D")){
                            flag =true;
                            return;
                        }
                        if(graph[s_nx][s_ny].equals(".") ){
                            graph[s_nx][s_ny] = "S";
                            queue.offer(new Magic(s_nx,s_ny));
                        }
                    }


                    }
            }

        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r=Integer.parseInt(st.nextToken());
        c=Integer.parseInt(st.nextToken());
        graph = new String[r][c];
        check = new boolean[r][c];
        queue = new LinkedList<>();
        water = new LinkedList<>();


        for(int i=0;i<r;i++){
            String s = br.readLine();
            for(int j=0;j<c;j++){
                graph[i][j] = String.valueOf(s.charAt(j));
                if(graph[i][j].equals("S")){
                    queue.offer(new Magic(i,j));
                }else if(graph[i][j].equals("*")){
                    water.offer(new Magic(i,j));
                }
            }
        }


        BFS();
        if(flag){
            System.out.println(day);
        }else{
            System.out.println("KAKTUS");
        }




    }
}
