
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        Queue<Integer> truck = new LinkedList<>();
        Queue<Integer> b = new LinkedList<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            truck.add(Integer.parseInt(st.nextToken()));
        }

        for(int i=0;i<w;i++){
            b.add(0);
        }

        int cnt = 0;
        int sum=0;
        while(!b.isEmpty()){
            cnt++;
            sum-=b.poll();
            if(!truck.isEmpty()){
                if(sum+truck.peek()<=l){
                    sum+=truck.peek();
                    b.offer(truck.poll());
                }else{
                    b.offer(0);
                }
            }
        }

        System.out.println(cnt);





    }
}
