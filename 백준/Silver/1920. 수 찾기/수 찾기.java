
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    public static boolean BinarySearch(int number,int n){
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = (start + end )/2;
            if(number>arr[mid]){
                start = mid + 1;
            }else if(number<arr[mid]){
                end = mid -1;
            }else if(number == arr[mid]){
                return true;
            }

        }

        return false;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Arrays.sort(arr);

        for(int i=0;i<m;i++){
            int tmp = Integer.parseInt(st.nextToken());
            if(BinarySearch(tmp,n)){
                sb.append("1");
                sb.append("\n");
            }else{
                sb.append("0");
                sb.append("\n");

            }

        }

        System.out.println(sb);

    }
}
