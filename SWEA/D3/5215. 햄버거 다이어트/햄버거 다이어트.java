
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;
class Ham{
    public int t;
    public int k;

    Ham(int t, int k){
        this.t = t;
        this.k = k;
    }
}
public class Solution {

    static int max ;
    static int n,l;
    static ArrayList<Ham> arr;
    public static void DFS(int t_total,int k_total, int L){

        if(k_total>l) return;

        if(L==n) {
            max = Math.max(t_total,max);
            return;
        }

            DFS(t_total + arr.get(L).t,k_total + arr.get(L).k,L+1);
            DFS(t_total,k_total,L+1);

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int tc = 1;tc<=T;tc++){
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            l = Integer.parseInt(st.nextToken());
            arr = new ArrayList<>();

            for(int i=0;i<n;i++){
                st = new StringTokenizer(br.readLine());
                int a  = Integer.parseInt(st.nextToken());
                int b  = Integer.parseInt(st.nextToken());
                arr.add(new Ham(a,b));
            }

            max = 0;
            DFS(0,0,0);

            System.out.println("#"+tc + " " + max );

        }
    }
}
