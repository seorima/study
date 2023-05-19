
import java.util.Scanner;

public class Solution {
    static int cnt,max;
    static String[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();

        for(int tc=1;tc<=T;tc++){

            arr=sc.next().split("");
            cnt=sc.nextInt();

            max=Integer.MIN_VALUE;

            if(arr.length < cnt) {	// swap 횟수가 자릿수보다 클 때
                cnt = arr.length;	// 자릿수만큼만 옮겨도 전부 옮길 수 있음
            }

            dfs(0);

            System.out.println("#"+tc+" "+max);

        }

    }

    public static void dfs(int count){
        if(count==cnt){
            String result = "";
            for(String x : arr){
                result+=x;
            }
            max=Math.max(max,Integer.parseInt(result));
            return;
        }

        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                String tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;

                dfs(count+1);

                tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
            }
        }

    }
}
