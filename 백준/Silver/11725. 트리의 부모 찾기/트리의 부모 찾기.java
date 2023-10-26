
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int[] ch;
    static int[] parent;
    static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

    public static void DFS(int node){
        ch[node] = 1;

        for(int x : arr.get(node)){
            if(ch[x]==0){
                DFS(x);
                parent[x] = node;
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        ch = new int[n+1];
        parent = new int[n+1];

        for(int i=0;i<=n;i++){
            arr.add(new ArrayList<>());
        }

        for(int i=0;i<n-1;i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr.get(a).add(b);
            arr.get(b).add(a);
        }
        DFS(1);



        for(int i=2;i<=n;i++){
            System.out.println(parent[i]);
        }


    }
}
