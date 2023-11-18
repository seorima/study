
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[1001];
        StringTokenizer st;
        int max = Integer.MIN_VALUE;
        int mid = 0; // 가운데 가장 큰 값
        int idx = 0;

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            arr[l] = h;
            if(mid<h) {
                mid = h;
                idx = l;
            }
        }

        int sum = 0;
        for(int i=1;i<=idx;i++){
            if(arr[i]>max){
                max = arr[i];

            }
            sum+=max;
        }
        max = Integer.MIN_VALUE;

        for(int i=1000;i>idx;i--){
            if(arr[i]>max){
                max = arr[i];
            }
            sum+=max;
        }

        System.out.println(sum);

    }
}
