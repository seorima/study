import java.util.Scanner;

public class in0304 {
    static int n=0;
    static int m=0;
    static int[] arr;
    public int Solution(int sum){
        int result=0;
        int lt=0;
        for(int rt=0;rt<n;rt++){
            sum+=arr[rt];
            if(sum==m) result++;
            while(sum>m){
                sum-=arr[lt++];
                if(sum==m) result++;
            }
        }

        return result;

    }
    public static void main(String[] args) {
        in0304 T = new in0304();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }

        System.out.println(T.Solution(0));


    }
}
