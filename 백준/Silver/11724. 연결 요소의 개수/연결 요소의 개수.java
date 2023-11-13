
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int n,m;
    static boolean[] visited;
    static int cnt;
    static ArrayList<Integer>[] arr;
    public static void List(int v){
        visited[v] = true;
        for(int i=0;i<arr[v].size();i++){
            if(visited[arr[v].get(i)] == false){
                List(arr[v].get(i));
            }
        }


    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new ArrayList[n+1];
        visited = new boolean[n+1];

        for(int i=0;i<=n;i++){
            arr[i] = new ArrayList<>();
        }

        for(int i=1;i<=m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }

        for(int i=1;i<=n;i++){
            if(visited[i]==false){
                cnt++;
                List(i);
            }


        }


        System.out.println(cnt);
    }
}
