
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static long solution(long[] arr,int n){
        int max = 0;
        long key = 0;
        HashMap<Long,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

            if(map.get(arr[i]) > max){
                max = map.get(arr[i]);
                key = arr[i];

            }else if(map.get(arr[i]) == max){
                key = Math.min(key,arr[i]);
            }
        }

        return key;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr = new long[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
        }

        System.out.println(solution(arr,n));

    }
}
