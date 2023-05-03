import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Person1{
    int id;
    int priority;

    public Person1(int id,int priority){
        this.id=id;
        this.priority=priority;
    }
}
public class in0508_2 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];



        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        int answer=1;

        Queue<Person1> q = new LinkedList<>();

        for(int i=0;i<n;i++){
            q.offer(new Person1(i,arr[i]));
        }

        while(!q.isEmpty()){
            Person1 tmp = q.poll();
            boolean flag=true;
            for( Person1 x : q){
                if(x.priority>tmp.priority){
                    q.offer(tmp);
                    tmp=null;
                    flag=false;
                    break;
                }
                if(flag){
                    if(tmp.id==m) break;
                    answer++;
                }

            }

        }




    }
}
