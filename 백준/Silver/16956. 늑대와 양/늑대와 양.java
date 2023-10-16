
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Find{
    public int x;
    public int y;
    Find(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Main {
    static int r;
    static int c;
    static String[][] arr;
    static Queue<Find> q;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static boolean flag = false;

    public static void BFS(){
        while(!q.isEmpty()){
            Find cur = q.poll();
            for(int i=0;i<4;i++){
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                if(nx>=0 && ny>=0 && nx<r && ny<c){
                    if(arr[nx][ny].equals("S")){
                        flag = true;
                        return;
                    }else if(arr[nx][ny].equals(".")){
                        arr[nx][ny] = "D";
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
        arr = new String[r][c];
        q = new LinkedList<>();

        for(int i=0;i<r;i++){
            String str = br.readLine();
            for(int j=0;j<c;j++){
                arr[i][j] = String.valueOf(str.charAt(j));
                if(arr[i][j].equals("W")){
                    q.add(new Find(i,j));
                }
            }
        }

        BFS();

        if(flag){
            System.out.println("0");
        }else{
            System.out.println("1");
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    System.out.print(arr[i][j]);
                    }
                System.out.println();

                }
            }
        }




    }

