import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int cnt =0;
        int tmp=0;

        for(int i=0;i<n;i++){
            if(cnt<arr[i]){
                for(int j=cnt+1;j<=arr[i];j++){
                    stack.push(j);
                    sb.append("+\n"); // 원래 바로바로 출력했는데 no랑 구분해야해서
                }
                cnt = arr[i];
            }
//            while(cnt < arr[i]){
//                //cnt=tmp;
//                stack.push(cnt++);
//                System.out.println("+");
//                tmp=cnt;
//            }
            if(stack.get(stack.size()-1)==arr[i]){
                stack.pop();
                sb.append("-\n");
            }
        }

        if(stack.size()>0){
            System.out.println("NO");
        }else{
            System.out.println(sb);

        }




    }
}
