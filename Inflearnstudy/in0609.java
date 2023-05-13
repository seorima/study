import java.util.Arrays;
import java.util.Scanner;

public class in0609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

       int lt= Arrays.stream(arr).max().getAsInt();
        int rt= Arrays.stream(arr).sum();

        while(lt<=rt){
            int mid=lt+rt/2;

        }

    }
}
