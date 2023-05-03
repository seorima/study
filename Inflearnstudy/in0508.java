import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
    int id;
    int priority;
    public Person(int id,int priority){
        this.id=id;
        this.priority=priority;
    }

        }

public class in0508 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        int answer=1;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Queue<Person> q = new LinkedList<>();

        for(int i=0;i<n;i++){
            q.offer(new Person(i,arr[i]));
        }

        while(!q.isEmpty()){
            Person tmp = q.poll();
            boolean flag = true;

            for(Person x : q){
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

        System.out.println(answer);



    }
}
