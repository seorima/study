
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        Stack<Integer> s = new Stack<>();
        int sum=0;

        for(int i=0;i<k;i++){
            int n= sc.nextInt();
            if(n==0){
                s.pop();
            }else{
                s.push(n);
            }

        }

        while(!s.isEmpty()){
            sum += s.pop();
        }

        System.out.println(sum);

    }
}
