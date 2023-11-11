
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        int cnt = (int) (Math.round((n*0.3)/2));

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int sum = 0;
        for(int i=cnt;i<n-cnt;i++){
            sum +=arr[i];
        }

        double result = (sum)/(double)(n-2*cnt);
        System.out.println(Math.round(result));



    }
}
