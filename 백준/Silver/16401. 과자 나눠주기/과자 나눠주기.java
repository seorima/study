
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int result = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);


        int left = 1;
        int right = arr[n-1];

        while(left<=right){
            int count = 0;
            int mid = (right+left) / 2;

            for(int i=0;i<n;i++) count+=arr[i] / mid;

            if(count>=m){
                if(result<mid) result = mid;
                left = mid +1;
            }else{
                right = mid-1;
            }


        }

        System.out.println(result);

    }
}
