import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[1001];

        int sum=0;

        int start = 1000;
        int end = 0;

        for(int i=0;i<n;i++){
            int l=sc.nextInt();
            int h=sc.nextInt();
            arr[l]=h;
            start= Math.min(l,start);
            end= Math.max(l,end);
        }

        Stack<Integer> stack = new Stack<>();
        int tmp=arr[start];
        for(int i=start+1;i<=end;i++){
            if(tmp>arr[i]){
                stack.push(i);
            }else{
                while(!stack.isEmpty()){
                    int x =stack.pop();
                    arr[x]=tmp;

                }
                tmp=arr[i];
            }

        }

        stack.clear();
        tmp= arr[end];
        for(int i=end-1;i>=start;i--){
            if(tmp>arr[i]){
                stack.push(i);
            }else{
                while(!stack.isEmpty()){
                    int x =stack.pop();
                    arr[x]=tmp;
                }
                tmp=arr[i];
            }
        }
        int result = 0;
        for (int i = start; i <= end; i++) {
            result += arr[i];
        }
        System.out.print(result);
    }
}
