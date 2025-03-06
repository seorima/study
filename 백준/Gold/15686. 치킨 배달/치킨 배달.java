
import java.io.*;
import java.util.*;
class Point3{
    public int x, y;
    Point3(int x , int y){
        this.x = x;
        this.y = y;
    }
}
public class Main {

    static int[][] arr;
    static int[] combi;
    static int n;
    static int m;
    static int len;
    static ArrayList<Point3> hs;
    static ArrayList<Point3> pz;
    static int min = Integer.MAX_VALUE;

    public static void DFS(int L, int s){
        if(L==m){
            int sum = 0;
            for(Point3 pt : hs){
                int dis = Integer.MAX_VALUE;
                for(int i=0;i<m;i++){
                    dis = Math.min(dis,distance(pt.x,pt.y,pz.get(combi[i]).x,pz.get(combi[i]).y));
                }
                sum += dis;
            }
            min = Math.min(sum,min);

        }else{
            for(int i=s;i<len;i++){
                combi[L] = i;
                DFS(L+1,i+1);
            }

        }
    }

    public static int distance(int x1,int y1, int x2, int y2){
        return Math.abs(x1-x2) + Math.abs(y1-y2);
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][n];
        combi = new int[m];

        hs = new ArrayList<Point3>();
        pz = new ArrayList<Point3>();

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 1){
                    hs.add(new Point3(i,j));
                }else if (arr[i][j] == 2){
                    pz.add(new Point3(i,j));
                }
            }
        }
        len = pz.size();

        T.DFS(0,0);

        System.out.println(min);



    }

}
