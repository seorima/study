
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static boolean check(int num){
        String str = String.valueOf(num);
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)>str.charAt(i+1)){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int tc = 1;tc<=T;tc++){
            int max = Integer.MIN_VALUE;
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int num = 0;
            boolean word = false;
            for(int i=0;i<n-1;i++){
                if(arr[i]%10 == 0) continue;
                for(int j=i+1;j<n;j++){
                    num = arr[i] * arr[j];
                    if(check(num)){
                        if(max<num) max = num;
                        word = true;
                    }

                }
            }

            if(word){
                System.out.println("#"+tc + " " + max);
            }else{
                System.out.println("#"+tc + " " +"-1");
            }




        }
    }
}
