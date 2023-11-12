
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Double[] arr = new Double[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            arr[i] = Double.parseDouble(st.nextToken());
        }

        Arrays.sort(arr);

        double sum = 0;
        for (int i=0;i<n;i++){
            sum += ((arr[i] / arr[n-1]) * 100);
        }

        System.out.println(sum/n);



    }
}
