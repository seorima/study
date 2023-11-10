
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for(int tc=0;tc<10;tc++){
            int Test = sc.nextInt();
            Queue<Integer> q = new LinkedList<>();
            for(int i=0;i<8;i++){
                q.add(sc.nextInt());
            }

            boolean check = false;
            while(!check){
                for(int i=1;i<=5;i++){
                    int tmp = q.poll();
                    if((tmp-i)<=0) {
                        q.add(0);
                        check = true;
                        break;
                    }
                    q.add(tmp-i);
                }

            }
            System.out.print("#"+Test+ " ");
            for(int x : q){
                System.out.print(x+ " ");
            }
            System.out.println();

        }
    }
}
