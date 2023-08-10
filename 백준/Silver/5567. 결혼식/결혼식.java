
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int n,m;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] ch;
    public static void dfs(int start, int cnt){
        if(cnt == 2){
            return;
        }else{
            for(int i : graph.get(start)){
                ch[i] = 1;
                dfs(i,cnt+1);

            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        ch = new int[n+1];
        ch[1] = 1;

        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<Integer>());
        }


        for(int i=0;i<m;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        dfs(1,0);

        if(graph.get(1).isEmpty()){
            System.out.println("0");
        }else{

            int answer = 0;
            for(int i=2;i<n+1;i++){
                if(ch[i] == 1) answer++;
            }

            System.out.println(answer);

        }

    }
}
