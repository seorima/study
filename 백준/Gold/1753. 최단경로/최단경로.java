
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
class Dis implements Comparable<Dis>{
    public int v;
    public int w;
    Dis(int v , int w){
        this.v = v;
        this.w = w;
    }

    @Override
    public int compareTo(Dis o) {
        return this.w - o.w;
    }
}
public class Main {
    static int v,e;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(br.readLine());
        int[] dis = new int[v+1];
        boolean[] visited = new boolean[v+1];
        Arrays.fill(dis,Integer.MAX_VALUE);

        ArrayList<ArrayList<Dis>> arr = new ArrayList<>();
        for(int i=0;i<=v;i++){
            arr.add(new ArrayList<Dis>());
        }

        for(int i=1;i<=e;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            arr.get(a).add(new Dis(b,c));
        }

        PriorityQueue<Dis> pq = new PriorityQueue<>();
        dis[s] = 0;
        pq.offer(new Dis(s,0));

        while(!pq.isEmpty()){
            Dis cur = pq.poll();
            int nv = cur.v;
            int nw = cur.w;
            if(dis[nv]<nw) continue;
            if(visited[nv]){
                continue;
            }
            visited[nv] = true;
            for(Dis x : arr.get(nv)){
                if(dis[x.v]>dis[nv]+x.w){
                    dis[x.v]=dis[nv]+x.w;
                    pq.offer(new Dis(x.v,dis[x.v]));
                }
            }

        }

        for(int i=1;i<=v;i++){
            if(dis[i]==Integer.MAX_VALUE){
                System.out.println("INF");
            }else{
                System.out.println(dis[i]);
            }
        }



    }
}
