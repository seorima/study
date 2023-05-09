import java.util.Arrays;
import java.util.Scanner;

public class in0606 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        int[] result = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            result[i]=arr[i];

        }

        Arrays.sort(result);

        for(int i=0;i<n;i++){
            if(arr[i]!=result[i]){
                System.out.print((i+1)+" ");
            }
        }



    }
}
