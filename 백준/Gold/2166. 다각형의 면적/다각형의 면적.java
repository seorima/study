
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        long[][] arr = new long[n+1][2];

        long sum_x = 0;
        long sum_y = 0;

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());
            arr[i][0] = x;
            arr[i][1] = y;

        }
        arr[n][0] = arr[0][0];
        arr[n][1] = arr[0][1];

        for(int i=0;i<n;i++){
            sum_x += arr[i][0] * arr[i+1][1];
            sum_y += arr[i][1] * arr[i+1][0];
        }

        System.out.printf("%.1f",Math.abs((sum_x-sum_y) / 2.0));

    }
}
