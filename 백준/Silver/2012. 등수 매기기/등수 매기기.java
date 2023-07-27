
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] result = new int[n];

        for(int i=0;i<n;i++){
            result[i] = sc.nextInt();
        }

        Arrays.sort(result);


        long sum = 0;
        for(int i=0;i<n;i++){
            sum += Math.abs((i+1)-result[i]);
        }

        System.out.println(sum);

    }
}
