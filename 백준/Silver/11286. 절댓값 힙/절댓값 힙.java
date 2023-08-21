
import java.util.PriorityQueue;
import java.util.Scanner;
class Node implements Comparable<Node> {
    int num;
    int abs;
    Node (int num, int abs) {
        this.num = num;
        this.abs = abs;
    }
    @Override
    public int compareTo (Node o) {
        if (this.abs == o.abs) // 절대값이 같을 경우 값이 작은 수가 앞으로 가게 정렬
            return this.num - o.num;
        else  // 절대값이 다를 경우는 절대값이 작은 값이 앞으로 가게 정렬
            return this.abs - o.abs;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Node> pq = new PriorityQueue<>();
        int n=sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int a : arr){
            if(a==0){
                if(pq.isEmpty()){
                    System.out.println("0");
                }else{
                    Node node = pq.poll();
                    System.out.println(node.num);
                }
            }else{
                pq.add(new Node(a,Math.abs(a)));
            }
        }




    }
}
