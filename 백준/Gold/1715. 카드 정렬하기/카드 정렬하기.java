
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int sum = 0;


        for(int i=0;i<n;i++){
            int card = Integer.parseInt(br.readLine());
            q.offer(card);
        }


        while(q.size()>1){
            int a = q.poll();
            int b = q.poll();
            sum += a+b;
            q.offer(a+b);
        }

        System.out.println(sum);

    }
}
