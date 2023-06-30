
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Print{
    int best;
    int priority;
    public Print(int best, int priority){
        this.best = best;
        this.priority = priority;
    }
}
public class Main {
    public int solution(int n, int m,int[] arr){
        int answer = 0;
        boolean check = false;

        Queue<Print> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            q.offer(new Print(i,arr[i]));
        }
        while(!q.isEmpty()){
            Print tmp = q.poll();
            for(Print x : q){
                if(tmp.priority<x.priority){
                    q.offer(tmp);
                    tmp = null;
                    break;
                }
            }

            if(tmp != null){
                answer++;
                if(tmp.best == m) return answer;
            }

        }


        return answer;

    }
    public static void main(String[] args) throws IOException {
        Main B = new Main();
        Scanner sc = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = sc.nextInt();

        for(int tc = 0; tc<T ; tc++){
            int n= Integer.parseInt(sc.next());
            int m =Integer.parseInt(sc.next());
            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }


            System.out.println(B.solution(n,m,arr));


        }



    }
}
