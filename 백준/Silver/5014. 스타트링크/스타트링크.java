
import java.io.*;
import java.util.*;


public class Main {
    static int result = Integer.MAX_VALUE;
    static int cnt;
    static int f,g,u,d;
    static Queue<Integer> q = new LinkedList<Integer>();
    static int ch[];

    public static void Elevator(int s){
        q.offer(s);
        ch[s] = 1;

        while(!q.isEmpty()){
                int now = q.poll();

                if(now == g){
                    System.out.println(ch[now]-1);
                }

                    if(now+u<=f && ch[now+u] == 0){
                        ch[now+u] = ch[now]+1;
                        q.offer(now+u);

                    }
                    if(now - d>0 && ch[now-d] == 0){
                        ch[now-d] = ch[now]+1;
                        q.offer(now-d);
                    }




                }
            if(ch[g]==0){
                System.out.println("use the stairs");
            }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         f = Integer.parseInt(st.nextToken());
         int s = Integer.parseInt(st.nextToken());
         g = Integer.parseInt(st.nextToken());
         u = Integer.parseInt(st.nextToken());
         d = Integer.parseInt(st.nextToken());

         ch = new int[f+1];
         
             Elevator(s);
       






    }
}
