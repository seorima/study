import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static int n;
    public static int m;
    public static int[] arr;
    public static boolean[] check;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());

        check  = new boolean[n];

        arr = new int[m];


        bfs(0);
        System.out.println(sb);


    }

    public static void bfs(int dept){

        if(dept==m){
            for(int i=0;i<m;i++){
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i=0;i<n;i++){
            if(check[i]==false){
                check[i]=true;
                arr[dept]=i+1;
                bfs(dept+1);

                check[i]=false;
            }

        }
    }
}
