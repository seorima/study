
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int tc = 1;tc<=T;tc++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken()); //m초 지나면 k개의 붕어빵 만듦
            int k = Integer.parseInt(st.nextToken());

            int[] arr = new int[n];
            boolean[] ch = new boolean[n];

            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken()); // 도착하는 시간임
            }
            Arrays.sort(arr);
            boolean and = false;

            for(int i=0;i<n;i++){
                int tmp = arr[i];
                int sum = k*(tmp/m);
                if(sum<i+1) {
                    and  = true;
                    break;
                }
            }

            if(!and){
                System.out.println("#"+tc + " " + "Possible");
            }else{

                System.out.println("#"+tc + " " + "Impossible");
            }


        }
    }
}
