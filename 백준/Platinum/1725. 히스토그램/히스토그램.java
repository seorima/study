
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] arr = new int[n+2];

        for(int i=1;i<=n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> s = new Stack<>();
        long max = 0;
        s.push(0);

        for(int i=1;i<n+2;i++){
            while(!s.isEmpty()){
                int top = s.peek();
                if(arr[top]<=arr[i]) break;
                s.pop();
                max = Math.max(max, arr[top] * (i-s.peek()-1));
            }
            s.push(i);
        }
        System.out.println(max);



    }
}
