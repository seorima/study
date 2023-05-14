import java.util.Scanner;

public class in0303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

       int sum=0;
        int result=0;

        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        result=sum;

        for(int i=k;i<n;i++){
            sum+=(arr[i]-arr[i-k]);
            result=Math.max(sum,result);
        }

        System.out.println(result);

    }
}
