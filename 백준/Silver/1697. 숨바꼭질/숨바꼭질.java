
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int n,k;
    static int[] dis = {-1,1};
    static int[] point;
    static int min = Integer.MAX_VALUE;
    public static int Dis(int L){

        Queue<Integer> q = new LinkedList<>();
        q.offer(L);
        point[L]=1;

        while(!q.isEmpty()){
            int tmp = q.poll();
            if(tmp == k) return point[tmp]-1;
            for(int i=0;i<3;i++){
                int nx;
                if(i==2){
                    nx=tmp*2;
                }else{
                    nx=tmp+dis[i];
                }
                if(nx>=0 && nx<=100000 && point[nx]==0){

                    q.offer(nx);
                    point[nx]= point[tmp]+1;
                }
            }
        }
            return 0;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        point = new int[100001];
        System.out.println(Dis(n));


    }
}
