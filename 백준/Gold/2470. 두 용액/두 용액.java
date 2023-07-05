
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int min = Integer.MAX_VALUE;
        int[] result = new int[2];

        Arrays.sort(arr);
        
        int lt = 0;
        int rt = n-1;
        int sum =0;

        while(lt<rt){
            sum = Math.abs(arr[lt]+arr[rt]);
            if(sum<min){
                min=sum;
                result[0]=arr[lt];
                result[1]=arr[rt];
            }
            if(arr[lt]+arr[rt]>0) rt--;
            else lt++;
        }

        System.out.print(result[0] + " "+result[1]);



    }
}
