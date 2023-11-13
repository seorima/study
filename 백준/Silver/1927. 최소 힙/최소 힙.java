
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        PriorityQueue<Integer> q= new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();

        while(n-->0){
            int num = sc.nextInt();
            if(q.isEmpty() && num == 0){
                sb.append("0");
                sb.append("\n");

            }else if(!q.isEmpty() && num == 0){
                sb.append(q.poll());
                sb.append("\n");
            }else{
                q.offer(num);
            }

        }

        System.out.print(sb);
    }
}
