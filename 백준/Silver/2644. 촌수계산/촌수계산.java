
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int n,m;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] ch;
    static int result=0;

    public static void dfs(int start,int end, int cnt){
        ch[start] = 1;
        for(int tmp : graph.get(start)){
            if(ch[tmp]==0){
                if(end == tmp){
                    result = cnt + 1;
                    return;
                }

                dfs(tmp,end,cnt+1);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        ch = new int[n+1];

        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<Integer>());
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());


        m = Integer.parseInt(br.readLine());
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph.get(p).add(c);
            graph.get(c).add(p);

        }

        dfs(a,b,0);

        if(result == 0){
            System.out.println("-1");
        }else{
            System.out.println(result);
        }



    }
}
