
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);


        int min=0;
        int answer = Integer.MAX_VALUE;

        for(int lt = 0; lt< n-1;lt++){
            for( int rt = lt+1; rt<n ; rt++){
                if(arr[rt]-arr[lt]>=m){
                    min = arr[rt]-arr[lt];
                    if(min<answer){
                        answer = min;
                    }
                    break;
                }
            }
        }

        System.out.println(answer);

    }
}
