
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
class City implements Comparable<City>{
     public int end;
    public int d;
    City(int end,int cost){
        this.end = end;
        this.d = cost;
    }

    @Override
    public int compareTo(City o) {
        return this.d -o.d;
    }
}
public class Main {
    static ArrayList<ArrayList<City>> arr = new ArrayList<ArrayList<City>>();
    static int[] dis;
    static int max = Integer.MIN_VALUE;
    public static int solution(int s,int e){

        dis[s]=0;
        PriorityQueue<City> pq = new PriorityQueue<>();
        pq.offer(new City(s,0));
        while(!pq.isEmpty()){
            City tmp = pq.poll();
            int now = tmp.end;
            int nowdis = tmp.d;
            if(nowdis > dis[now]) {
                continue;
            }
            for(City ob : arr.get(now)){
                if(dis[ob.end]>nowdis+ob.d){
                    dis[ob.end] = nowdis+ob.d;
                    pq.offer(new City(ob.end,nowdis+ob.d));
                }
            }
        }


        return dis[e];

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        for(int i=0;i<=n;i++){
            arr.add(new ArrayList<City>());
        }
        dis = new int[n+1];
        Arrays.fill(dis,Integer.MAX_VALUE);

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a =Integer.parseInt(st.nextToken());
            int b =Integer.parseInt(st.nextToken());
            int c =Integer.parseInt(st.nextToken());
            arr.get(a).add(new City(b,c));
        }

        st = new StringTokenizer(br.readLine());
        int start =Integer.parseInt(st.nextToken());
        int end =Integer.parseInt(st.nextToken());



        System.out.println(solution(start,end));






    }
}
