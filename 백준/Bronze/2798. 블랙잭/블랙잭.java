import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        int tmp =0;
        int sum =0;


        for (int i = 0; i <n; i++) {
            for(int j=i+1;j<n;j++){
                for(int z=j+1;z<n;z++){
                    sum = arr[i]+arr[j]+arr[z];
                    if(sum>tmp && sum<=m){
                        tmp = sum;
                    }


                }
            }

        }
        System.out.println(tmp);

    }
}
